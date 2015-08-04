/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteDBprueba2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.DBprueba2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(null, null);
			// Delete the persistent object
			orm.DirectorDAO.delete(lormDirector);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Sueldo lormSueldo = orm.SueldoDAO.loadSueldoByQuery(null, null);
			// Delete the persistent object
			orm.SueldoDAO.delete(lormSueldo);
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(null, null);
			// Delete the persistent object
			orm.ProfesorDAO.delete(lormProfesor);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.loadJefeadministracionByQuery(null, null);
			// Delete the persistent object
			orm.JefeadministracionDAO.delete(lormJefeadministracion);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.loadCurso_profesorByQuery(null, null);
			// Delete the persistent object
			orm.Curso_profesorDAO.delete(lormCurso_profesor);
			orm.Curso lormCurso = orm.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			orm.CursoDAO.delete(lormCurso);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.loadEstudiante_cursoByQuery(null, null);
			// Delete the persistent object
			orm.Estudiante_cursoDAO.delete(lormEstudiante_curso);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Delete the persistent object
			orm.EstudianteDAO.delete(lormEstudiante);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(null, null);
			// Delete the persistent object
			orm.SecretariaDAO.delete(lormSecretaria);
			orm.Matricula lormMatricula = orm.MatriculaDAO.loadMatriculaByQuery(null, null);
			// Delete the persistent object
			orm.MatriculaDAO.delete(lormMatricula);
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(null, null);
			// Delete the persistent object
			orm.MensualidadDAO.delete(lormMensualidad);
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.loadApoderadoByQuery(null, null);
			// Delete the persistent object
			orm.ApoderadoDAO.delete(lormApoderado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteDBprueba2Data deleteDBprueba2Data = new DeleteDBprueba2Data();
			try {
				deleteDBprueba2Data.deleteTestData();
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
