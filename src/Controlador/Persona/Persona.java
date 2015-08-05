package Controlador.Persona;

/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Persona {

	private String nombre;
	private String apellido;
	private String rut;
	private String pass;

	public Persona(String nombre, String apellido, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}
	
	public Persona(String nombre, String apellido, String rut, String pass) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.pass=pass;
	}
	
	public Persona(){
		super();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 * @return
	 */
	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	/**
	 * este método valida que los métodos validar rut, validaSoloLetras y validarPass sean "true"
	 * @return boolean 
	 */
	public boolean validarAtributos() {
		/*
		 * Si nombre y apellido son menores e iguales que 20, nombre y apellido
		 * estan compuestos de letras y la validacion del rut es verdadera se
		 * retorna una variable boolean true, de lo contrario se retorna false
		 */
		if (this.nombre.length() <= 20 && this.apellido.length() <= 20
				&& validarSoloLetras(this.nombre) && validarPass()
				&& validarSoloLetras(this.apellido) && validarRut()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que valida que la cantidad de dígitos del rut sea manor o igual a 9
	 * 
	 * @return boolean con el resultado de la operacion
	 */
	public boolean validarRut() {
		// Si el parametro ingresado se compone de numeros y su largo es 9, se
		// retorna true
		if (this.rut.matches("\\d*") == true && this.rut.length() <= 9) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que valida que una cadena ingresada por parametro se componga de
	 * solo letras
	 * @param cedena de texto
	 * @return boolean con el resultado de la operacion
	 */
	public boolean validarSoloLetras(String cedena) {
		// Si la cadena se compone de solo letras, se retorna true
		if (cedena.matches("([a-z]|[A-Z]|\\s)+")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * este método valida que la contraseña tenga mínimo 6 caracteres y máximo 15
	 * @return boolean 
	 */
	public boolean validarPass(){
		if (this.pass.length() > 5 && this.pass.length()<=15) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * 
	 * @param pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

}