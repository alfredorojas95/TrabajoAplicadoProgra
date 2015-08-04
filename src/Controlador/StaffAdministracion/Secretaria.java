package Controlador.StaffAdministracion;

import org.orm.PersistentException;

import Controlador.Persona.*;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Secretaria extends Persona {

	public Secretaria(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Secretaria(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	/**
	 *  este metodo agrega una nueva secretaria
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param pass
	 * @return String mensaje de confirmacion
	 */
	public static String agregarNuevaSecretaria(String nombre, String apellido, String rut, String pass) {
		Persona nuevaPersona = new Persona(nombre, apellido, rut, pass);
		try {
			if (nuevaPersona.validarAtributos()) {
				// Se busca la persona
				String condicionPersona = "rut='" + nuevaPersona.getRut() + "'";
				orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
				
				// Si la persona no existe, se crea persona, se setean los valores y se gurda
				//despues se crea la secretaria, se setea persona y se guarda
				if (lormPersonaBuscar == null) {
				
					orm.Persona lormPersona = orm.PersonaDAO.createPersona();
					
					lormPersona.setNombre(nuevaPersona.getNombre());
					lormPersona.setApellido(nuevaPersona.getApellido());
					lormPersona.setRut(nuevaPersona.getRut());
					lormPersona.setPass(nuevaPersona.getPass());
					orm.PersonaDAO.save(lormPersona);

					orm.Secretaria lormSecretaria = orm.SecretariaDAO.createSecretaria();
					lormSecretaria.setPersona(lormPersona);
					orm.SecretariaDAO.save(lormSecretaria);
					return "Se ingreso nueva secretaria correctamente";
					
				} else {
					return "Esta persona ya existe";
				}
			} else {
				return "Atributo no valido";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}