package Controlador.Finanza;

import org.orm.PersistentException;

import Controlador.Academico.Curso;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Mensualidad {

	public Mensualidad(){
		super();
	}
	private int mes;
	private int monto;
	//private static final int ROW_COUNT = 100;

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
			// se busca la secretaria
			String mapeoRutS = "persona.rut='" + rutSc + "'";
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(mapeoRutS, null);

			//se busca el estudiante
			String mapeoRutE = "persona.rut='" + rutEs + "'";
			orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(mapeoRutE, null);
			
			//se busca la matrícula
			String buscarMatricula = "estudiante='" + lormEstudiante + "'";
			orm.Matricula lormMatriculaExiste = orm.MatriculaDAO.loadMatriculaByQuery(buscarMatricula, null);
			
			// si la secretaria y el estudiante existen
			if ((lormSecretaria != null) && (lormEstudiante != null)&&(lormMatriculaExiste.getEstadoMatricula()!=0)) {
				String condicion = "estudiante='" + lormEstudiante + "' " + " and mes='"+mes+"'";
				orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(condicion, null);

				if (lormMensualidad.getMonto() == 0){
					// Update the properties of the persistent object
					lormMensualidad.setSecretaria(lormSecretaria);
					lormMensualidad.setMes(mes);
					int cant=Curso.calcularCantCursos(rutEs);
					
					if(cant!= 0){
						lormMensualidad.setMonto(cant*10000);
						lormMensualidad.setCantCursos(cant);
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
	public static String[][] obtenerListMorososMensualidad(int mes) {
		String matriz[][];
		try {
			System.out.println("hola  2");
			//se buscan todas las mensualidad no pagadas en cierto mes
			String condicionMonto = "monto='" + 0+ "' "+" and mes<='"+mes+ "' "+" and cantCursos>'"+0+"'";

			orm.Mensualidad[] ormMensualidads = orm.MensualidadDAO.listMensualidadByQuery(condicionMonto, null);
				int length = ormMensualidads.length; //Math.min(ormMensualidads.length, ROW_COUNT);
				matriz=new String[length][4];

				//se recorre la lista con los estudiantes morosos y se gurdan sus datos en la matriz
				for (int i = 0; i < length; i++) {
	
					matriz[i][0]=""+ormMensualidads[i].getEstudiante().getPersona().getRut();
					matriz[i][1]=""+ormMensualidads[i].getCantCursos();
					matriz[i][2]=""+ormMensualidads[i].getMes();
					matriz[i][3]=""+(10000*ormMensualidads[i].getCantCursos());
				}
				return matriz;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


}