package Controlador.Finanza;

import org.orm.PersistentException;

import Controlador.Academico.Curso;

public class Mensualidad {

	private int mes;
	private int monto;

	public static String regPagoMensualidad(String rutSc, String rutEs, int mes) {
		// TODO Initialize the properties of the persistent object here, the
		// following properties must be initialized before saving : monto, mes,
		// estudiante, secretaria
		if (mes < 1 || mes > 10) {
			return "mes invalido";
		}
		
		try {
			//se crea una variable de busqueda
			String mapeoRutS = "persona.rut='" + rutSc + "'";
			orm.Secretaria lormSecretaria = orm.SecretariaDAO.loadSecretariaByQuery(mapeoRutS, null);
			// si la secretaria existe
			if (lormSecretaria != null) {
				//se crea una variable de busqueda
				String mapeoRutE = "persona.rut='" + rutEs + "'";
				orm.Estudiante lormEstudiante = orm.EstudianteDAO.loadEstudianteByQuery(mapeoRutE, null);
				
				//si el estudiante existe
				if (lormEstudiante != null) {
					String condicion = "estudiante='" + lormEstudiante + "' " + " and mes='"+mes+"'";
					orm.Mensualidad lormMensualidad = orm.MensualidadDAO.loadMensualidadByQuery(condicion, null);
					// Update the properties of the persistent object
					lormMensualidad.setSecretaria(lormSecretaria);
					lormMensualidad.setMes(mes);
					String cant=Curso.calcularCantCursos(rutEs);
					if(cant!=null){
						int cantidad= Integer.parseInt(cant);
						lormMensualidad.setMonto(cantidad*10000);
						orm.MensualidadDAO.save(lormMensualidad);
						return "se registro Exitosamente";
					}
					return "El estudiante no tiene cursos";
				}
				return "El estudiante no existe";
			}
			return "La secretaria no existe";
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public orm.Mensualidad[] obtenerListMorososMensualidad(String mes) {
		String condicionMonto = "monto='" + 0+ "' "+ " and mes<'"+mes+"'";
		orm.Mensualidad[] ormMensualidades = null;
		try {
			 ormMensualidades = orm.MensualidadDAO.listMensualidadByQuery(condicionMonto, null);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ormMensualidades;
	}

}