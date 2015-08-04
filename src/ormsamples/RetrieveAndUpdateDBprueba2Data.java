/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateDBprueba2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.DBprueba2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(null, null);
			// Update the properties of the persistent object
			orm.DirectorDAO.save(lormDirector);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PersonaDAO.save(lormPersona);
			orm.Sueldo lormSueldo = orm.SueldoDAO.loadSueldoByQuery(null, null);
			// Update the properties of the persistent object
			orm.SueldoDAO.save(lormSueldo);
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Update the properties of the persistent object
			orm.ProfesorDAO.save(lormProfesor);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(null, null);
			// Update the properties of the persistent object
			orm.JefeadministracionDAO.save(lormJefeadministracion);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(null, null);
			// Update the properties of the persistent object
			orm.Curso_profesorDAO.save(lormCurso_profesor);
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(null, null);
			// Update the properties of the persistent object
			orm.CursoDAO.save(lormCurso);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Update the properties of the persistent object
			orm.EstudianteDAO.save(lormEstudiante);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(null, null);
			// Update the properties of the persistent object
			orm.SecretariaDAO.save(lormSecretaria);
			orm.Matricula lormMatricula = orm.MatriculaDAO.loadMatriculaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MatriculaDAO.save(lormMatricula);
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(null, null);
			// Update the properties of the persistent object
			orm.MensualidadDAO.save(lormMensualidad);
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ApoderadoDAO.save(lormApoderado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Director by DirectorCriteria");
		orm.DirectorCriteria lormDirectorCriteria = new orm.DirectorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirectorCriteria.id.eq();
		System.out.println(lormDirectorCriteria.uniqueDirector());
		
		System.out.println("Retrieving Persona by PersonaCriteria");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.id.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving Sueldo by SueldoCriteria");
		orm.SueldoCriteria lormSueldoCriteria = new orm.SueldoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormSueldoCriteria.id.eq();
		System.out.println(lormSueldoCriteria.uniqueSueldo());
		
		System.out.println("Retrieving Profesor by ProfesorCriteria");
		orm.ProfesorCriteria lormProfesorCriteria = new orm.ProfesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormProfesorCriteria.id.eq();
		System.out.println(lormProfesorCriteria.uniqueProfesor());
		
		System.out.println("Retrieving Jefeadministracion by JefeadministracionCriteria");
		orm.JefeadministracionCriteria lormJefeadministracionCriteria = new orm.JefeadministracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormJefeadministracionCriteria.id.eq();
		System.out.println(lormJefeadministracionCriteria.uniqueJefeadministracion());
		
		System.out.println("Retrieving Curso_profesor by Curso_profesorCriteria");
		orm.Curso_profesorCriteria lormCurso_profesorCriteria = new orm.Curso_profesorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCurso_profesorCriteria.id.eq();
		System.out.println(lormCurso_profesorCriteria.uniqueCurso_profesor());
		
		System.out.println("Retrieving Curso by CursoCriteria");
		orm.CursoCriteria lormCursoCriteria = new orm.CursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCursoCriteria.id.eq();
		System.out.println(lormCursoCriteria.uniqueCurso());
		
		System.out.println("Retrieving Estudiante_curso by Estudiante_cursoCriteria");
		orm.Estudiante_cursoCriteria lormEstudiante_cursoCriteria = new orm.Estudiante_cursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEstudiante_cursoCriteria.id.eq();
		System.out.println(lormEstudiante_cursoCriteria.uniqueEstudiante_curso());
		
		System.out.println("Retrieving Estudiante by EstudianteCriteria");
		orm.EstudianteCriteria lormEstudianteCriteria = new orm.EstudianteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEstudianteCriteria.id.eq();
		System.out.println(lormEstudianteCriteria.uniqueEstudiante());
		
		System.out.println("Retrieving Secretaria by SecretariaCriteria");
		orm.SecretariaCriteria lormSecretariaCriteria = new orm.SecretariaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormSecretariaCriteria.id.eq();
		System.out.println(lormSecretariaCriteria.uniqueSecretaria());
		
		System.out.println("Retrieving Matricula by MatriculaCriteria");
		orm.MatriculaCriteria lormMatriculaCriteria = new orm.MatriculaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMatriculaCriteria.id.eq();
		System.out.println(lormMatriculaCriteria.uniqueMatricula());
		
		System.out.println("Retrieving Mensualidad by MensualidadCriteria");
		orm.MensualidadCriteria lormMensualidadCriteria = new orm.MensualidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMensualidadCriteria.id.eq();
		System.out.println(lormMensualidadCriteria.uniqueMensualidad());
		
		System.out.println("Retrieving Apoderado by ApoderadoCriteria");
		orm.ApoderadoCriteria lormApoderadoCriteria = new orm.ApoderadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormApoderadoCriteria.id.eq();
		System.out.println(lormApoderadoCriteria.uniqueApoderado());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateDBprueba2Data retrieveAndUpdateDBprueba2Data = new RetrieveAndUpdateDBprueba2Data();
			try {
				retrieveAndUpdateDBprueba2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateDBprueba2Data.retrieveByCriteria();
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
