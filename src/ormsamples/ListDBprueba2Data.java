/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListDBprueba2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Director...");
		orm.Director[] ormDirectors = orm.DirectorDAO.listDirectorByQuery(null, null);
		int length = Math.min(ormDirectors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirectors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sueldo...");
		orm.Sueldo[] ormSueldos = orm.SueldoDAO.listSueldoByQuery(null, null);
		length = Math.min(ormSueldos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormSueldos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Profesor...");
		orm.Profesor[] ormProfesors = orm.ProfesorDAO.listProfesorByQuery(null, null);
		length = Math.min(ormProfesors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProfesors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Jefeadministracion...");
		orm.Jefeadministracion[] ormJefeadministracions = orm.JefeadministracionDAO.listJefeadministracionByQuery(null, null);
		length = Math.min(ormJefeadministracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormJefeadministracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso_profesor...");
		orm.Curso_profesor[] ormCurso_profesors = orm.Curso_profesorDAO.listCurso_profesorByQuery(null, null);
		length = Math.min(ormCurso_profesors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCurso_profesors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso...");
		orm.Curso[] ormCursos = orm.CursoDAO.listCursoByQuery(null, null);
		length = Math.min(ormCursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estudiante_curso...");
		orm.Estudiante_curso[] ormEstudiante_cursos = orm.Estudiante_cursoDAO.listEstudiante_cursoByQuery(null, null);
		length = Math.min(ormEstudiante_cursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstudiante_cursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estudiante...");
		orm.Estudiante[] ormEstudiantes = orm.EstudianteDAO.listEstudianteByQuery(null, null);
		length = Math.min(ormEstudiantes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstudiantes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Secretaria...");
		orm.Secretaria[] ormSecretarias = orm.SecretariaDAO.listSecretariaByQuery(null, null);
		length = Math.min(ormSecretarias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormSecretarias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Matricula...");
		orm.Matricula[] ormMatriculas = orm.MatriculaDAO.listMatriculaByQuery(null, null);
		length = Math.min(ormMatriculas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMatriculas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensualidad...");
		orm.Mensualidad[] ormMensualidads = orm.MensualidadDAO.listMensualidadByQuery(null, null);
		length = Math.min(ormMensualidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMensualidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Apoderado...");
		orm.Apoderado[] ormApoderados = orm.ApoderadoDAO.listApoderadoByQuery(null, null);
		length = Math.min(ormApoderados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormApoderados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Director by Criteria...");
		orm.DirectorCriteria lormDirectorCriteria = new orm.DirectorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirectorCriteria.id.eq();
		lormDirectorCriteria.setMaxResults(ROW_COUNT);
		orm.Director[] ormDirectors = lormDirectorCriteria.listDirector();
		int length =ormDirectors== null ? 0 : Math.min(ormDirectors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirectors[i]);
		}
		System.out.println(length + " Director record(s) retrieved."); 
		
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Sueldo by Criteria...");
		orm.SueldoCriteria lormSueldoCriteria = new orm.SueldoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormSueldoCriteria.id.eq();
		lormSueldoCriteria.setMaxResults(ROW_COUNT);
		orm.Sueldo[] ormSueldos = lormSueldoCriteria.listSueldo();
		length =ormSueldos== null ? 0 : Math.min(ormSueldos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormSueldos[i]);
		}
		System.out.println(length + " Sueldo record(s) retrieved."); 
		
		System.out.println("Listing Profesor by Criteria...");
		orm.ProfesorCriteria lormProfesorCriteria = new orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProfesorCriteria.id.eq();
		lormProfesorCriteria.setMaxResults(ROW_COUNT);
		orm.Profesor[] ormProfesors = lormProfesorCriteria.listProfesor();
		length =ormProfesors== null ? 0 : Math.min(ormProfesors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProfesors[i]);
		}
		System.out.println(length + " Profesor record(s) retrieved."); 
		
		System.out.println("Listing Jefeadministracion by Criteria...");
		orm.JefeadministracionCriteria lormJefeadministracionCriteria = new orm.JefeadministracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormJefeadministracionCriteria.id.eq();
		lormJefeadministracionCriteria.setMaxResults(ROW_COUNT);
		orm.Jefeadministracion[] ormJefeadministracions = lormJefeadministracionCriteria.listJefeadministracion();
		length =ormJefeadministracions== null ? 0 : Math.min(ormJefeadministracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormJefeadministracions[i]);
		}
		System.out.println(length + " Jefeadministracion record(s) retrieved."); 
		
		System.out.println("Listing Curso_profesor by Criteria...");
		orm.Curso_profesorCriteria lormCurso_profesorCriteria = new orm.Curso_profesorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCurso_profesorCriteria.id.eq();
		lormCurso_profesorCriteria.setMaxResults(ROW_COUNT);
		orm.Curso_profesor[] ormCurso_profesors = lormCurso_profesorCriteria.listCurso_profesor();
		length =ormCurso_profesors== null ? 0 : Math.min(ormCurso_profesors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCurso_profesors[i]);
		}
		System.out.println(length + " Curso_profesor record(s) retrieved."); 
		
		System.out.println("Listing Curso by Criteria...");
		orm.CursoCriteria lormCursoCriteria = new orm.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCursoCriteria.id.eq();
		lormCursoCriteria.setMaxResults(ROW_COUNT);
		orm.Curso[] ormCursos = lormCursoCriteria.listCurso();
		length =ormCursos== null ? 0 : Math.min(ormCursos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCursos[i]);
		}
		System.out.println(length + " Curso record(s) retrieved."); 
		
		System.out.println("Listing Estudiante_curso by Criteria...");
		orm.Estudiante_cursoCriteria lormEstudiante_cursoCriteria = new orm.Estudiante_cursoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEstudiante_cursoCriteria.id.eq();
		lormEstudiante_cursoCriteria.setMaxResults(ROW_COUNT);
		orm.Estudiante_curso[] ormEstudiante_cursos = lormEstudiante_cursoCriteria.listEstudiante_curso();
		length =ormEstudiante_cursos== null ? 0 : Math.min(ormEstudiante_cursos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEstudiante_cursos[i]);
		}
		System.out.println(length + " Estudiante_curso record(s) retrieved."); 
		
		System.out.println("Listing Estudiante by Criteria...");
		orm.EstudianteCriteria lormEstudianteCriteria = new orm.EstudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEstudianteCriteria.id.eq();
		lormEstudianteCriteria.setMaxResults(ROW_COUNT);
		orm.Estudiante[] ormEstudiantes = lormEstudianteCriteria.listEstudiante();
		length =ormEstudiantes== null ? 0 : Math.min(ormEstudiantes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEstudiantes[i]);
		}
		System.out.println(length + " Estudiante record(s) retrieved."); 
		
		System.out.println("Listing Secretaria by Criteria...");
		orm.SecretariaCriteria lormSecretariaCriteria = new orm.SecretariaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormSecretariaCriteria.id.eq();
		lormSecretariaCriteria.setMaxResults(ROW_COUNT);
		orm.Secretaria[] ormSecretarias = lormSecretariaCriteria.listSecretaria();
		length =ormSecretarias== null ? 0 : Math.min(ormSecretarias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormSecretarias[i]);
		}
		System.out.println(length + " Secretaria record(s) retrieved."); 
		
		System.out.println("Listing Matricula by Criteria...");
		orm.MatriculaCriteria lormMatriculaCriteria = new orm.MatriculaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMatriculaCriteria.id.eq();
		lormMatriculaCriteria.setMaxResults(ROW_COUNT);
		orm.Matricula[] ormMatriculas = lormMatriculaCriteria.listMatricula();
		length =ormMatriculas== null ? 0 : Math.min(ormMatriculas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMatriculas[i]);
		}
		System.out.println(length + " Matricula record(s) retrieved."); 
		
		System.out.println("Listing Mensualidad by Criteria...");
		orm.MensualidadCriteria lormMensualidadCriteria = new orm.MensualidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMensualidadCriteria.id.eq();
		lormMensualidadCriteria.setMaxResults(ROW_COUNT);
		orm.Mensualidad[] ormMensualidads = lormMensualidadCriteria.listMensualidad();
		length =ormMensualidads== null ? 0 : Math.min(ormMensualidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMensualidads[i]);
		}
		System.out.println(length + " Mensualidad record(s) retrieved."); 
		
		System.out.println("Listing Apoderado by Criteria...");
		orm.ApoderadoCriteria lormApoderadoCriteria = new orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormApoderadoCriteria.id.eq();
		lormApoderadoCriteria.setMaxResults(ROW_COUNT);
		orm.Apoderado[] ormApoderados = lormApoderadoCriteria.listApoderado();
		length =ormApoderados== null ? 0 : Math.min(ormApoderados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormApoderados[i]);
		}
		System.out.println(length + " Apoderado record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListDBprueba2Data listDBprueba2Data = new ListDBprueba2Data();
			try {
				listDBprueba2Data.listTestData();
				//listDBprueba2Data.listByCriteria();
			}
			finally {
				orm.DBprueba2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
