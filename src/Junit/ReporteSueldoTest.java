/**
 * 
 */
package Junit;

import org.junit.Test;

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
		String [][]consulta = Sueldo.consSueldoProf("137657474");
		//assertTrue(morosos!=null);
		for (int i = 0; i < consulta.length; i++) {
	
				System.out.println("Nombre: "+ consulta[i][0]);
			
		}
	}

}
