package Controlador.StaffAdministracion;

import org.orm.PersistentException;

import Controlador.Persona.*;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Director extends Persona {

	public Director (String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Director(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	
	/**
	 *  este metodo agrega un nuevo director
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param pass
	 * @return String confirmacion
	 */
	public static String agregarNuevoDirector(String nombre, String apellido, String rut, String pass) {
		Persona nuevaPer = new Persona(nombre, apellido, rut, pass);
		try {
			if (nuevaPer.validarAtributos()) {
				// Se busca la persona
				String condicionPersona = "rut='" + nuevaPer.getRut() + "'";
				orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
				
				// Si la persona no existe se crea la persona, se setean los valores y se guarda
				// despues se crea el director, se setea persona y se guarda
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
					return "Esta persona ya existe";
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