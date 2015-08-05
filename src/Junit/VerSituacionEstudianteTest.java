/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.StaffAcademico.Estudiante;

/**
 * @author Alfredo Rojas
 *
 */
public class VerSituacionEstudianteTest {

	/**
	 * Test method for {@link Controlador.Academico.StaffAcademico.Estudiante#obtenerSituacionEstudiante(java.lang.String)}.
	 */
	@Test
	public void testObtenerSituacionEstudiante() {
		String resultado="";
		resultado = Estudiante.obtenerSituacionEstudiante("155457641");
		System.out.println(resultado);
		assertTrue(resultado=="El promedio es: " + 5.0 + "\nLa asistencia es: " + 75.0 + "%");
	}

}
