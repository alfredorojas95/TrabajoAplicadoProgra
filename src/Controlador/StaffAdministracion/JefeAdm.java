package Controlador.StaffAdministracion;

import org.orm.PersistentException;

import Controlador.Persona.*;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class JefeAdm extends Persona {

	public JefeAdm(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// TODO Auto-generated constructor stub
	}
	
	public JefeAdm(String nombre, String apellido, String rut, String pass){
		super(nombre, apellido, rut, pass);
	}
	
	public JefeAdm(){
		super();
	}

	/**
	 * este metodo agrega un nuevo jefe de administracion
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param pass
	 * @return
	 */
	public static String agregarNuevoJefeAdm(String nombre, String apellido, String rut, String pass) {
		Persona nuevaPer = new Persona(nombre, apellido, rut, pass);
		try {
			if (nuevaPer.validarAtributos()) {//se verifican los parámetros
				
				// Se busca la persona
				String condicionPersona = "rut='" + nuevaPer.getRut() + "'";
				orm.Persona lormPersonaBuscar = orm.PersonaDAO.loadPersonaByQuery(condicionPersona, null);
				
				// Si la persona no existe se crea persona, se setean sus aributos y se guarda 
				//despues se crea el jefe de adm, se setea persona y se guarda
				if (lormPersonaBuscar == null) {
					
					orm.Persona lormPersona = orm.PersonaDAO.createPersona();
					lormPersona.setNombre(nuevaPer.getNombre());
					lormPersona.setApellido(nuevaPer.getApellido());
					lormPersona.setRut(nuevaPer.getRut());
					lormPersona.setPass(nuevaPer.getPass());
					orm.PersonaDAO.save(lormPersona);
					
					orm.Jefeadministracion lormJadm = orm.JefeadministracionDAO.createJefeadministracion();
					lormJadm.setPersona(lormPersona);
					orm.JefeadministracionDAO.save(lormJadm);
					
					return "Jefe de administración ingresado exitosamente";
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