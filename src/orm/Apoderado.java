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

public class Apoderado {
	public Apoderado() {
	}
	
	private orm.Persona persona;
	
	private int id;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona(orm.Persona value) {
		if (this.persona != value) {
			orm.Persona lpersona = this.persona;
			this.persona = value;
			if (value != null) {
				persona.setApoderado(this);
			}
			if (lpersona != null) {
				lpersona.setApoderado(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
