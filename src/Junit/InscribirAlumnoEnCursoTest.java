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
public class InscribirAlumnoEnCursoTest {

	/**
	 * Test method for {@link Controlador.Academico.Curso#inscribirEstudiantes(int, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testInscribirEstudiantes() {
		String resultado="";
		//int idCurso, String rutEstudiante, String rutProf
		resultado = Curso.inscribirEstudiantes(3, "145457641", "137657474");
		assertTrue(resultado=="Este estudiante ya había sido asignado a este curso");
	}

}
