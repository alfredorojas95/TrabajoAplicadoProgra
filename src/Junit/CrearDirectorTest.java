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
		 * prueba para agregar un Jefe de Administración a la base de datos
		 */	
		String resultado="";
		resultado =Director.agregarNuevoDirector(new Persona("Juan","Toloza","112749802","1234"));
		assertTrue(resultado=="Director ingresado exitosamente");
	}

}
