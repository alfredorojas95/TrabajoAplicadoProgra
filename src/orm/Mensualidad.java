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

public class Mensualidad {
	public Mensualidad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MENSUALIDAD_SECRETARIA) {
			this.secretaria = (orm.Secretaria) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MENSUALIDAD_ESTUDIANTE) {
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
	
	private int mes;
	
	private int monto;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setMes(int value) {
		this.mes = value;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMonto(int value) {
		this.monto = value;
	}
	
	public int getMonto() {
		return monto;
	}
	
	public void setSecretaria(orm.Secretaria value) {
		if (secretaria != null) {
			secretaria.mensualidad.remove(this);
		}
		if (value != null) {
			value.mensualidad.add(this);
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
		if (estudiante != null) {
			estudiante.mensualidad.remove(this);
		}
		if (value != null) {
			value.mensualidad.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
