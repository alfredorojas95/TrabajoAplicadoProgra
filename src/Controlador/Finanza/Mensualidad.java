package Controlador.Finanza;

import org.orm.PersistentException;

import Controlador.Academico.Curso;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Mensualidad {

	private int mes;
	private int monto;
	private static final int ROW_COUNT = 100;

	/**
	 * este método paga la mensualidad de un estudiante
	 * @param rutSc
	 * @param rutEs
	 * @param mes
	 * @return String mensaje de confirmación
	 */
	public static String regPagoMensualidad(String rutSc, String rutEs, int mes) {

		if (mes < 1 || mes > 10) {
			return "mes invalido";
		}

		try {
			// se crea una variable de busqueda
			String mapeoRutS = "persona.rut='" + rutSc + "'";
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(mapeoRutS, null);

			String mapeoRutE = "persona.rut='" + rutEs + "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(mapeoRutE, null);
			// si la secretaria y el estudiante existen
			if ((lormSecretaria != null) && (lormEstudiante != null)) {
				String condicion = "estudiante='" + lormEstudiante + "' " + " and mes='"+mes+"'";
				orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(condicion, null);

				if (lormMensualidad.getMonto() == 0){
					// Update the properties of the persistent object
					lormMensualidad.setSecretaria(lormSecretaria);
					lormMensualidad.setMes(mes);
					int cant=Curso.calcularCantCursos(rutEs);
					lormMensualidad.setCantCursos(cant);
					if(cant!= 0){
						lormMensualidad.setMonto(cant*10000);
						orm.MensualidadDAO.save(lormMensualidad);
						return "se registró el pago de la mensualidad exitosamente";
					} else {
						return "no se encontró ningun curso";
					}
				
			} else {
				return "La secretaria o el estudiante no existen";
			}
		}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * este método obtiene el listado de los estudiantes morosos en el pago de la mensualidad
	 * @param mes
	 * @return String[][] con los datos de los estudiantes
	 */
	public static String[][] obtenerListMorososMensualidad(String mes) {

		String matriz[][];
		try {
			//se buscan todas las mensualidad no pagadas en cierto mes
			String condicionMonto = "monto='" + 0+ "'"+ " and mes<'"+mes+"'";
			orm.Mensualidad[] ormMensualidads = orm.MensualidadDAO.listMensualidadByQuery(null, null);
				int length = Math.min(ormMensualidads.length, ROW_COUNT);
				matriz=new String[length][4];
				//se recorre la lista con los estudiantes morosos y se gurdan sus datos en la matriz
				for (int i = 0; i < length; i++) {
					matriz[i][0]=ormMensualidads[i].getEstudiante().getPersona().getRut();
					matriz[i][1]=""+ormMensualidads[i].getCantCursos();
					matriz[i][2]=""+ormMensualidads[i].getMes();
					matriz[i][3]=""+ormMensualidads[i].getMonto();
				}
				return matriz;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}