/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Persona.Persona;
import Controlador.StaffAdministracion.JefeAdm;

/**
 * @author wilfri
 *
 */
public class CrearJefeAdmTest {

	/**
	 * Test method for {@link Controlador.StaffAdministracion.JefeAdm#agregarNuevoJefeAdm(Controlador.Persona.Persona)}.
	 */
	@Test
	public void testAgregarNuevoJefeAdm() {
		/*
		 * prueba para agregar un Jefe de Administración a la base de datos
		 */	
		String resultado="";
		resultado =JefeAdm.agregarNuevoJefeAdm("Carlos","Venegas","135749802","123456");
		assertTrue(resultado=="Jefe de administración ingresado exitosamente");
		
//		
//		/*
//		 * prueba para mensaje de error (rut repetido en la base de datos)
//		 */	
//		String resultado2="";
//		resultado2 =JefeAdm.agregarNuevoJefeAdm(new Persona("Felipe","Arias","186548454"));
//		assertTrue(resultado2=="el rut del jefe de administracion ya existía")
	}

}
