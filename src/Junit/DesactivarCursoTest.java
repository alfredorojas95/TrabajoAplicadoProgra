/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.Curso;

/**
 * @author wilfri
 *
 */
public class DesactivarCursoTest {

	/**
	 * Test method for {@link Controlador.Academico.Curso#desactivarCurso(int, java.lang.String)}.
	 */
	@Test
	public void testDesactivarCurso() {
		String resultado="";
		//int id, String rutDirector
		resultado = Curso.desactivarCurso(1, "92749802");
		assertTrue(resultado=="Curso desactivado Exitosamente");
	}

}
