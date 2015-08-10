package Controlador.Persona;

import org.orm.PersistentException;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Apoderado extends Persona {

	public Apoderado(String nombre, String apellido, String rut, String pass) {
		super(nombre, apellido, rut, pass);
		// TODO Auto-generated constructor stub
	}

	public Apoderado(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public Apoderado(){
		super();
	}
	
	/**
	 * este método agrega un nuevo apoderado
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param pass
	 * @return String confirmacion
	 */
	public static String agregarNuevoApoderado(String nombre, String apellido, String rut,String pass){
		
		Persona nuevaPer = new Persona(nombre, apellido, rut, pass);
		try {
			if (nuevaPer.validarAtributos()) {
				
				// Se busca la persona
				String condicionPersona = "rut='" + nuevaPer.getRut() + "'";
				orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
				
				// Si la persona no existe crea la persona y se guarda.
				//despues se crea el apoderado, se le setea persona y se guarda.
				if (lormPersonaBuscar == null) {
					orm.Persona lormPersona = orm.PersonaDAO.createPersona();
					lormPersona.setNombre(nuevaPer.getNombre());
					lormPersona.setApellido(nuevaPer.getApellido());
					lormPersona.setRut(nuevaPer.getRut());
					orm.PersonaDAO.save(lormPersona);
					
					orm.Apoderado lormApoderado = orm.ApoderadoDAO.createApoderado();
					lormApoderado.setPersona(lormPersona);
					orm.ApoderadoDAO.save(lormApoderado);
					
					return "Apoderado ingresado exitosamente";
				} else {
					return "La persona ya existe";
				}
			}else{
				return "Atributo no valido";
			}
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Update the properties of the persistent objectreturn null;
		return null;
	}
	
	
}