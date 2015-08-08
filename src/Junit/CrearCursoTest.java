/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.Curso;
import Controlador.Finanza.Mensualidad;

/**
 * @author wilfri
 *
 */
public class CrearCursoTest {

	/**
	 * Test method for {@link Controlador.Academico.Curso#crearCurso(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCrearCurso() {
		/*
		 * prueba en que se crea exitosamente un curso
		 */
		String resultado="";
//		resultado = Curso.crearCurso("Calculo","135749802");
//		resultado = Curso.crearCurso("CalculoI","135749802");
		resultado = Curso.crearCurso("Física","135749802");
		System.out.println(resultado);
//		assertTrue(resultado=="se creo el curso exitosamente");
	}

}
