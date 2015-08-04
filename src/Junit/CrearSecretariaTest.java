/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Persona.Persona;
import Controlador.StaffAdministracion.Secretaria;

/**
 * @author wilfri
 *
 */
public class CrearSecretariaTest {

	/**
	 * Test method for {@link Controlador.StaffAdministracion.Secretaria#agregarNuevaSecretatia(Controlador.Persona.Persona)}.
	 */
	@Test
	public void testAgregarNuevaSecretatia() {
		/*
		 * prueba en donde se ingresa exitosamente una nueva secretaria a la base de datos
		 */
		String resultado="";
		resultado =Secretaria.agregarNuevaSecretaria("Juanita","Ringeling","165643214","123456");
		assertTrue(resultado=="Se ingreso nueva secretaria correctamente");
		
		/*
		 * prueba en donde se ingrea el rut de una persona ingresada anteriormente
		 */
//		String resultado2="";
//		resultado2 =Secretaria.agregarSecretaria(new Persona("Maria","Lopez","675446543"));
//		assertTrue(resultado2=="no se puedo ingresar a la secretaria");
	}

}
