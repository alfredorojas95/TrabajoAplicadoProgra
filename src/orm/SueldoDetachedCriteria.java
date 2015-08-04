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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SueldoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final IntegerExpression monto;
	public final IntegerExpression mes;
	public final IntegerExpression cantCursos;
	public final IntegerExpression estadoPago;
	
	public SueldoDetachedCriteria() {
		super(orm.Sueldo.class, orm.SueldoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		cantCursos = new IntegerExpression("cantCursos", this.getDetachedCriteria());
		estadoPago = new IntegerExpression("estadoPago", this.getDetachedCriteria());
	}
	
	public SueldoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.SueldoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		cantCursos = new IntegerExpression("cantCursos", this.getDetachedCriteria());
		estadoPago = new IntegerExpression("estadoPago", this.getDetachedCriteria());
	}
	
	public JefeadministracionDetachedCriteria createJefeadministracionCriteria() {
		return new JefeadministracionDetachedCriteria(createCriteria("jefeadministracion"));
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor"));
	}
	
	public Sueldo uniqueSueldo(PersistentSession session) {
		return (Sueldo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sueldo[] listSueldo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
	}
}

