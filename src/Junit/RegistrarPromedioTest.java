/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.StaffAcademico.Profesor;

/**
 * @author wilfri
 *
 */
public class RegistrarPromedioTest {

	/**
	 * Test method for {@link Controlador.Academico.StaffAcademico.Profesor#registrarPromedio(java.lang.String, int, double, java.lang.String)}.
	 */
	@Test
	public void testRegistrarPromedio() {
		String resultado="";
		//String rutEst, int idCurso, double nota, String rutProf
		resultado =Profesor.registrarPromedio("155457641", 2, 4.5, "137657474");
		assertTrue(resultado=="promedio del curso registrado");
	}

}
