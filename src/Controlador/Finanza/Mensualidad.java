package Controlador.Finanza;

import org.orm.PersistentException;

import com.google.gson.Gson;

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
	 * @param rutEs
	 * @param rutSc
	 * @param mes
	 * @return
	 */
	public static String regPagoMensualidad(String rutEs, String rutSc, int mes) {

		if (mes < 1 || mes > 10) {
			return "Mes inválido";
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
			if (lormSecretaria != null) {
				if(lormEstudiante != null){
					if(lormMatriculaExiste.getEstadoMatricula()!=0){
						
						String condicion = "estudiante='" + lormEstudiante + "' " + " and mes='"+mes+"'";
						orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(condicion, null);
						
						if(lormMensualidad.getMonto() == 0){
							int cant=Curso.calcularCantCursos(rutEs);
							if(cant!= 0){
								lormMensualidad.setSecretaria(lormSecretaria);
								lormMensualidad.setMes(mes);
								lormMensualidad.setMonto(cant*10000);
								lormMensualidad.setCantCursos(cant);
								orm.MensualidadDAO.save(lormMensualidad);
								return "se registró el pago de la mensualidad exitosamente";
							}else{
								return "El estudiante no registra cursos en este mes";
							}
						}else {
							return "El mes ingresado ya fue pagado";
						}
					}else {
						return "Primero debe pagar la matrícula";
					}
				}else {
					return "El rut del estudiante es incorrecto";
				}
			} else {
				return "El rut de la secretaria es incorrecto";
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
	 * @return
	 */
	public static String obtenerListMorososMensualidad(int mes) {
		if (mes < 1 || mes > 10) {
			return "Mes inválido";
		}
		
		String matriz[][];
		Gson gson = new Gson();
		String listaMorososMensualidad=null;
		try {
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
					matriz[i][3]=""+(10000*ormMensualidads[i].getCantCursos());//monto
				}
				listaMorososMensualidad = gson.toJson(matriz);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaMorososMensualidad;
	}


}