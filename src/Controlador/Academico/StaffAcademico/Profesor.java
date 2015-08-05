package Controlador.Academico.StaffAcademico;

import org.orm.PersistentException;

import Controlador.Academico.Curso;
import Controlador.Persona.*;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Profesor extends Persona {

	public Profesor(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
	}
	
	public Profesor(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	
	public Profesor(){
		super();
	}
	
	/**
	 * este método agrega un nuevo profesor a la base de datos y crea sus diez sueldos en estado no pagados
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param pass
	 * @return String mensaje de confirmación
	 */
	public static String agregarNuevoProfesor(String nombre, String apellido, String rut, String pass) {
		Persona nuevaPer = new Persona(nombre, apellido, rut, pass);
		try {
			if (nuevaPer.validarAtributos()) {
			// Se busca la persona
			String condicionPersona = "rut='" + nuevaPer.getRut() + "'";
			orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
			// Si la persona no existe
			if (lormPersonaBuscar == null) {
				
				//se crea lormPersona y se setan los valores
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				lormPersona.setNombre(nuevaPer.getNombre());
				lormPersona.setApellido(nuevaPer.getApellido());
				lormPersona.setRut(nuevaPer.getRut());
				lormPersona.setPass(nuevaPer.getPass());
				orm.PersonaDAO.save(lormPersona);
				
				//se crea el profesor y se setea lormPersona
				orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
				lormProfesor.setPersona(lormPersona);
				orm.ProfesorDAO.save(lormProfesor);
				
				//se crean los 10 sueldos del profesor y se setea cantCursos, estadoPAgo,mes, monto y se guarda
				for(int i=0;i<10;i++){
					orm.Sueldo lormSueldo = orm.SueldoDAO.createSueldo();
					lormSueldo.setProfesor(lormProfesor);
					lormSueldo.setCantCursos(0);
					lormSueldo.setEstadoPago(0);
					lormSueldo.setMes(i+1);
					lormSueldo.setMonto(0);
					orm.SueldoDAO.save(lormSueldo);				
				}	
				return "Profesor ingresado exitosamente";
				
			} else {
				return "Esta persona ya existe";
			}
				
			}else{
				return "Atributo no valido";
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Update the properties of the persistent object
		return null;
	}

	/**
	 * este método busca a un profesor y retorna un arreglo con sus datos
	 * @param rut del profesor
	 * @return String[]
	 */
	public static String[] buscarProfesor(String rut) {
		String[] datos= new String[4];
	
			try {
				//se busca el profesor
				String rutProfesor = "persona.rut='" + rut + "'";
				orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(rutProfesor, null);
				if (lormProfesor != null) {
					//se almacenan los datos del profesor en el arrego
					datos[0]=""+lormProfesor.getPersona().getNombre();
					datos[1]=""+lormProfesor.getPersona().getApellido();
					datos[2]=""+lormProfesor.getPersona().getRut();
					datos[3]=""+Curso.calcularCantCursos(rut);
					return datos;
				}else{
					return null;
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}

	/**
	 * este métodoregistra el promedio de un alumno en cierto curso
	 * @param rutEst
	 * @param idCurso código curso
	 * @param nota	a registrar
	 * @return String mensaje de confirmación
	 */
	public static String registrarPromedio(String rutEst, int idCurso, String notaS, String rutProf) {
	       double nota = 0;

	        boolean esNumero = validarDouble(notaS);
	        if(esNumero==true){
	        	nota = Double.parseDouble(notaS);
	        	nota = Math.rint(nota*100)/100;
	        	
	        	try {
	    			//se busca el estudiante
	    			String conEstudiante = "persona.rut='" + rutEst+ "'";
	    			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(conEstudiante, null);
	    			
	    			//buscar la relación curso estudiante con el id del estudiante y id curso
	    			String condEstCurso = "estudiante='" + lormEstudiante+ "'"+" and curso.id='"+idCurso+"'";
	    			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condEstCurso, null);
	    		
	    			//verificar que el estudiante exista y no se le haya registrado un promedio
	    			if((lormEstudiante!=null)&&(lormEstudiante_curso!=null)&&(lormEstudiante_curso.getPromedio()==null)){
	    				String condicionCurso_profesor = "curso.id='" + idCurso + "'";
	    				orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(condicionCurso_profesor, null);
	    				
	    				//verificar que el profesor que quiere registrar el promedio sea el mismo que creo el curso
	    				if(lormCurso_profesor.getProfesor().getPersona().getRut().equals(rutProf)){
	    					lormEstudiante_curso.setPromedio(nota);
	    					orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
	    					return "promedio del curso registrado";
	    			} else {
	    				return "el profesor no corresponde";
	    			}
	    			} else {
	    				return "no se pudo registrar el primedio";
	    			}
	    		} catch (PersistentException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	        	
	            
	            
	        }else {
	        	return "el valor no es número";
	        }
		
		return null;
	}

	/**
	 * este método registra el porcentaje de asistencia de un curso
	 * @param rutEst
	 * @param idCurso código curso
	 * @param porcAsistencia
	 * @param rutProf
	 * @return String mensaje de confirmación
	 */
	public static String registrarAsistencia(String rutEst, int idCurso, String dato, String rutProf) {
	       double porcAsistencia = 0;

	        boolean esNumero = validarDouble(dato);
	        if(esNumero==true){
	        	porcAsistencia = Double.parseDouble(dato);
	        	porcAsistencia = Math.rint(porcAsistencia*100)/100;
	        	try {
	    			String conEstudiante = "persona.rut='" + rutEst+ "'";
	    			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(conEstudiante, null);
	    			
	    			//buscar la relación curso estudiante con el id del estudiante y id curso
	    			String condEstCurso = "estudiante='" + lormEstudiante+ "'"+" and curso.id='"+idCurso+"'";
	    			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condEstCurso, null);
	    		
	    			//verificar que el estudiante exista y no se le haya registrado una asistencia
	    			if((lormEstudiante!=null)&&(lormEstudiante_curso!=null)&&(lormEstudiante_curso.getPorcAsistencia()==null)){
	    				String condicionCurso_profesor = "curso.id='" + idCurso + "'";
	    				orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(condicionCurso_profesor, null);
	    				
	    				//verificar que el profesor que quiere registrar el promedio sea el mismo que creo el curso
	    				if(lormCurso_profesor.getProfesor().getPersona().getRut().equals(rutProf)){
	    					lormEstudiante_curso.setPorcAsistencia(porcAsistencia);
	    					orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
	    					return "Asistencia registrada";
	    			} else {
	    				return "el profesor no coincide";
	    			}
	    			} else {
	    				return "no se pudo ingresar el porcentaje de asistencia asignado";
	    			}
	    		} catch (PersistentException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	        } else {
	        	return "El dato ingresado no es número";
	        }
		
		
		return null;
	}
	
	public static boolean validarDouble(String dato) {
		// Si dato no es string retorna true
		if (!dato.matches("([a-z]|[A-Z]|\\s)+")) {
			return true;
		} else {
			return false;
		}
	}

}