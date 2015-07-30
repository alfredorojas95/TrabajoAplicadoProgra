package Controlador.Finanza;

import org.orm.PersistentException;

public class Matricula {

	private int estadoMatricula;
	private int monto;

		public static String pagarMatricula(String rutEstudiante,
				String rutSecretaria, int monto) {
			try {
				// Condicion de busqueda de el estudiante
				String condicionEstudiante = "persona.rut='" + rutEstudiante + "'";
				// Asignar estudiante con el rut especificado
				orm.Estudiante lormEstudiante = orm.EstudianteDAO
						.loadEstudianteByQuery(condicionEstudiante, null);

				// Condicion de busqueda de la secretaria
				String condicionSecretaria = "persona.rut='" + rutSecretaria + "'";
				// Asignar secretaria con el rut especificado
				orm.Secretaria lormSecretaria = orm.SecretariaDAO
						.loadSecretariaByQuery(condicionSecretaria, null);

				/*
				 * Validar que exista estudiante y secretaria ingresados por
				 * paramentros
				 */
				/*
				 * Si no tienen un valor nulo, quiere decir que existen y se puede
				 * proceder
				 */
				if (lormEstudiante != null && lormSecretaria != null) {

					// Variable que almacena objetos de un posible pago ya realizado
					String pagoRealizado = "secretaria=" + lormSecretaria + ""
							+ " and estudiante=" + lormEstudiante + "";
					// Asignar matricula con la variable especificada
					orm.Matricula lormMatriculaExiste = orm.MatriculaDAO
							.loadMatriculaByQuery(pagoRealizado, null);
					// validar que la matricula no se encuentre pagada
					// Si el estado de la matricula es 0, quiere decir que no se
					// encuentra pagada y se puede proceder
					if (lormMatriculaExiste.getEstadoMatricula() == 0) {
						// Condicion de busqueda de matricula, la busqueda se
						// realiza
						// por el id de estudiante
						String condicionMatricula = "estudiante.id='"
								+ lormEstudiante.getId() + "'";
						// Asignar matricula con el rut especificado
						orm.Matricula lormMatricula = orm.MatriculaDAO
								.loadMatriculaByQuery(condicionMatricula, null);

						// Enviar valores a matricula
						lormMatricula.setEstadoMatricula(1);
						lormMatricula.setMonto(monto);
						// Guardar matricula
						orm.MatriculaDAO.save(lormMatricula);
						return "matricula pagada";
					} else {
						return "la matricula ya se encuentra pagada";
					}
				} else {
					return "no existe estudiante o secretaria";
				}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

	public static orm.Estudiante[] obtenerListMorososMatricula() {
		// Se instancia una lista de estudiantes con valor nulo
		orm.Estudiante[] ormEstudiantes = null;
		try {
			System.out.println("Listing Estudiante...");
			// Condicion de busqueda de el estudiante
			String condicionEstudiante = "matricula.estadoMatricula='" + 0	+ "'";
			// Se almacena en la lista ormEstudiantes todos los estudiantes con
			// esta condicion
			ormEstudiantes = orm.EstudianteDAO.listEstudianteByQuery(condicionEstudiante, null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Se devuelve la lista del estudiantes
		return ormEstudiantes;
	}

}