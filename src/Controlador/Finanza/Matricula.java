package Controlador.Finanza;

import org.orm.PersistentException;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Matricula {

	private int estadoMatricula;
	private int monto;
	private static final int ROW_COUNT = 100;

	/**
	 * este metodo paga la matricula de un estudiante
	 * @param rutEstudiante
	 * @param rutSecretaria
	 * @return String mensaje de confirmacion
	 */
	public static String pagarMatricula(String rutEstudiante,String rutSecretaria) {
			int monto = 20000;
			try {
				// Condicion de busqueda de el estudiante
				String condicionEstudiante = "persona.rut='" + rutEstudiante + "'";
				orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(condicionEstudiante, null);

				// Condicion de busqueda de la secretaria
				String condicionSecretaria = "persona.rut='" + rutSecretaria + "'";
				orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(condicionSecretaria, null);

				//estudiante y secretaria existen en la base de datos
				if (lormEstudiante != null && lormSecretaria != null) {
					String buscarMatricula = "estudiante='" + lormEstudiante + "'";
					orm.Matricula lormMatriculaExiste = orm.MatriculaDAO.loadMatriculaByQuery(buscarMatricula, null);
					// validar que la matricula no se encuentre pagada
					// Si el estado de la matricula es 0, quiere decir que no se
					// encuentra pagada y se puede proceder
					if (lormMatriculaExiste.getEstadoMatricula() == 0) {
						// Condicion de busqueda de matricula, la busqueda se realiza por el id de estudiante
						
						// Enviar valores a matricula
						lormMatriculaExiste.setEstadoMatricula(1);
						lormMatriculaExiste.setMonto(monto);
						lormMatriculaExiste.setSecretaria(lormSecretaria);
						// Guardar matricula
						orm.MatriculaDAO.save(lormMatriculaExiste);
						return "matricula pagada exitosamente";
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

	public static String[][] obtenerListMorososMatricula() {
		String matriz[][];
		try {
			// se buscan todas las matricuas cuyo estado sea "0" (no pagado)
			String condicion = "estadoMatricula='" + 0 + "'";
			orm.Matricula[] ormMatriculas = orm.MatriculaDAO.listMatriculaByQuery(condicion,null);
			int length = Math.min(ormMatriculas.length, ROW_COUNT);
			matriz= new String [length][4];
			
			//se recorren todas la matriculas no pagadas y se guardan los datos de los estudiantes
			//nombre, apellido, rut, monto
			for (int i = 0; i < length; i++) {
				matriz[i][0]=ormMatriculas[i].getEstudiante().getPersona().getNombre();
				matriz[i][1]=ormMatriculas[i].getEstudiante().getPersona().getApellido();
				matriz[i][2]=ormMatriculas[i].getEstudiante().getPersona().getRut();
				matriz[i][3]=""+ormMatriculas[i].getMonto();
				System.out.println("|Nombre: "+matriz[i][0]+" |Apellido: "+matriz[i][1]+" |Rut: "+matriz[i][2]+" |Monto: "+matriz[i][3]);
				
			}
			return matriz;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Se devuelve la lista del estudiantes
		return null;
	}

}