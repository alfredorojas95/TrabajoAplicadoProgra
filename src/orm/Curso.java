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

public class Curso {
	public Curso() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CURSO_CURSO_PROFESOR) {
			return ORM_curso_profesor;
		}
		else if (key == orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO) {
			return ORM_estudiante_curso;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CURSO_DIRECTOR) {
			this.director = (orm.Director) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CURSO_JEFEADMINISTRACION) {
			this.jefeadministracion = (orm.Jefeadministracion) owner;
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
	
	private orm.Director director;
	
	private orm.Jefeadministracion jefeadministracion;
	
	private String nombreCurso;
	
	private Integer estadocurso;
	
	private Integer cupos;
	
	private java.util.Set ORM_curso_profesor = new java.util.HashSet();
	
	private java.util.Set ORM_estudiante_curso = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombreCurso(String value) {
		this.nombreCurso = value;
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}
	
	public void setEstadocurso(int value) {
		setEstadocurso(new Integer(value));
	}
	
	public void setEstadocurso(Integer value) {
		this.estadocurso = value;
	}
	
	public Integer getEstadocurso() {
		return estadocurso;
	}
	
	public void setCupos(int value) {
		setCupos(new Integer(value));
	}
	
	public void setCupos(Integer value) {
		this.cupos = value;
	}
	
	public Integer getCupos() {
		return cupos;
	}
	
	public void setDirector(orm.Director value) {
		if (director != null) {
			director.curso.remove(this);
		}
		if (value != null) {
			value.curso.add(this);
		}
	}
	
	public orm.Director getDirector() {
		return director;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Director(orm.Director value) {
		this.director = value;
	}
	
	private orm.Director getORM_Director() {
		return director;
	}
	
	public void setJefeadministracion(orm.Jefeadministracion value) {
		if (jefeadministracion != null) {
			jefeadministracion.curso.remove(this);
		}
		if (value != null) {
			value.curso.add(this);
		}
	}
	
	public orm.Jefeadministracion getJefeadministracion() {
		return jefeadministracion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jefeadministracion(orm.Jefeadministracion value) {
		this.jefeadministracion = value;
	}
	
	private orm.Jefeadministracion getORM_Jefeadministracion() {
		return jefeadministracion;
	}
	
	private void setORM_Curso_profesor(java.util.Set value) {
		this.ORM_curso_profesor = value;
	}
	
	private java.util.Set getORM_Curso_profesor() {
		return ORM_curso_profesor;
	}
	
	public final orm.Curso_profesorSetCollection curso_profesor = new orm.Curso_profesorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_CURSO_PROFESOR, orm.ORMConstants.KEY_CURSO_PROFESOR_CURSO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Estudiante_curso(java.util.Set value) {
		this.ORM_estudiante_curso = value;
	}
	
	private java.util.Set getORM_Estudiante_curso() {
		return ORM_estudiante_curso;
	}
	
	public final orm.Estudiante_cursoSetCollection estudiante_curso = new orm.Estudiante_cursoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CURSO_ESTUDIANTE_CURSO, orm.ORMConstants.KEY_ESTUDIANTE_CURSO_CURSO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
