/**
 * 
 */
package Junit;

import org.junit.Test;

import com.google.gson.Gson;

import Controlador.Finanza.Sueldo;
import Controlador.Reporte.Reporte;

/**
 * @author Alfredo Rojas
 *
 */
public class ReporteIngresoGastoTest {

	/**
	 * Test method for {@link Controlador.Reporte.Reporte#obtenerBalanceIngGasto()}.
	 */
	@Test
	public void testObtenerBalanceIngGasto() {
		
		Gson gson = new Gson();
		String json=Reporte.obtenerBalanceIngGasto();
		String[][] matriz = gson.fromJson(json, String[][].class);
		System.out.println(json);
	}

}
