package Controlador.Academico.StaffAcademico;

import org.orm.PersistentException;

import Controlador.Persona.*;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Estudiante extends Persona {

	private static final int ROW_COUNT = 100;

	public Estudiante(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
	}
	
	public Estudiante(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	
	/**
	 * este método agrega un nuevo estudiante en la base de datos
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param clave
	 * @param rutAPoderado
	 * @return String mensaje de confirmación
	 */
	public static String agregarNuevoEstudiante(String nombre, String apellido, String rut, String clave, String rutApoderado) {
		
		Persona nuevaPersona = new Persona (nombre, apellido, rut, clave);
		
		try {
			//se busca que la persona no se haya registrado antes
			String condicionPersona = "rut='" + nuevaPersona.getRut()+ "'";
			orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
			
			//se busca el que apoderado exista
			String condicionApoderado = "persona.rut='" + rutApoderado + "'";
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(condicionApoderado, null);

			//si los datos son validos y existe Estudiante y Apoderado
			if ((nuevaPersona.validarAtributos())&&(lormPersonaBuscar==null)&&(lormApoderado!=null)) {
				
				//se crea la persona, se setean sus valores y se guardan los cambios
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				lormPersona.setNombre(nuevaPersona.getNombre());
				lormPersona.setApellido(nuevaPersona.getApellido());
				lormPersona.setRut(nuevaPersona.getRut());
				lormPersona.setPass(nuevaPersona.getPass());
				orm.PersonaDAO.save(lormPersona);
				
				//se crea el estudiante y se setea persona
				orm.Estudiante lormEstudiante = orm.EstudianteDAO.createEstudiante();
				
				lormEstudiante.setPersona(lormPersona);
				lormEstudiante.setApoderado(lormApoderado);
				orm.EstudianteDAO.save(lormEstudiante);
			
				
				// Crear matricula
				orm.Matricula lormMatricula = orm.MatriculaDAO.createMatricula();

				lormMatricula.setEstudiante(lormEstudiante);
				lormMatricula.setEstadoMatricula(0);
				lormMatricula.setMonto(0);
				orm.MatriculaDAO.save(lormMatricula);
				
				// Crear las 10 Mensualidades
				for(int i=0;i<10;i++){
					orm.Mensualidad lormMensualidad = orm.MensualidadDAO.createMensualidad();
					lormMensualidad.setMes(i+1);
					lormMensualidad.setMonto(0);
					lormMensualidad.setEstudiante(lormEstudiante);
					orm.MensualidadDAO.save(lormMensualidad);
				}
				return "Se ingreso nuevo alumno correctamente";

			}else{
				return "No se pudo guardar al estudiante";
			}
	} catch (PersistentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

	public void inscribirAlumnos() {
		// TODO - implement Estudiante.inscribirAlumnos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rut
	 */
	public static String[] buscarEstudiate(String rut) {	
		
				try {
					
					//se busca el estudiante
					String condicionEstudiante = "persona.rut='" + rut + "'";
					orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEstudiante, null);
					
					// Si el estudiante especificado existe
					//se almacenan su datos (estadoMatricula,id,nombre, apellido,rut, nombre y apellido del apoderado)
					//y se retorna la matriz
					if (lormEstudiante != null) {
						String arreglo[]=new String[8];
						arreglo[0]=""+lormEstudiante.getMatricula().getEstadoMatricula();
						arreglo[1]=""+lormEstudiante.getId();
						arreglo[2]=lormEstudiante.getPersona().getNombre();
						arreglo[3]=lormEstudiante.getPersona().getApellido();
						arreglo[4]=lormEstudiante.getPersona().getRut();
						arreglo[5]=lormEstudiante.getPersona().getPass();
						arreglo[6]=lormEstudiante.getPersona().getApoderado().getPersona().getNombre();
						arreglo[7]=lormEstudiante.getPersona().getApoderado().getPersona().getApellido();
						System.out.println("|id: "+arreglo[1]+" |nombre: "+arreglo[2]+" |Apellido: "+arreglo[3]+" |Matricula: "+arreglo[0]);
						
					return arreglo;

					} else {
						return null;
					}
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}
	
	/**
	 * este método calcula el promedio del estudiante
	 * @param rutEstudiante
	 * @return double promedio final
	 */
	public static double obtenerPromedioGeneral(String rutEstudiante){
		double promedio = 0, sumatoria = 0;	
		boolean valorNulo = false;
		try {			
			//se busca al estudiante
			String condicionEst = "persona.rut='" + rutEstudiante	+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEst, null);
			
			if(lormEstudiante!=null){//estudiante existe
				
				//se buscan todos los cursos del estudiante
				String condicionEst_curso = "estudiante='" + lormEstudiante	+ "'";
				orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionEst_curso, null);
				
				//se recorren los cursos del estudiante y se obtiene el promedio de ese curso
				int length = ormEstudiante_cursos.length;	
					for (int i = 0; i < length; i++) {
						if(ormEstudiante_cursos[i].getPromedio()==null){
							//si se encuentra un curso que no tenga registrada la nota termina el proceso retornando 0
							valorNulo = true;
							break;
						} else {
							//se suman todas las notas
							sumatoria += ormEstudiante_cursos[i].getPromedio();
						}			
					} 			
					if (valorNulo){
						promedio = 0;
					} else{
						//se calcula el promedio
						promedio = sumatoria/ormEstudiante_cursos.length;
					}
				}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return promedio;
	}

	/**
	 * este método calcula el porcentaje de asistencia de cierto estudiante
	 * @param rutEstudiante
	 * @return double porcentaje de asistencia
	 */
	public static double obtenerPorcentajeAsistencia(String rutEstudiante){
		double promedioAsistencia = 0, sumatoria = 0;	
		try {	
			//se busca al estudiante 
			String condicionEst = "persona.rut='" + rutEstudiante	+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEst, null);
			
			if(lormEstudiante!=null){
				String condicionEst_curso = "estudiante='" + lormEstudiante	+ "'";
				orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionEst_curso, null);
			
			//se buscan todos los curso del estudiante y se obtiene el porcentaje de asistencia
			int length =  ormEstudiante_cursos.length;
				for (int i = 0; i < length; i++) {
					if(ormEstudiante_cursos[i].getPorcAsistencia()==null){
						//si el porcentaje es null se asigan 0
						sumatoria += 0;
					}else {
						sumatoria += ormEstudiante_cursos[i].getPorcAsistencia();
					}
				}
				//se calcula el promedio de asistencia
				promedioAsistencia = sumatoria/ormEstudiante_cursos.length;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return promedioAsistencia;
	}
	
	/**
	 * este método consulta el promedio y la asistencia del Estudiante
	 * @param rutEstudiante
	 * @return String mensaje con datos
	 */
	public static String obtenerSituacionEstudiante(String rutEstudiante){
		
		try {
			String persExiste = "persona.rut='" + rutEstudiante	+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(persExiste, null);
			if (lormEstudiante!=null){
				double asistencia = obtenerPorcentajeAsistencia(rutEstudiante);
				double promedio = obtenerPromedioGeneral(rutEstudiante);
				if (promedio==0){
					return "Faltan promedios en curso";
				} 
				promedio = ((int)(promedio * 10)/10.0);
				asistencia = ((int)(asistencia * 10)/10.0);
				return "El promedio es: " + promedio + "\nLa asistencia es: " + asistencia + "%";
			} else {
				return "el rut del estudiante no existe";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}