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

import java.io.Serializable;
public class Sueldo_profesor implements Serializable {
	public Sueldo_profesor() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Sueldo_profesor))
			return false;
		Sueldo_profesor sueldo_profesor = (Sueldo_profesor)aObj;
		if (getSueldo() == null) {
			if (sueldo_profesor.getSueldo() != null)
				return false;
		}
		else if (!getSueldo().equals(sueldo_profesor.getSueldo()))
			return false;
		if (getProfesor() == null) {
			if (sueldo_profesor.getProfesor() != null)
				return false;
		}
		else if (!getProfesor().equals(sueldo_profesor.getProfesor()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getSueldo() != null) {
			hashcode = hashcode + (int) getSueldo().getORMID();
		}
		if (getProfesor() != null) {
			hashcode = hashcode + (int) getProfesor().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_SUELDO_PROFESOR_SUELDO) {
			this.sueldo = (orm.Sueldo) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_SUELDO_PROFESOR_PROFESOR) {
			this.profesor = (orm.Profesor) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_SUELDO_PROFESOR_JEFEADMINISTRACION) {
			this.jefeadministracion = (orm.Jefeadministracion) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private orm.Sueldo sueldo;
	
	private int sueldoId;
	
	private void setSueldoId(int value) {
		this.sueldoId = value;
	}
	
	public int getSueldoId() {
		return sueldoId;
	}
	
	private orm.Profesor profesor;
	
	private int profesorId;
	
	private void setProfesorId(int value) {
		this.profesorId = value;
	}
	
	public int getProfesorId() {
		return profesorId;
	}
	
	private orm.Jefeadministracion jefeadministracion;
	
	public void setSueldo(orm.Sueldo value) {
		if (sueldo != null) {
			sueldo.sueldo_profesor.remove(this);
		}
		if (value != null) {
			value.sueldo_profesor.add(this);
		}
	}
	
	public orm.Sueldo getSueldo() {
		return sueldo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Sueldo(orm.Sueldo value) {
		this.sueldo = value;
	}
	
	private orm.Sueldo getORM_Sueldo() {
		return sueldo;
	}
	
	public void setProfesor(orm.Profesor value) {
		if (profesor != null) {
			profesor.sueldo_profesor.remove(this);
		}
		if (value != null) {
			value.sueldo_profesor.add(this);
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
	
	public void setJefeadministracion(orm.Jefeadministracion value) {
		if (jefeadministracion != null) {
			jefeadministracion.sueldo_profesor.remove(this);
		}
		if (value != null) {
			value.sueldo_profesor.add(this);
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
	
	public String toString() {
		return String.valueOf(((getSueldo() == null) ? "" : String.valueOf(getSueldo().getORMID())) + " " + ((getProfesor() == null) ? "" : String.valueOf(getProfesor().getORMID())));
	}
	
}
