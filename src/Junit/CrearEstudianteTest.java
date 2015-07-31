/**
 * 
 */
package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.Academico.StaffAcademico.Estudiante;
import Controlador.Persona.Persona;

/**
 * @author wilfri
 *
 */
public class CrearEstudianteTest {

	/**
	 * Test method for {@link Controlador.Academico.StaffAcademico.Estudiante#agregarNuevoEstudiante(Controlador.Persona.Persona, java.lang.String)}.
	 */
	@Test
	public void testAgregarNuevoEstudiante() {
		/*
		 * prueba en que se agrega exitosamente un nuevo estudiante
		 */
		String resultado="";
		resultado = Estudiante.agregarNuevoEstudiante(new Persona("Henry","Gatica","155457641","1234"), "165643214");
		assertTrue(resultado=="Se ingreso nuevo alumno correctamente");
		
		
		/*
		 * prueba en la que el rut ya había sido ingresado
		 */
//		String resultado2="";
//		resultado2 = Estudiante.agregarNuevoEstudiante(new Persona("Javier","Machuca","144894139"), "765546543");
//		assertTrue(resultado2=="no se pudo agregar el estudiante");
	}

}
