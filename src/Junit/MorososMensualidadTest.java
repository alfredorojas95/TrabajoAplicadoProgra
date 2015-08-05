/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Finanza.Mensualidad;

/**
 * @author wilfri
 *
 */
public class MorososMensualidadTest {

	/**
	 * Test method for {@link Controlador.Finanza.Mensualidad#obtenerListMorososMensualidad(int)}.
	 */
	@Test
	public void testObtenerListMorososMensualidad() {
		
		String [][]morosos = Mensualidad.obtenerListMorososMensualidad(5);
		//assertTrue(morosos!=null);
		for (int i = 0; i < morosos.length; i++) {
	
				System.out.println("Nombre: "+ morosos[i][0]);
			
		}
	}

}
