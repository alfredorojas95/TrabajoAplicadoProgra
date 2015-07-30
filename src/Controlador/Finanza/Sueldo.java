package Controlador.Finanza;

import org.orm.PersistentException;

import Controlador.Academico.Curso;

public class Sueldo {
	
	private static final int ROW_COUNT = 100;

	private int monto;
	private int mes;
	private int cantCursos;
	private int estadoPsgo;

	public void obtenerListSueldoProf() {
		// TODO - implement Sueldo.obtenerListSueldoProf
		throw new UnsupportedOperationException();
	}

	public static String registrarSueldoProf(String rutProf, String rutAdm, int mes) {
		// se valida si el mes es correcto
				if (mes < 1 || mes > 10) {
					return "mes invalido";
				}
				try {
					// creacion de condicion de busqueda
					String condicionAdmin = "persona.rut='" + rutAdm + "'";
					orm.Jefeadministracion lormJefeAdm = orm.JefeadministracionDAO.loadJefeadministracionByQuery(condicionAdmin, null);
					// si existe el jefe de administracion
					if (lormJefeAdm != null) {
						//se crea una condicion de busqueda del profesor ingresando el rut
						String rutProfesor = "persona.rut='" + rutProf + "'";
						orm.Profesor lormProfesor = orm.ProfesorDAO.loadProfesorByQuery(rutProfesor, null);
						// si el profesor existe
						if (lormProfesor != null) {
							System.out.println("hola1");
							// se crea la condicion de busqueda que tiene el id del profesor y el mes de pago
							String condicionprof = "profesorId='" + lormProfesor.getId()+ "' "/*+ " and mes='"+mes+"'"*/;
							orm.Sueldo_profesor[] ormSueldo_profesor = orm.Sueldo_profesorDAO.listSueldo_profesorByQuery(condicionprof, null);
							int length = Math.min(ormSueldo_profesor.length, ROW_COUNT);
							for (int i = 0; i < length; i++) {
								if(ormSueldo_profesor[i].getSueldo().getMes()==mes && ormSueldo_profesor[i].getSueldo().getEstadoPago()==0){
									// se calcuan los cursos
									String cant =Curso.calcularCantCursos(rutProf);
									if(cant!=null){
										int cantidad= Integer.parseInt(cant);
										// se clacula el pago por curso y se cambia el monto
										ormSueldo_profesor[i].getSueldo().setCantCursos(cantidad);
										ormSueldo_profesor[i].getSueldo().setMonto(cantidad*100000);
										ormSueldo_profesor[i].getSueldo().setEstadoPago(1);
										ormSueldo_profesor[i].setJefeadministracion(lormJefeAdm);
										// se guardan los cambios
										orm.Sueldo_profesorDAO.save(ormSueldo_profesor[i]);
										return "sueldo asignado";
									}
									return "El profesor no posee cursos";
								}	
							}
							return "Error al registrar pago";	
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


	public void consSueldoProf() {
		// TODO - implement Sueldo.consSueldoProf
		throw new UnsupportedOperationException();
	}

}