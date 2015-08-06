/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.gson.Gson;

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
		
		//assertTrue(morosos!=null);
		
		Gson gson = new Gson();
		String json=Matricula.obtenerListMorososMatricula();
		String[][] matriz = gson.fromJson(json, String[][].class);
		System.out.println(json);

	}

}
