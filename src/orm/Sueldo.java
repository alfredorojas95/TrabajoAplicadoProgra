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
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_SUELDO_SUELDO_PROFESOR) {
			return ORM_sueldo_profesor;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private int monto;
	
	private int mes;
	
	private int cantCursos;
	
	private int estadoPago;
	
	private java.util.Set ORM_sueldo_profesor = new java.util.HashSet();
	
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
	
	private void setORM_Sueldo_profesor(java.util.Set value) {
		this.ORM_sueldo_profesor = value;
	}
	
	private java.util.Set getORM_Sueldo_profesor() {
		return ORM_sueldo_profesor;
	}
	
	public final orm.Sueldo_profesorSetCollection sueldo_profesor = new orm.Sueldo_profesorSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SUELDO_SUELDO_PROFESOR, orm.ORMConstants.KEY_SUELDO_PROFESOR_SUELDO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
