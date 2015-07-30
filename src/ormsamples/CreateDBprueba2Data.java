/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateDBprueba2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.DBprueba2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Director lormDirector = orm.DirectorDAO.createDirector();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso, persona
			orm.DirectorDAO.save(lormDirector);
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : apoderado, secretaria, estudiante, jefeadministracion, profesor, director, rut, apellido, nombre
			orm.PersonaDAO.save(lormPersona);
			orm.Sueldo_profesor lormSueldo_profesor = orm.Sueldo_profesorDAO.createSueldo_profesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jefeadministracion
			orm.Sueldo_profesorDAO.save(lormSueldo_profesor);
			orm.Sueldo lormSueldo = orm.SueldoDAO.createSueldo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo_profesor, estadoPago, cantCursos, mes, monto
			orm.SueldoDAO.save(lormSueldo);
			orm.Profesor lormProfesor = orm.ProfesorDAO.createProfesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso_profesor, sueldo_profesor, persona
			orm.ProfesorDAO.save(lormProfesor);
			orm.Jefeadministracion lormJefeadministracion = orm.JefeadministracionDAO.createJefeadministracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sueldo_profesor, persona
			orm.JefeadministracionDAO.save(lormJefeadministracion);
			orm.Curso_profesor lormCurso_profesor = orm.Curso_profesorDAO.createCurso_profesor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesor, curso
			orm.Curso_profesorDAO.save(lormCurso_profesor);
			orm.Curso lormCurso = orm.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante_curso, curso_profesor, director, nombreCurso
			orm.CursoDAO.save(lormCurso);
			orm.Estudiante_curso lormEstudiante_curso = orm.Estudiante_cursoDAO.createEstudiante_curso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso, estudiante
			orm.Estudiante_cursoDAO.save(lormEstudiante_curso);
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.createEstudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensualidad, matricula, estudiante_curso, persona
			orm.EstudianteDAO.save(lormEstudiante);
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.createSecretaria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensualidad, persona
			orm.SecretariaDAO.save(lormSecretaria);
			orm.Matricula lormMatricula = orm.MatriculaDAO.createMatricula();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estudiante
			orm.MatriculaDAO.save(lormMatricula);
			orm.Mensualidad lormMensualidad = orm.MensualidadDAO.createMensualidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : monto, mes, estudiante, secretaria
			orm.MensualidadDAO.save(lormMensualidad);
			orm.Apoderado lormApoderado = orm.ApoderadoDAO.createApoderado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona
			orm.ApoderadoDAO.save(lormApoderado);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateDBprueba2Data createDBprueba2Data = new CreateDBprueba2Data();
			try {
				createDBprueba2Data.createTestData();
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
