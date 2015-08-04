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

public class Sueldo {
	public Sueldo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_SUELDO_PROFESOR) {
			this.profesor = (orm.Profesor) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_SUELDO_JEFEADMINISTRACION) {
			this.jefeadministracion = (orm.Jefeadministracion) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Jefeadministracion jefeadministracion;
	
	private orm.Profesor profesor;
	
	private int monto;
	
	private int mes;
	
	private int cantCursos;
	
	private int estadoPago;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setMonto(int value) {
		this.monto = value;
	}
	
	public int getMonto() {
		return monto;
	}
	
	public void setMes(int value) {
		this.mes = value;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setCantCursos(int value) {
		this.cantCursos = value;
	}
	
	public int getCantCursos() {
		return cantCursos;
	}
	
	public void setEstadoPago(int value) {
		this.estadoPago = value;
	}
	
	public int getEstadoPago() {
		return estadoPago;
	}
	
	public void setProfesor(orm.Profesor value) {
		if (profesor != null) {
			profesor.sueldo.remove(this);
		}
		if (value != null) {
			value.sueldo.add(this);
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
			jefeadministracion.sueldo.remove(this);
		}
		if (value != null) {
			value.sueldo.add(this);
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
		return String.valueOf(getId());
	}
	
}
