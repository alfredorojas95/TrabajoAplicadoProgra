/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Persona.Apoderado;
import Controlador.StaffAdministracion.Director;

/**
 * @author wilfri
 *
 */
public class CrearApoderadoTest {

	/**
	 * Test method for {@link Controlador.Persona.Apoderado#agregarNuevoApoderado(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAgregarNuevoApoderado() {
		/*
		 * prueba para agregar un Jefe de Administración a la base de datos
		 */	
		String resultado="";
		resultado =Apoderado.agregarNuevoApoderado("Luis","Huilipan","142749802","123456");
		assertTrue(resultado=="Apoderado ingresado exitosamente");
	}

}
