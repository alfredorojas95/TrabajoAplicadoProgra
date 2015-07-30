package Controlador.Academico;

import org.orm.PersistentException;

public class Curso {

	private String nombreCurso;
	private int estadoCurso;
	private int cupos;
	private static final int ROW_COUNT = 100;
	
	public Curso() {
		super();
	}

	public static String desactivarCurso(int id){
		String condicion="id='"+id+"'";
		try {
			orm.Curso lormCurso=orm.CursoDAO.loadCursoByQuery(condicion, null);
			
			if(lormCurso!=null){
				if(lormCurso.getEstadocurso()==1){
					lormCurso.setEstadocurso(0);
					orm.CursoDAO.save(lormCurso);
					return "Curso desactivado Exitosamente";
				}
				return "Curso Desactivado";
			}
			return "Curso no existente";
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String crearCurso(Curso nuevoCurso, String rutDir) {
		try {
			/**
			 * Crea un objeto orm.Curso para despues guardarlo en la base
			 * de datos
			 */
			String condicion= "persona.rut='"+rutDir+"'";
			orm.Director lormDirector= orm.DirectorDAO.loadDirectorByQuery(condicion, null);
			if (lormDirector!=null){
			orm.Curso lormCurso = orm.CursoDAO.createCurso();
			lormCurso.setNombreCurso(nuevoCurso.getNombreCurso());
			lormCurso.setDirector(lormDirector);
			lormCurso.setEstadocurso(1);
			lormCurso.setCupos(40);
			orm.CursoDAO.save(lormCurso);
			return "se creo el curso exitosamente";
			}else{
				return "Director no valido";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * método que permite asignarle un profesor al curso creado, la condicion
	 * para esto es que el código del curso (id) exista y que el profesor exista
	 */
	public static String asignarProfesor(int id, String nombreCurso,String rutProfe,String rutJefeAdm ) {
		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving : sueldo,
		// profesor, curso
		try {
			//obtener el nombre del curso con el "id"
			String condicionCurso = "id='" + id + "'";
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(condicionCurso,	null);
			String nom = lormCurso.getNombreCurso();
			
			//verificar que el jefe de administración exista
			String condicionJefeAd = "persona.rut='" + rutJefeAdm + "'";
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(condicionJefeAd, null);
			
			//verificar que el profesor exista
			String rutProfesor = "persona.rut='" + rutProfe + "'";
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(rutProfesor, null);
			int idProf = lormProfesor.getId();
			
			/*
			 * verificar que el mismo curso no se le asigne a dos profesores
			 * si no se encuentra el curso en la tabla curso_Profesor quiere decir que no se le ha asignado
			 * nada hasta el momento es decir es nulo y se le puede asignar un profesor
			 */
			String conCur_Prof = "curso.id='" + id + "'";
			orm.Curso_profesor lormCurso_profesor2 = orm.Curso_profesorDAO.loadCurso_profesorByQuery(conCur_Prof, null);
			
			/*
			 * si el nombre que se pasó con por parámetros conside con el nombre obtenido 
			 * a treavés del id, el nombre del curso existe y el profesor existe
			 * se crea un objeto lormCurso y se le setean el curso y el profesor.
			 * Finalmente se guarda y retorna el valor
			 */
			
			if ((nom.equals(nombreCurso))&& (lormProfesor != null)&&(lormCurso_profesor2==null)&&(lormJefeadministracion!=null)) {
				orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.createCurso_profesor();
				lormCurso_profesor.setCurso(lormCurso);
				lormCurso_profesor.setProfesor(lormProfesor);
				orm.Curso_profesorDAO.save(lormCurso_profesor);
				
				String condSueldoProf = "profesorId='" + idProf + "'";
				orm.Sueldo_profesor[] ormSueldo_profesors = orm.Sueldo_profesorDAO.listSueldo_profesorByQuery(condSueldoProf, null);
				
				int length = Math.min(ormSueldo_profesors.length, ROW_COUNT);
				for (int i = 0; i < length; i++) {
					if(ormSueldo_profesors[i].getSueldo().getEstadoPago()==0){
						String cantidad=calcularCantCursos(rutProfe);
						
						if(cantidad!=null){
							int cant=Integer.parseInt(cantidad);
							ormSueldo_profesors[i].getSueldo().setCantCursos(cant);
						ormSueldo_profesors[i].getSueldo().setMonto(ormSueldo_profesors[i].getSueldo().getCantCursos()*100000);
						orm.Sueldo_profesorDAO.save(ormSueldo_profesors[i]);
						}
					}
					
				}
				
				return "profesor asignado";
			} else {
				return "no se pudo asignar el profesor";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombre(String nombre) {
		this.nombreCurso = nombre;
	}
	
	public static String  inscribirEstudiantes(int idCurso, String rutEstudiante) {
		try {
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.createEstudiante_curso();

			String condicionCurso = "id='" + idCurso + "'";
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(condicionCurso,	null);

			String condicionEstudiante = "persona.rut='" + rutEstudiante + "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEstudiante, null);

			//curso existe, estudiante existe, curso activo y quedan cupos
			if ((lormCurso != null) &&(lormCurso.getEstadocurso() == 1) && (lormEstudiante!= null)&&(lormCurso.getCupos() > 0)) { 

						lormEstudiante_curso.setCurso(lormCurso);
						lormEstudiante_curso.setEstudiante(lormEstudiante);

						int cupos = lormCurso.getCupos() - 1;	
						lormCurso.setCupos(cupos);
						orm.Estudiante_cursoDAO.save(lormEstudiante_curso);

						return "alumno asignado";

			} else {
				return "no se asignó el alumno";
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void buscarCurso() {
		// TODO - implement Curso.buscarCurso
		throw new UnsupportedOperationException();
	}

	public static String calcularCantCursos(String rut) {
		try {
			/**
			 * se crea arreglo de orm.Cur_profesor para buscar si el 
			 * rut ingresado pertenece a algun profesor con cursos
			 */
			String condicion= "persona.rut='"+rut+"'";
			
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(condicion, null);
			
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicion, null);
			if (lormProfesor!=null){
				String condicionCurProf= "profesor='"+lormProfesor+ "'" + " and curso.estadocurso='" + 1 + "'";
				orm.Curso_profesor[] ormCurso_profesors = orm.Curso_profesorDAO.listCurso_profesorByQuery(condicionCurProf, null);
				return ""+ormCurso_profesors.length;
			}else if(lormEstudiante!=null) {
				String condicionCurEst= "estudiante='"+lormEstudiante+ "'" + " and curso.estadocurso='" + 1 + "'";
				orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionCurEst, null);
				return ""+ormEstudiante_cursos.length;
			}else{
				return null;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}