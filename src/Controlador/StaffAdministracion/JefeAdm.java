package Controlador.StaffAdministracion;

import org.orm.PersistentException;

import Controlador.Persona.*;

public class JefeAdm extends Persona {

	public JefeAdm(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public JefeAdm(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	/**
	 * 
	 * @param NuevaPer
	 */
	public static String agregarNuevoJefeAdm(Persona nuevaPer) {
		try {
			if (nuevaPer.validarAtributos()) {
			// Se establece una condicion de busqueda
				String condicionPersona = "rut='" + nuevaPer.getRut() + "'";
			    // Se asigna a la variable lormPersonaBuscar, la persona con la condicion establecida
				orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
				// Si la persona no existe
				if (lormPersonaBuscar == null) {
					orm.Persona lormPersona = orm.PersonaDAO.createPersona();
					lormPersona.setNombre(nuevaPer.getNombre());
					lormPersona.setApellido(nuevaPer.getApellido());
					lormPersona.setRut(nuevaPer.getRut());
					orm.PersonaDAO.save(lormPersona);
				orm.Jefeadministracion lormJadm = orm.JefeadministracionDAO.createJefeadministracion();
					lormJadm.setPersona(lormPersona);
					orm.JefeadministracionDAO.save(lormJadm);
					return "El Profesor ingresado exitosamente";
				} else {
					return "El Profesor ingresado ya existe";
				}
			}else{
				return "Atributo no valido";
			}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Update the properties of the persistent object
			return null;
	}

}