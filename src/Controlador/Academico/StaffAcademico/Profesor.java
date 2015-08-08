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
	 * @param idCurso
	 * @param notaS
	 * @param rutProf
	 * @return
	 */
	public static String registrarPromedio(String rutEst, int idCurso, String notaS, String rutProf) {
	       double nota = 0;

	        boolean esNumero = validarDouble(notaS);
	        if(esNumero==true){
	        	nota = Double.parseDouble(notaS);
	        	nota = Math.rint(nota*100)/100;
	        	if(nota<1 && nota>7 ){
	        		return "Debe ingresar una nota entre 1.0 y 7.0";
	        	}
	        	try {
	        		//se busca el curso con ese profesor
	        		String condicionCurso = "curso.id='" + idCurso+ "'"+ "and profesor.persona.rut='" + rutProf + "'";
	    			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(condicionCurso, null);
	    			
	    			//se busca que exista el estudiante en ese curso
	    			String condEstCurso = "estudiante.persona.rut='" + rutEst + "'"+ " and curso.id='" + idCurso + "'";
					orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condEstCurso, null);  			

	    			//verificar que el estudiante exista y no se le haya registrado un promedio
	    			if(lormCurso_profesor!=null){
	    				if(lormEstudiante_curso!=null){
	    					if(lormEstudiante_curso.getPromedio()==null){
		    					lormEstudiante_curso.setPromedio(nota);
		    					orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
		    					return "promedio del curso registrado";
		    			} else if(lormEstudiante_curso.getPromedio()!=null){
		    				lormEstudiante_curso.setPromedio(nota);
	    					orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
		    				return "Promedio editado";
		    			}
	    				} else {
	    					return "El estudiante no está registrado en el curso indicado";
	    				}
	    			} else {
	    				return "El profesor no está a cargo de ese curso";
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
	        	if(porcAsistencia<=0.0 && porcAsistencia>=100 ){
	        		return "Debe ingresar un porcentaje entre 0 y 100";
	        	}
	        	try {
	        		//se busca el curso con ese profesor
	        		String condicionCurso = "curso.id='" + idCurso+ "'"+ "and profesor.persona.rut='" + rutProf + "'";
	    			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(condicionCurso, null);
	    			
	    			//se busca que exista el estudiante en ese curso
	    			String condEstCurso = "estudiante.persona.rut='" + rutEst + "'"+ " and curso.id='" + idCurso + "'";
					orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condEstCurso, null);  			

	    			//verificar que el estudiante exista y no se le haya registrado un promedio
	    			if(lormCurso_profesor!=null){
	    				if(lormEstudiante_curso!=null){
	    					if(lormEstudiante_curso.getPorcAsistencia()==null){
		    					lormEstudiante_curso.setPorcAsistencia(porcAsistencia);
		    					orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
		    					return "Porcentaje de asistencia asignado";
		    			} else if(lormEstudiante_curso.getPorcAsistencia()!=null){
		    				lormEstudiante_curso.setPorcAsistencia(porcAsistencia);
	    					orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
		    				return "Porcentaje de asistencia editado";
		    			}
	    				}else {
	    					return "El estudiante no está registrado en el curso indicado";
	    				}
	    			} else {
	    				return "El profesor no está a cargo de ese curso";
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