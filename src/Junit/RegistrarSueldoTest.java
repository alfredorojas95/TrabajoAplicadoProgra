/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.Curso;
import Controlador.Finanza.Sueldo;

/**
 * @author Alfredo Rojas
 *
 */
public class RegistrarSueldoTest {

	/**
	 * Test method for {@link Controlador.Finanza.Sueldo#registrarSueldoProf(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testRegistrarSueldoProf() {
		String resultado="";
		//String rutProf, String rutAdm, int mes
		resultado = Sueldo.registrarSueldoProf("137657474", "135749802", 1);
		assertTrue(resultado=="Sueldo pagado exitosamente");
	}

}
