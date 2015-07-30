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

public class Jefeadministracion {
	public Jefeadministracion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_JEFEADMINISTRACION_SUELDO_PROFESOR) {
			return ORM_sueldo_profesor;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private orm.Persona persona;
	
	private java.util.Set ORM_sueldo_profesor = new java.util.HashSet();
	
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
				persona.setJefeadministracion(this);
			}
			if (lpersona != null) {
				lpersona.setJefeadministracion(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	private void setORM_Sueldo_profesor(java.util.Set value) {
		this.ORM_sueldo_profesor = value;
	}
	
	private java.util.Set getORM_Sueldo_profesor() {
		return ORM_sueldo_profesor;
	}
	
	public final orm.Sueldo_profesorSetCollection sueldo_profesor = new orm.Sueldo_profesorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_JEFEADMINISTRACION_SUELDO_PROFESOR, orm.ORMConstants.KEY_SUELDO_PROFESOR_JEFEADMINISTRACION, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
