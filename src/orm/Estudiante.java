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

public class Estudiante {
	public Estudiante() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESTUDIANTE_ESTUDIANTE_CURSO) {
			return ORM_estudiante_curso;
		}
		else if (key == orm.ORMConstants.KEY_ESTUDIANTE_MENSUALIDAD) {
			return ORM_mensualidad;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ESTUDIANTE_PERSONA) {
			this.persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ESTUDIANTE_APODERADO) {
			this.apoderado = (orm.Apoderado) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ESTUDIANTE_MATRICULA) {
			this.matricula = (orm.Matricula) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona persona;
	
	private orm.Apoderado apoderado;
	
	private java.util.Set ORM_estudiante_curso = new java.util.HashSet();
	
	private orm.Matricula matricula;
	
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
				persona.setEstudiante(this);
			}
			if (lpersona != null) {
				lpersona.setEstudiante(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	public void setApoderado(orm.Apoderado value) {
		if (apoderado != null) {
			apoderado.estudiante.remove(this);
		}
		if (value != null) {
			value.estudiante.add(this);
		}
	}
	
	public orm.Apoderado getApoderado() {
		return apoderado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Apoderado(orm.Apoderado value) {
		this.apoderado = value;
	}
	
	private orm.Apoderado getORM_Apoderado() {
		return apoderado;
	}
	
	private void setORM_Estudiante_curso(java.util.Set value) {
		this.ORM_estudiante_curso = value;
	}
	
	private java.util.Set getORM_Estudiante_curso() {
		return ORM_estudiante_curso;
	}
	
	public final orm.Estudiante_cursoSetCollection estudiante_curso = new orm.Estudiante_cursoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESTUDIANTE_ESTUDIANTE_CURSO, orm.ORMConstants.KEY_ESTUDIANTE_CURSO_ESTUDIANTE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMatricula(orm.Matricula value) {
		if (this.matricula != value) {
			orm.Matricula lmatricula = this.matricula;
			this.matricula = value;
			if (value != null) {
				matricula.setEstudiante(this);
			}
			if (lmatricula != null) {
				lmatricula.setEstudiante(null);
			}
		}
	}
	
	public orm.Matricula getMatricula() {
		return matricula;
	}
	
	private void setORM_Mensualidad(java.util.Set value) {
		this.ORM_mensualidad = value;
	}
	
	private java.util.Set getORM_Mensualidad() {
		return ORM_mensualidad;
	}
	
	public final orm.MensualidadSetCollection mensualidad = new orm.MensualidadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESTUDIANTE_MENSUALIDAD, orm.ORMConstants.KEY_MENSUALIDAD_ESTUDIANTE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
