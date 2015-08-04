/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.StaffAcademico.Estudiante;
import Controlador.Finanza.Mensualidad;

/**
 * @author Alfredo Rojas
 *
 */
public class PagarMensualidadTest {

	/**
	 * Test method for {@link Controlador.Finanza.Mensualidad#regPagoMensualidad(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testRegPagoMensualidad() {
		/*
		 * prueba en que se paga exitosamente una mensualidad
		 */
		String resultado="";
		resultado = Mensualidad.regPagoMensualidad("165643214","155457641",1);
		assertTrue(resultado=="se registró el pago de la mensualidad exitosamente");
	}

}
