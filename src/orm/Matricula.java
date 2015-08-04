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

public class Matricula {
	public Matricula() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MATRICULA_SECRETARIA) {
			this.secretaria = (orm.Secretaria) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MATRICULA_ESTUDIANTE) {
			this.estudiante = (orm.Estudiante) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Secretaria secretaria;
	
	private orm.Estudiante estudiante;
	
	private Integer estadoMatricula;
	
	private Integer monto;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEstadoMatricula(int value) {
		setEstadoMatricula(new Integer(value));
	}
	
	public void setEstadoMatricula(Integer value) {
		this.estadoMatricula = value;
	}
	
	public Integer getEstadoMatricula() {
		return estadoMatricula;
	}
	
	public void setMonto(int value) {
		setMonto(new Integer(value));
	}
	
	public void setMonto(Integer value) {
		this.monto = value;
	}
	
	public Integer getMonto() {
		return monto;
	}
	
	public void setSecretaria(orm.Secretaria value) {
		if (secretaria != null) {
			secretaria.matricula.remove(this);
		}
		if (value != null) {
			value.matricula.add(this);
		}
	}
	
	public orm.Secretaria getSecretaria() {
		return secretaria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Secretaria(orm.Secretaria value) {
		this.secretaria = value;
	}
	
	private orm.Secretaria getORM_Secretaria() {
		return secretaria;
	}
	
	public void setEstudiante(orm.Estudiante value) {
		if (this.estudiante != value) {
			orm.Estudiante lestudiante = this.estudiante;
			this.estudiante = value;
			if (value != null) {
				estudiante.setMatricula(this);
			}
			if (lestudiante != null) {
				lestudiante.setMatricula(null);
			}
		}
	}
	
	public orm.Estudiante getEstudiante() {
		return estudiante;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
