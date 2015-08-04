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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SueldoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final IntegerExpression monto;
	public final IntegerExpression mes;
	public final IntegerExpression cantCursos;
	public final IntegerExpression estadoPago;
	
	public SueldoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this);
		jefeadministracion = new AssociationExpression("jefeadministracion", this);
		profesorId = new IntegerExpression("profesor.id", this);
		profesor = new AssociationExpression("profesor", this);
		monto = new IntegerExpression("monto", this);
		mes = new IntegerExpression("mes", this);
		cantCursos = new IntegerExpression("cantCursos", this);
		estadoPago = new IntegerExpression("estadoPago", this);
	}
	
	public SueldoCriteria(PersistentSession session) {
		this(session.createCriteria(Sueldo.class));
	}
	
	public SueldoCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public JefeadministracionCriteria createJefeadministracionCriteria() {
		return new JefeadministracionCriteria(createCriteria("jefeadministracion"));
	}
	
	public ProfesorCriteria createProfesorCriteria() {
		return new ProfesorCriteria(createCriteria("profesor"));
	}
	
	public Sueldo uniqueSueldo() {
		return (Sueldo) super.uniqueResult();
	}
	
	public Sueldo[] listSueldo() {
		java.util.List list = super.list();
		return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
	}
}

