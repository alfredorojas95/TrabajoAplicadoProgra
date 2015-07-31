package Controlador.StaffAdministracion;

import org.orm.PersistentException;

import Controlador.Persona.*;

public class Director extends Persona {

	public Director (String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Director(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	
	/**
	 * 
	 * @param NuevaPer
	 */
	public static String agregarNuevoDirector(Persona nuevaPer) {
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
					lormPersona.setPass(nuevaPer.getPass());
					orm.PersonaDAO.save(lormPersona);
					orm.Director lormDirector = orm.DirectorDAO.createDirector();
					lormDirector.setPersona(lormPersona);
					orm.DirectorDAO.save(lormDirector);
					return "Director ingresado exitosamente";
				} else {
					return "El director ingresado ya existe";
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