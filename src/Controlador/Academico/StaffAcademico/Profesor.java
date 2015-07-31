package Controlador.Academico.StaffAcademico;

import org.orm.PersistentException;

import Controlador.Academico.Curso;
import Controlador.Persona.*;

public class Profesor extends Persona {

	public Profesor(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	/**
	 * 
	 * @param NuevaPer
	 */
	public static String agregarNuevoProfesor(Persona nuevaPer,String rutAdm) {
		try {
			if (nuevaPer.validarAtributos()) {
			// Se establece una condicion de busqueda
				System.out.println("atributos validos");
			String condicionPersona = "rut='" + nuevaPer.getRut() + "'";
			String condicionAdm = "persona.rut='" + rutAdm + "'";
		    // Se asigna a la variable lormPersonaBuscar, la persona con la condicion establecida
			orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(condicionAdm, null);
			// Si la persona no existe
			if (lormPersonaBuscar == null) {
				System.out.println("la persona existe");
				// se crea un objeto orm.Persona y se cambian sus atributos por los de la Persona ingresada por parametros
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				lormPersona.setNombre(nuevaPer.getNombre());
				lormPersona.setApellido(nuevaPer.getApellido());
				lormPersona.setRut(nuevaPer.getRut());
				lormPersona.setPass(nuevaPer.getPass());
				orm.PersonaDAO.save(lormPersona);
				//una vez guardada la persona se procede a crear un objeto profesor al cual se le remplaza su objeto padre por el recien guardado
				orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
				lormProfesor.setPersona(lormPersona);
				orm.ProfesorDAO.save(lormProfesor);
				for(int i=0;i<10;i++){
					System.out.println("hola "+i);
					orm.Sueldo lormSueldo = orm.SueldoDAO.createSueldo();
					lormSueldo.setCantCursos(0);
					lormSueldo.setEstadoPago(0);
					lormSueldo.setMes(i+1);
					lormSueldo.setMonto(0);
					orm.SueldoDAO.save(lormSueldo);
					
					orm.Sueldo_profesor lormSueldo_profesor = orm.Sueldo_profesorDAO.createSueldo_profesor();
					lormSueldo_profesor.setSueldo(lormSueldo);
					lormSueldo_profesor.setProfesor(lormProfesor);
					lormSueldo_profesor.setJefeadministracion(lormJefeadministracion);
					orm.Sueldo_profesorDAO.save(lormSueldo_profesor);
					
					// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo_profesor, estadoPago, cantCursos, mes, monto
					
				}
				
				return "Profesor ingresado exitosamente";
				
			} else {
				return "El Profesor ingresado ya existe";
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

	public static String[] buscarProfesor(String rut) {
		String[] datos= new String[4];
		String rutProfesor = "persona.rut='" + rut + "'";
			// se crea una variable de busqueda
			// si el profesor existe
			orm.Profesor lormProfesor;
			try {
				lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(rutProfesor, null);
				if (lormProfesor != null) {
					datos[0]=""+lormProfesor.getPersona().getNombre();
					datos[1]=""+lormProfesor.getPersona().getApellido();
					datos[2]=""+lormProfesor.getPersona().getRut();
					datos[3]=""+Curso.calcularCantCursos(rut);
					return datos;
				}else{
					datos[0]="Persona No Encontrada";
					return datos;
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
	}

	public static String registrarPromedio(String rutEst, int idCurso, double nota) {
		try {
			String conEstudiante = "persona.rut='" + rutEst+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(conEstudiante, null);
			
			//buscar la relación curso estudiante con el id del estudiante y id curso
			String condEstCurso = "estudiante='" + lormEstudiante+ "'"+" and curso.id='"+idCurso+"'";
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condEstCurso, null);
		
			//verificar que el estudiante exista y no se le haya registrado un promedio
			if((lormEstudiante!=null)&&(lormEstudiante_curso.getPromedio()==null)){
				lormEstudiante_curso.setPromedio(nota);
				return "promedio del curso asignado";
			} else {
				return "no se pudo registrar el promedio";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String registrarAsistencia(String rutEst, int idCurso, double porcAsistencia) {
		try {
			String conEstudiante = "persona.rut='" + rutEst+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(conEstudiante, null);
			
			//buscar la relación curso estudiante con el id del estudiante y id curso
			String condEstCurso = "estudiante='" + lormEstudiante+ "'"+" and curso.id='"+idCurso+"'";
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condEstCurso, null);
		
			//verificar que el estudiante exista y no se le haya registrado una asistencia
			if((lormEstudiante!=null)&&(lormEstudiante_curso.getPorcAsistencia()==null)){
				lormEstudiante_curso.setPorcAsistencia(porcAsistencia);
				return "porcentaje de asistencia asignado";
			} else {
				return "no se pudo ingresar el porcentaje de asistencia asignado";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}