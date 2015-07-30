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

public class Estudiante_curso {
	public Estudiante_curso() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ESTUDIANTE_CURSO_ESTUDIANTE) {
			this.estudiante = (orm.Estudiante) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_ESTUDIANTE_CURSO_CURSO) {
			this.curso = (orm.Curso) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Estudiante estudiante;
	
	private orm.Curso curso;
	
	private Double promedio;
	
	private Double porcAsistencia;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPromedio(double value) {
		setPromedio(new Double(value));
	}
	
	public void setPromedio(Double value) {
		this.promedio = value;
	}
	
	public Double getPromedio() {
		return promedio;
	}
	
	public void setPorcAsistencia(double value) {
		setPorcAsistencia(new Double(value));
	}
	
	public void setPorcAsistencia(Double value) {
		this.porcAsistencia = value;
	}
	
	public Double getPorcAsistencia() {
		return porcAsistencia;
	}
	
	public void setEstudiante(orm.Estudiante value) {
		if (estudiante != null) {
			estudiante.estudiante_curso.remove(this);
		}
		if (value != null) {
			value.estudiante_curso.add(this);
		}
	}
	
	public orm.Estudiante getEstudiante() {
		return estudiante;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estudiante(orm.Estudiante value) {
		this.estudiante = value;
	}
	
	private orm.Estudiante getORM_Estudiante() {
		return estudiante;
	}
	
	public void setCurso(orm.Curso value) {
		if (curso != null) {
			curso.estudiante_curso.remove(this);
		}
		if (value != null) {
			value.estudiante_curso.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
