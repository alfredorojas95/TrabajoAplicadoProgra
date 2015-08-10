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
	 * Test method for {@link Controlador.Academico.StaffAcademico.Profesor#registrarPromedio(java.lang.String, int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testRegistrarPromedio() {
		String resultado="";
		//String rutEst, int idCurso, double nota, String rutProf
		resultado =Profesor.registrarPromedio("145457681", 14, "3.5", "137657474");//1
		System.out.println(resultado);
		assertTrue(resultado=="promedio del curso registrado");
	}

}
