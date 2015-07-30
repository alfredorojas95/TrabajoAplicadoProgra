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

public class Curso_profesor {
	public Curso_profesor() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CURSO_PROFESOR_CURSO) {
			this.curso = (orm.Curso) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CURSO_PROFESOR_PROFESOR) {
			this.profesor = (orm.Profesor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Curso curso;
	
	private orm.Profesor profesor;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCurso(orm.Curso value) {
		if (curso != null) {
			curso.curso_profesor.remove(this);
		}
		if (value != null) {
			value.curso_profesor.add(this);
		}
	}
	
	public orm.Curso getCurso() {
		return curso;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Curso(orm.Curso value) {
		this.curso = value;
	}
	
	private orm.Curso getORM_Curso() {
		return curso;
	}
	
	public void setProfesor(orm.Profesor value) {
		if (profesor != null) {
			profesor.curso_profesor.remove(this);
		}
		if (value != null) {
			value.curso_profesor.add(this);
		}
	}
	
	public orm.Profesor getProfesor() {
		return profesor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Profesor(orm.Profesor value) {
		this.profesor = value;
	}
	
	private orm.Profesor getORM_Profesor() {
		return profesor;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
