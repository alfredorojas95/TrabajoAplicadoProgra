package Controlador.Finanza;

import org.orm.PersistentException;

import Controlador.Academico.Curso;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Sueldo {
	
	private static final int ROW_COUNT = 100;

	private int monto;
	private int mes;
	private int cantCursos;
	private int estadoPago;


	/**
	 * este método registra el pago del sueldo de un profesor en cierto mes
	 * @param rutProf (a pagar)
	 * @param rutAdm (quien registra el pago)
	 * @param mes (que desea pagar)
	 * @return String mensaje de confirmacion 
	 */
	public static String registrarSueldoProf(String rutProf, String rutAdm, int mes) {
		// se valida si el mes es correcto
		if (mes < 1 || mes > 10) {
			return "mes invalido";
		}
		try {
			// se busca el jefe de administracion
			String condicionAdmin = "persona.rut='" + rutAdm + "'";
			orm.Jefeadministracion lormJefeAdm = orm.JefeadministracionDAO.loadJefeadministracionByQuery(condicionAdmin, null);
			// si existe el jefe de administracion
			if (lormJefeAdm != null) {
				//se crea una condicion de busqueda del profesor ingresando el rut
				String rutProfesor = "persona.rut='" + rutProf + "'";
				orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(rutProfesor, null);
				// si el profesor existe
				if (lormProfesor != null) {
					// se busca el sueldo del profesor en el mes especifico
					String condicionprof = "profesor.id='" + lormProfesor.getId() + "'"+ " and mes='"+mes+"'";
					orm.Sueldo lormSueldo = orm.SueldoDAO.loadSueldoByQuery(condicionprof, null);
					//orm.Sueldo_profesor lormSueldo_profesor = orm.Sueldo_profesorDAO.loadSueldo_profesorByQuery(condicionprof, null);
					System.out.println("Nombre: " + lormSueldo.getProfesor().getPersona().getNombre() + "mes: " + lormSueldo.getMes());
					if(Curso.calcularCantCursos(rutProf)!=0){
						
						//si en ese mes el estado es no pagado se paga
						if (lormSueldo.getEstadoPago()==0){
							lormSueldo.setEstadoPago(1);
							lormSueldo.setJefeadministracion(lormJefeAdm);
							orm.SueldoDAO.save(lormSueldo);
							return "Sueldo pagado exitosamente";
						}
						return "El mes se encuentra pagado";
					}
					return "El profesor no tiene cursos";	
				}
				return "El profesor no existe";	
			} 
		return "El jefe de administracion no existe";
			

	} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return null;
	}


	/**
	 * este método consulta todos los sueldos de un profesor y devuelve sus datos
	 * @param rutProf
	 * @return String[][] datos del profesor
	 */
	public static String[][] consSueldoProf(String rutProf) {
		try {
			//se busca al profesor
			String condicion = "persona.rut='" + rutProf + "'";
			orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(condicion, null);
			if(lormProfesor!=null){
				
			//se buscan los sueldos del profesor
			String condicionprof = "profesor='" + lormProfesor+ "'";
			orm.Sueldo[] ormSueldos = orm.SueldoDAO.listSueldoByQuery(condicionprof, null);
			
			//se recorren los sueldos del profesor y se guardan los datos
			//( nombre, mes, cantCursos, monto y estadoPago)  en la matriz
			int length = Math.min(ormSueldos.length, ROW_COUNT);
			String matriz[][] = new String[length][5];
			for (int i = 0; i < length; i++) {
				matriz[i][0]=ormSueldos[i].getProfesor().getPersona().getNombre()+" "+ormSueldos[i].getProfesor().getPersona().getApellido();
				matriz[i][1]=""+ormSueldos[i].getMes();
				matriz[i][2]=""+ormSueldos[i].getCantCursos();
				matriz[i][3]=""+ormSueldos[i].getMonto();
				matriz[i][4]=""+ormSueldos[i].getEstadoPago();
			}
			return matriz;
			}
			return null;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}