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
public class MorososMatriculaTest {

	/**
	 * Test method for {@link Controlador.Finanza.Matricula#obtenerListMorososMatricula()}.
	 */
	@Test
	public void testObtenerListMorososMatricula() {
		
		String [][]morosos = Matricula.obtenerListMorososMatricula();
		//assertTrue(morosos!=null);
		for (int i = 0; i < morosos.length; i++) {
	
				System.out.println("Nombre: "+ morosos[i][0]);
			
		}
	}

}
