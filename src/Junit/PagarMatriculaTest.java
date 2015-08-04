/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Finanza.Matricula;

/**
 * @author wilfri
 *
 */
public class PagarMatriculaTest {

	/**
	 * Test method for {@link Controlador.Finanza.Matricula#pagarMatricula(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testPagarMatricula() {
		/*
		 * prueba para pagar la matrícula de un estudiante 
		 */
		String resultado="";
		resultado =Matricula.pagarMatricula("145457641", "165643214");
		assertTrue(resultado=="matricula pagada exitosamente");
	
		/*
		 * prueba para pagar la matrícula de un estudiante 
		 */
//		String resultado2="";
//		resultado2 =Matricula.pagarMatricula("196457233", "765546543");
//		assertTrue(resultado2=="no se puedo pagar la matrícula");
	}

}
