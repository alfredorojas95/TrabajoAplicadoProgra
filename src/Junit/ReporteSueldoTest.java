/**
 * 
 */
package Junit;

import org.junit.Test;

import com.google.gson.Gson;

import Controlador.Finanza.Mensualidad;
import Controlador.Finanza.Sueldo;

/**
 * @author wilfri
 *
 */
public class ReporteSueldoTest {

	/**
	 * Test method for {@link Controlador.Finanza.Sueldo#consSueldoProf(java.lang.String)}.
	 */
	@Test
	public void testConsSueldoProf() {

		Gson gson = new Gson();
		String json=Sueldo.consSueldoProf("137657474");
		String[][] matriz = gson.fromJson(json, String[][].class);
		System.out.println(json);
	}

}
