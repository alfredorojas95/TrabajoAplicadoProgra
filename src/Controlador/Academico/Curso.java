package Controlador.Academico;

import  org.orm.PersistentException;
import com.google.gson.Gson;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Curso {

	public Curso(){
		super();
	} 
	
	public Curso(String nombreCurso) {
		super();
		this.nombreCurso=nombreCurso;
	}
	
	private String nombreCurso;
	private int estadoCurso;
	private int cupos;
	//private static final int ROW_COUNT = 100;
	

	/**
	 * Este método desactiva un curso
	 * @param id (codigo del curso)
	 * @param rutDirector
	 * @return String confirmacion
	 */
	public static String desactivarCurso(int id, String rutDirector){
		
		try {
			//se buca el curso con el id
			String condicionCurso="id='"+id+"'";
			orm.Curso lormCurso=orm.CursoDAO.loadCursoByQuery(condicionCurso, null);
			
			//se busca el director con su rut
			String condicionDirector = "persona.rut='" + rutDirector + "'";
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(condicionDirector, null);
			
			//se verifica que el curso y el director existan 
			if((lormCurso!=null)&&(lormDirector!=null)){
				//el estado "1" representa que el curso está activado
				if(lormCurso.getEstadocurso()==1){
					lormCurso.setEstadocurso(0);
					lormCurso.setDirector(lormDirector);
					lormCurso.setJefeadministracion(null);
					orm.CursoDAO.save(lormCurso);//se desactiva el curso
					
					//se busca al profesor asignado a al curso
					orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(condicionCurso, null);
					
					orm.Curso_profesorDAO.delete(lormCurso_profesor);//se elimina la asignacion de ese profesor
					actualizarCambios(lormCurso_profesor.getProfesor().getPersona().getRut());//se busca la nueva cantidad de cursos
					
					//se buscan todos los estudiantes que estaban inscritos en ese curso 
					orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionCurso, null);
					
					if(ormEstudiante_cursos!=null){//si la cantdad es distinta de cero, se recorre el arreglo y se elimina la asignación
					int length = ormEstudiante_cursos.length;
					for (int i = 0; i < length; i++) {
						orm.Estudiante_cursoDAO.delete(ormEstudiante_cursos[i]);
						actualizarCambios(ormEstudiante_cursos[i].getEstudiante().getPersona().getRut());//se busca la nueva cantidad de cursos del alumno
					}
					}
					return "Curso desactivado Exitosamente";
				} else {
					return "El curso ya se encontraba desactivado";
				}
			} else {
				return "Curso o director no existenten";
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Este método crea un nuevo curso en la base de datos
	 * pasando por parámetros el nombre del curso y el rut del jefe de administración que lo crea.
	 * @param nombreCurso
	 * @param rutJefeAdm
	 * @return String confirmacion curso creado o no ¿?
	 */
	public static String crearCurso(String nombreCurso, String rutJefeAdm) {
		Curso nuevoCurso = new Curso(nombreCurso);
		try {
			//condicion de busqueda para validar que exista el jefe de administracion
			String condicion= "persona.rut='"+rutJefeAdm+"'";
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(condicion, null);
			
			if (lormJefeadministracion!=null){
				
			/**
			 * si existe el jefe se crea el curso, se le setea el nombre
			 * el jefe de administración, estado curso, cantidad de cupos y se guarda
			 */
			orm.Curso lormCurso = orm.CursoDAO.createCurso();
			lormCurso.setNombreCurso(nuevoCurso.getNombreCurso());
			lormCurso.setJefeadministracion(lormJefeadministracion);
			lormCurso.setEstadocurso(1);
			lormCurso.setCupos(40);
			orm.CursoDAO.save(lormCurso);
			
			return "se creó el curso exitosamente";
			}else{
				return "Jefe de Administracion inválido";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * este método actualiza la cantidad de cursos del profesor o alumno y los guarda
	 * @param rut
	 */
	public static void actualizarCambios(String rut){
		try {
			//se busca la persona para identificar si es Estudiante o Profesor
			String condicion = "persona.rut='" + rut + "'";

			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(condicion, null);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicion, null);
			
			if (lormProfesor != null) {//si es profesor se buscan todos sus sueldos con el estado pagado (0) 
				
				String condSueldoProf = "profesor='" + lormProfesor+ "' "+"and estadoPago='"+0+ "' ";
				orm.Sueldo[] ormSueldos = orm.SueldoDAO.listSueldoByQuery(condSueldoProf, null);
				int length =ormSueldos.length;
				int cantidad = Curso.calcularCantCursos(rut);
				for (int i = 0; i < length; i++) {
							
					ormSueldos[i].setCantCursos(cantidad);
					ormSueldos[i].setMonto(ormSueldos[i].getCantCursos() * 100000);
					orm.SueldoDAO.save(ormSueldos[i]);
				}
			} else if (lormEstudiante != null) {//si es Estudiante se buscan todas sus mensualidades no pagadas
				String condicionEst = "estudiante='" +lormEstudiante+ "' "+"and monto='"+0+ "' ";
				 orm.Mensualidad[] ormMensualidads = orm.MensualidadDAO.listMensualidadByQuery(condicionEst, null);
				 int length =/* Math.min(*/ormMensualidads.length/*, ROW_COUNT)*/;
				 int cant=calcularCantCursos(rut);
				for (int i = 0; i < length; i++) {
					ormMensualidads[i].setCantCursos(cant);//se actualiza la cantidad de cursos
					orm.MensualidadDAO.save(ormMensualidads[i]);
				}			
			} 
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * método que permite asignarle un profesor al curso creado, la condicion
	 * para esto es que el código del curso (id) exista y que el profesor exista
	 * @param id
	 * @param rutProfe
	 * @param rutJefeAdm
	 * @return String mensaje de confirmacion
	 */
	public static String asignarProfesor(int id, String rutProfe,String rutJefeAdm ) {

		try {
			//obtener el nombre del curso con el "id"
			String condicionCurso = "id='" + id + "'";
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(condicionCurso,	null);
			
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
			 * profesor y jefeAdm existen.
			 * el curso existe , no tiene ningun profesor asignado y su estado es activo
			 */
			
			if ((lormProfesor != null)&&(lormJefeadministracion!=null)&&(condicionCurso!=null)&&(lormCurso_profesor2==null)&&(lormCurso.getEstadocurso()!=0)) {
				orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.createCurso_profesor();
				
				lormCurso_profesor.setCurso(lormCurso);
				lormCurso_profesor.setProfesor(lormProfesor);
				orm.Curso_profesorDAO.save(lormCurso_profesor);
				actualizarCambios(rutProfe);
								
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

	/**
	 * 
	 * @return
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombreCurso = nombre;
	}
	
	/**
	 * este método inscribe a un estudiante en un curso
	 * @param idCurso
	 * @param rutEstudiante
	 * @return String
	 */
	public static String  inscribirEstudiantes(int idCurso, String rutEstudiante, String rutProf) {
			try {
				//se busca que exista el curso asignado a ese profesor
				String condicionCurso = "curso.id='" + idCurso+ "' "+ "and profesor.persona.rut='" + rutProf + "'";
				orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(condicionCurso, null);
				
				String condicionEstCurso = "curso.id='" + idCurso+ "' "+ "and estudiante.persona.rut='" + rutEstudiante + "'";
				orm.Estudiante_curso lormEstudiante_cursoA = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(condicionEstCurso, null);
				
				if (lormCurso_profesor != null) {//curso asignado a ese profesor existe
					
					orm.Curso lormCurso = lormCurso_profesor.getCurso();//se busca el curso
					
					//se busca el estudiante
					String condicionEstudiante = "persona.rut='" + rutEstudiante+ "'";
					orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEstudiante, null);
					
					if (lormEstudiante != null) {//estudiante existe
						if(lormEstudiante_cursoA==null){//el estudiante no está en ese curso
							if (lormCurso.getEstadocurso() == 1){//curso activo
								if(lormCurso.getCupos() > 0){//curso con cupos
									//se crea la relacion estudiante curso
									orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.createEstudiante_curso();
									lormEstudiante_curso.setCurso(lormCurso);
									lormEstudiante_curso.setEstudiante(lormEstudiante);
									lormCurso.setCupos(lormCurso.getCupos() - 1);
									actualizarCambios(rutEstudiante);//se actualizan los corsos del estudiante
									orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
									return "alumno asignado";
								} else {
									return "No quedan cupos en este curso";
								}
							} else {
								return "El curso está desactivado";
							}
						}else{
							return "Este estudiante ya había sido asignado a este curso";
						}
					} else {
						return "El estudiante no existe";
					}				
				} else {
					return "No existe relacion entre el profesor y el curso";
				}						
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

	/**
	 * este método busca un curso con su código que entrega sus datos en un arreglo
	 * @param idCurso
	 * @return String[] cn datos del curso
	 */
	public static String[] buscarCurso(int idCurso) {
		
		try {
			//se busca el curso
			String condicionCurso = "id='" + idCurso + "'";
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(condicionCurso,null);
			
			//si el curso existe se guardan sus datos (cupos, estadoCurso,nombreCurso) 
			//y se almacenan en un arreglo que será retornado
			if (lormCurso != null) {
				String cup = "" + lormCurso.getCupos();
				String est = "" + lormCurso.getEstadocurso();
				String nom = lormCurso.getNombreCurso();
				String[] datos = { nom, est, cup };
				System.out.println("|nombre: "+nom+" |Estado: "+est+" |Cupos: "+cup);
				return datos;
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
	 * este método busca los cursos de una persona
	 * ya sea estudiante o profesor
	 * @param rut
	 * @return
	 */
	public static String bucarCursos(String rut){
		
		String matriz[][];
		Gson gson = new Gson();
		String cursos=null;
		
		try {
			//se identifica a que persona corresponde el rut
			String condicion = "persona.rut='" + rut + "'";
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(condicion, null);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicion, null);
			
			if (lormProfesor != null) {//si el rut pertenece al profesor 
				System.out.println("profesor: "+lormProfesor.getPersona().getNombre());
				
				//se buscan los cursos del profesor
				String condicionCurProf = "profesor='" + lormProfesor + "'";
				orm.Curso_profesor[] ormCurso_profesors = orm.Curso_profesorDAO.listCurso_profesorByQuery(condicionCurProf, null);
				
				int length = ormCurso_profesors.length; //Math.min(ormCurso_profesors.length, ROW_COUNT);
				matriz = new String [length][4];
				
				//se recorren todoss cursos que tiene el profesor
				for (int i = 0; i < length; i++) {
					//se almacena los datos del curso en la matriz (id, nombreCurso,estadoCurso,cantCupos)
					matriz[i][0]=""+ormCurso_profesors[i].getCurso().getId();
					matriz[i][1]=ormCurso_profesors[i].getCurso().getNombreCurso();
					matriz[i][2]=""+ormCurso_profesors[i].getCurso().getEstadocurso();
					matriz[i][3]=""+ormCurso_profesors[i].getCurso().getCupos();
					System.out.println("|id: "+matriz[i][0]+" |nombre: "+matriz[i][1]+" |Estado: "+matriz[i][2]+" |Cupos: "+matriz[i][3]);
				}
				cursos = gson.toJson(matriz);
				return cursos;
				//se buscan los cursos del estudiante
			} else if (lormEstudiante != null) {
				System.out.println("estudiante: "+lormEstudiante.getPersona().getNombre());
				
				//se buscan todos los cursos del estudiante
				String condicionCurEst = "estudiante='" + lormEstudiante + "'";
				orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionCurEst, null);
				int length = ormEstudiante_cursos.length; //Math.min(ormEstudiante_cursos.length, ROW_COUNT);
				matriz = new String [length][4];
				
				//se recorren todos los curso de estudiante
				for (int i = 0; i < length; i++) {
					//se guardan los datos del curso(id, nombreCurso,estadoCurso,cantCupos) en la matriz
					matriz[i][0]=""+ormEstudiante_cursos[i].getCurso().getId();
					matriz[i][1]=ormEstudiante_cursos[i].getCurso().getNombreCurso();
					matriz[i][2]=""+ormEstudiante_cursos[i].getPromedio();
					matriz[i][3]=""+ormEstudiante_cursos[i].getPorcAsistencia();
					System.out.println("|id: "+matriz[i][0]+" |nombre: "+matriz[i][1]+" |Promedio: "+matriz[i][2]+" |Asistencia: "+matriz[i][3]);
				}
				cursos = gson.toJson(matriz);
				return cursos;
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
	 * este método calcula la cantidad de cursos del profesor o estudiante
	 * @param rut
	 * @return String con la cantidad de cursos
	 */
	public static int calcularCantCursos(String rut) {
		try {
			//se busca al profesor o al estudiante
			String condicion= "persona.rut='"+rut+"'";
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(condicion, null);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicion, null);
			
			//si el rut pertenece al profesor se buscan todos los cursos del profesor y se retorna la cantidad
			if (lormProfesor!=null){
				String condicionCurProf= "profesor='" + lormProfesor + "'"+ " and curso.estadocurso='" + 1 + "'";
				orm.Curso_profesor[] ormCurso_profesors = orm.Curso_profesorDAO.listCurso_profesorByQuery(condicionCurProf, null);
				return ormCurso_profesors.length;
				
				//si el rut pertenece a un estudiante, se buscan todos sus cursos y se retorna la cantidad
			}else if(lormEstudiante!=null) {
				String condicionCurEst= "estudiante='" + lormEstudiante + "'"+ " and curso.estadocurso='" + 1 + "'";
				orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(condicionCurEst, null);
				return ormEstudiante_cursos.length;
				
			}else{
				return 0;
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}