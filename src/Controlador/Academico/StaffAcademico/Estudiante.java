package Controlador.Academico.StaffAcademico;

import org.orm.PersistentException;

import Controlador.Persona.*;

public class Estudiante extends Persona {

	private static final int ROW_COUNT = 100;

	public Estudiante(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	
	/**
	 * 
	 * @param nuevaPer
	 * @param rut
	 */
	public static String agregarNuevoEstudiante(Persona nuevaPersona, String rutSecretaria) {
		try {
			// Condicion de busqueda de la secretaria
			if (nuevaPersona.validarAtributos()) {
			String condicionSecretaria = "persona.rut='" + rutSecretaria+ "'";
			// Asignar secretaria con el rut especificado
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(condicionSecretaria, null);
			if (lormSecretaria != null) {
				
				// Se establece una condicion de busqueda
				String condicionPersona = "rut='" + nuevaPersona.getRut()
						+ "'";
				// Se asigna a la variable lormPersonaBuscar, la persona con
				// la condicion establecida
				orm.Persona lormPersonaBuscar = orm.PersonaDAO
						.loadPersonaByQuery(condicionPersona, null);
				// Si la persona no existe
				if (lormPersonaBuscar == null) {
					// Crear nueva persona
					orm.Persona lormPersona = orm.PersonaDAO
							.createPersona();
					// Enviar valores a persona encontrados en el objeto
					// Persona
					// recibido por parametro, setea y guarda los datos nuevos
					lormPersona.setNombre(nuevaPersona.getNombre());
					lormPersona.setApellido(nuevaPersona.getApellido());
					lormPersona.setRut(nuevaPersona.getRut());
					lormPersona.setPass(nuevaPersona.getPass());
					orm.PersonaDAO.save(lormPersona);

					// Crear un nuevo estudiante
					orm.Estudiante lormEstudiante = orm.EstudianteDAO
							.createEstudiante();
					
					lormEstudiante.setPersona(lormPersona);
					orm.EstudianteDAO.save(lormEstudiante);

					// Crear matricula
					orm.Matricula lormMatricula = orm.MatriculaDAO
							.createMatricula();
					// Enviar cambia y guarda la matricula
					lormMatricula.setEstudiante(lormEstudiante);
					lormMatricula.setSecretaria(lormSecretaria);
					lormMatricula.setEstadoMatricula(0);
					lormMatricula.setMonto(0);
					orm.MatriculaDAO.save(lormMatricula);
					
					// Crear las 10 Mensualidades
					
					for(int i=0;i<10;i++){
						orm.Mensualidad lormMensualidad = orm.MensualidadDAO.createMensualidad();
						lormMensualidad.setMes(i+1);
						lormMensualidad.setMonto(0);
						lormMensualidad.setEstudiante(lormEstudiante);
						lormMensualidad.setSecretaria(lormSecretaria);
						orm.MensualidadDAO.save(lormMensualidad);
					}
					
					// Si todo se hace de manera correcta se retorna mensaje
					return "Se ingreso nuevo alumno correctamente";
				} else {
					return "La persona ya existe";
				}

			} else {
				return "La secretaria ingresada no existe";
			}
			}else{
				return "Atributo invalido";
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
	public static orm.Estudiante buscarEstudiate(String rut) {
		// Condicion de busqueda de el estudiante
				String condicionEstudiante = "persona.rut='" + rut + "'";
				orm.Estudiante lormEstudiante = null;
				try {
					// Asignar estudiante con el rut especificado
					lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(
							condicionEstudiante, null);
					// Si el estudiante especificado existe, se puede proceder
					if (lormEstudiante != null) {
						return lormEstudiante;

					} else {
						return null;
					}
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}

	public static double obtenerPromedioGeneral(String rutEstudiante){
		double promedio = 0, sumatoria = 0;	
		orm.Estudiante_curso[] ormEstudiante_cursos = null;
		try {			
			String condicionEst = "persona.rut='" + rutEstudiante	+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEst, null);
			
			if(lormEstudiante!=null){
				String condicionEst_curso = "estudiante='" + lormEstudiante	+ "'";
			ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionEst_curso, null);
			
			int length = Math.min(ormEstudiante_cursos.length, ROW_COUNT);
				for (int i = 0; i < length; i++) {
					if(ormEstudiante_cursos[i].getPromedio()==null){
						promedio = 0;
						break;
					} else {
						sumatoria += ormEstudiante_cursos[i].getPromedio();
					}
					
				}
				
				promedio = sumatoria/ormEstudiante_cursos.length;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return promedio;
	}
	
	public static double obtenerPorcentajeAsistencia(String rutEstudiante){
		double promedioAsistencia = 0, sumatoria = 0;	
		orm.Estudiante_curso[] ormEstudiante_cursos = null;
		try {			
			String condicionEst = "persona.rut='" + rutEstudiante	+ "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEst, null);
			
			if(lormEstudiante!=null){
				String condicionEst_curso = "estudiante='" + lormEstudiante	+ "'";
			ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionEst_curso, null);
			
			int length = Math.min(ormEstudiante_cursos.length, ROW_COUNT);
				for (int i = 0; i < length; i++) {
					if(ormEstudiante_cursos[i].getPorcAsistencia()==null){
						ormEstudiante_cursos[i].setPorcAsistencia(0);
						sumatoria += ormEstudiante_cursos[i].getPorcAsistencia();
					}					
				}
				
				promedioAsistencia = sumatoria/ormEstudiante_cursos.length;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return promedioAsistencia;
	}
	
	public static String obtenerSituacionEstudiante(String rutEstudiante){
		double asistencia = obtenerPorcentajeAsistencia(rutEstudiante);
		double promedio = obtenerPromedioGeneral(rutEstudiante);
		if (promedio==0){
			return "Faltan promedios en curso";
		} 
		return "El promedio es: " + promedio + " La asistencia es: " + asistencia;
	}
}