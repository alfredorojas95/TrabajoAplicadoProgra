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

public class Director {
	public Director() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_DIRECTOR_CURSO) {
			return ORM_curso;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private orm.Persona persona;
	
	private int id;
	
	private java.util.Set ORM_curso = new java.util.HashSet();
	
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
				persona.setDirector(this);
			}
			if (lpersona != null) {
				lpersona.setDirector(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	private void setORM_Curso(java.util.Set value) {
		this.ORM_curso = value;
	}
	
	private java.util.Set getORM_Curso() {
		return ORM_curso;
	}
	
	public final orm.CursoSetCollection curso = new orm.CursoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_DIRECTOR_CURSO, orm.ORMConstants.KEY_CURSO_DIRECTOR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
