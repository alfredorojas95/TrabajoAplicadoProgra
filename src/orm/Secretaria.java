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

public class Secretaria {
	public Secretaria() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_SECRETARIA_MATRICULA) {
			return ORM_matricula;
		}
		else if (key == orm.ORMConstants.KEY_SECRETARIA_MENSUALIDAD) {
			return ORM_mensualidad;
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
	
	private java.util.Set ORM_matricula = new java.util.HashSet();
	
	private java.util.Set ORM_mensualidad = new java.util.HashSet();
	
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
				persona.setSecretaria(this);
			}
			if (lpersona != null) {
				lpersona.setSecretaria(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	private void setORM_Matricula(java.util.Set value) {
		this.ORM_matricula = value;
	}
	
	private java.util.Set getORM_Matricula() {
		return ORM_matricula;
	}
	
	public final orm.MatriculaSetCollection matricula = new orm.MatriculaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SECRETARIA_MATRICULA, orm.ORMConstants.KEY_MATRICULA_SECRETARIA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Mensualidad(java.util.Set value) {
		this.ORM_mensualidad = value;
	}
	
	private java.util.Set getORM_Mensualidad() {
		return ORM_mensualidad;
	}
	
	public final orm.MensualidadSetCollection mensualidad = new orm.MensualidadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SECRETARIA_MENSUALIDAD, orm.ORMConstants.KEY_MENSUALIDAD_SECRETARIA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
