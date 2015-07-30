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

public class Sueldo_profesorCriteria extends AbstractORMCriteria {
	public final IntegerExpression sueldoId;
	public final AssociationExpression sueldo;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	
	public Sueldo_profesorCriteria(Criteria criteria) {
		super(criteria);
		sueldoId = new IntegerExpression("ORM_Sueldo.id", this);
		sueldo = new AssociationExpression("ORM_Sueldo", this);
		profesorId = new IntegerExpression("ORM_Profesor.id", this);
		profesor = new AssociationExpression("ORM_Profesor", this);
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this);
		jefeadministracion = new AssociationExpression("jefeadministracion", this);
	}
	
	public Sueldo_profesorCriteria(PersistentSession session) {
		this(session.createCriteria(Sueldo_profesor.class));
	}
	
	public Sueldo_profesorCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public SueldoCriteria createSueldoCriteria() {
		return new SueldoCriteria(createCriteria("ORM_Sueldo"));
	}
	
	public ProfesorCriteria createProfesorCriteria() {
		return new ProfesorCriteria(createCriteria("ORM_Profesor"));
	}
	
	public JefeadministracionCriteria createJefeadministracionCriteria() {
		return new JefeadministracionCriteria(createCriteria("jefeadministracion"));
	}
	
	public Sueldo_profesor uniqueSueldo_profesor() {
		return (Sueldo_profesor) super.uniqueResult();
	}
	
	public Sueldo_profesor[] listSueldo_profesor() {
		java.util.List list = super.list();
		return (Sueldo_profesor[]) list.toArray(new Sueldo_profesor[list.size()]);
	}
}

