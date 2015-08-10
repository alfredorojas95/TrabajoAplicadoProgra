/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.StaffAcademico.Profesor;

/**
 * @author wilfri
 *
 */
public class RegistrarAsistenciarTest {

	/**
	 * Test method for {@link Controlador.Academico.StaffAcademico.Profesor#registrarAsistencia(java.lang.String, int, double, java.lang.String)}.
	 */
	@Test
	public void testRegistrarAsistencia() {
		String resultado="";
		//String rutEst, int idCurso, double porcAsistencia, String rutProf
		resultado =Profesor.registrarAsistencia("155457671", 3, "15.5", "137657474");
		System.out.println(resultado);
		assertTrue(resultado=="Porcentaje de asistencia asignado");
	}

}
