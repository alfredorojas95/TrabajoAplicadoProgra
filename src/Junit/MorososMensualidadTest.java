/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.gson.Gson;

import Controlador.Finanza.Matricula;
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
		
		//assertTrue(morosos!=null);
		Gson gson = new Gson();
		String json=Mensualidad.obtenerListMorososMensualidad(5);
		String[][] matriz = gson.fromJson(json, String[][].class);
		System.out.println(json);
	}

}
