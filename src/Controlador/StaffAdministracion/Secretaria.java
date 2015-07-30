package Controlador.StaffAdministracion;

import org.orm.PersistentException;

import Controlador.Persona.*;

public class Secretaria extends Persona {

	public Secretaria(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Secretaria(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	/**
	 * 
	 * @param NuevaPer
	 */
	public static String agregarNuevaSecretatia(Persona nuevaPersona) {
		try {
			if (nuevaPersona.validarAtributos()) {
				// Se establece una condicion de busqueda
				String condicionPersona = "rut='" + nuevaPersona.getRut() + "'";
				// Se asigna a la variable lormPersonaBuscar, la persona con la
				// condicion establecida
				orm.Persona lormPersonaBuscar = orm.PersonaDAO
						.loadPersonaByQuery(condicionPersona, null);
				// Si la persona no existe
				if (lormPersonaBuscar == null) {
					// Crear nueva persona
					orm.Persona lormPersona = orm.PersonaDAO.createPersona();
					// Enviar valores a persona encontrados en el objto Persona
					// recibido por parametro.
					lormPersona.setNombre(nuevaPersona.getNombre());
					lormPersona.setApellido(nuevaPersona.getApellido());
					lormPersona.setRut(nuevaPersona.getRut());
					// Guardar persona
					orm.PersonaDAO.save(lormPersona);

					// Crear nueva secretaria
					orm.Secretaria lormSecretaria = orm.SecretariaDAO.createSecretaria();
					lormSecretaria.setPersona(lormPersona);
					// Guardar secretaria
					orm.SecretariaDAO.save(lormSecretaria);
					return "Se ingreso nueva secretaria correctamente";
				} else {
					return "La persona ya existe";
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