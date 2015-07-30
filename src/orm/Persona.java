/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Persona {
	public Persona() {
	}
	
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private String rut;
	
	private String pass;
	
	private orm.Director director;
	
	private orm.Profesor profesor;
	
	private orm.Jefeadministracion jefeadministracion;
	
	private orm.Estudiante estudiante;
	
	private orm.Secretaria secretaria;
	
	private orm.Apoderado apoderado;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setPass(String value) {
		this.pass = value;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setDirector(orm.Director value) {
		if (this.director != value) {
			orm.Director ldirector = this.director;
			this.director = value;
			if (value != null) {
				director.setPersona(this);
			}
			if (ldirector != null) {
				ldirector.setPersona(null);
			}
		}
	}
	
	public orm.Director getDirector() {
		return director;
	}
	
	public void setProfesor(orm.Profesor value) {
		if (this.profesor != value) {
			orm.Profesor lprofesor = this.profesor;
			this.profesor = value;
			if (value != null) {
				profesor.setPersona(this);
			}
			if (lprofesor != null) {
				lprofesor.setPersona(null);
			}
		}
	}
	
	public orm.Profesor getProfesor() {
		return profesor;
	}
	
	public void setJefeadministracion(orm.Jefeadministracion value) {
		if (this.jefeadministracion != value) {
			orm.Jefeadministracion ljefeadministracion = this.jefeadministracion;
			this.jefeadministracion = value;
			if (value != null) {
				jefeadministracion.setPersona(this);
			}
			if (ljefeadministracion != null) {
				ljefeadministracion.setPersona(null);
			}
		}
	}
	
	public orm.Jefeadministracion getJefeadministracion() {
		return jefeadministracion;
	}
	
	public void setEstudiante(orm.Estudiante value) {
		if (this.estudiante != value) {
			orm.Estudiante lestudiante = this.estudiante;
			this.estudiante = value;
			if (value != null) {
				estudiante.setPersona(this);
			}
			if (lestudiante != null) {
				lestudiante.setPersona(null);
			}
		}
	}
	
	public orm.Estudiante getEstudiante() {
		return estudiante;
	}
	
	public void setSecretaria(orm.Secretaria value) {
		if (this.secretaria != value) {
			orm.Secretaria lsecretaria = this.secretaria;
			this.secretaria = value;
			if (value != null) {
				secretaria.setPersona(this);
			}
			if (lsecretaria != null) {
				lsecretaria.setPersona(null);
			}
		}
	}
	
	public orm.Secretaria getSecretaria() {
		return secretaria;
	}
	
	public void setApoderado(orm.Apoderado value) {
		if (this.apoderado != value) {
			orm.Apoderado lapoderado = this.apoderado;
			this.apoderado = value;
			if (value != null) {
				apoderado.setPersona(this);
			}
			if (lapoderado != null) {
				lapoderado.setPersona(null);
			}
		}
	}
	
	public orm.Apoderado getApoderado() {
		return apoderado;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
