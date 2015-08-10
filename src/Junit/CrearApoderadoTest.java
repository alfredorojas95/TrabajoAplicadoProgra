package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Persona.Apoderado;

public class CrearApoderadoTest {

	@Test
	public void testAgregarNuevoApoderado() {
		String resultado="";
		resultado =Apoderado.agregarNuevoApoderado("Norma","Flores","182749802","123456");
		System.out.println(resultado);
		assertTrue(resultado=="Apoderado ingresado exitosamente");
	}

}
