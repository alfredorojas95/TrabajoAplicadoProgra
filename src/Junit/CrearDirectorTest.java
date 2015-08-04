/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Persona.Persona;
import Controlador.StaffAdministracion.Director;

/**
 * @author wilfri
 *
 */
public class CrearDirectorTest {

	/**
	 * Test method for {@link Controlador.StaffAdministracion.Director#agregarNuevoDirector(Controlador.Persona.Persona)}.
	 */
	@Test
	public void testAgregarNuevoDirector() {
		/*
		 * prueba para agregar un Jefe de Administraci�n a la base de datos
		 */	
		String resultado="";
		resultado =Director.agregarNuevoDirector("Juan","Toloza","92749802","123456");
		assertTrue(resultado=="Director ingresado exitosamente");
	}

}
