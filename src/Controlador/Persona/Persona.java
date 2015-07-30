package Controlador.Persona;

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
	 * Metodo que valida que el rut este compuesto de 9 numeros
	 * 
	 * @return booleano con el resultado de la operacion
	 */
	public boolean validarRut() {
		// Si el parametro ingresado se compone de numeros y su largo es 9, se
		// retorna true
		if (this.rut.matches("\\d*") == true && this.rut.length() == 9) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que valida que una cadena ingresada por parametro se componga de
	 * solo letras
	 * 
	 * @param cedena
	 *            de texto
	 * @return booleano con el resultado de la operacion
	 */
	public boolean validarSoloLetras(String cedena) {
		// Si la cadena se compone de solo letras, se retorna true
		if (cedena.matches("([a-z]|[A-Z]|\\s)+")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validarPass(){
		if (this.rut.length() > 5 && this.rut.length()<=15) {
			return true;
		} else {
			return false;
		}
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}