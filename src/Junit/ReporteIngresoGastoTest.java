/**
 * 
 */
package Junit;

import org.junit.Test;
import Controlador.Reporte.Reporte;

/**
 * @author wilfri
 *
 */
public class ReporteIngresoGastoTest {

	/**
	 * Test method for {@link Controlador.Reporte.Reporte#obtenerBalanceIngGasto()}.
	 */
	@Test
	public void testObtenerBalanceIngGasto() {
		
		String [][]meses = Reporte.obtenerBalanceIngGasto();

		for (int i = 0; i < meses.length; i++) {
	
				System.out.println("Ingreso: "+ meses[i][0]+" gasto: "+ meses[i][1]+" Total: "+ meses[i][2]);
			
		}
	}

}
