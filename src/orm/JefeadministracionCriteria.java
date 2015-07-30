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

public class JefeadministracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression sueldo_profesor;
	
	public JefeadministracionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this);
	}
	
	public JefeadministracionCriteria(PersistentSession session) {
		this(session.createCriteria(Jefeadministracion.class));
	}
	
	public JefeadministracionCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public Sueldo_profesorCriteria createSueldo_profesorCriteria() {
		return new Sueldo_profesorCriteria(createCriteria("ORM_Sueldo_profesor"));
	}
	
	public Jefeadministracion uniqueJefeadministracion() {
		return (Jefeadministracion) super.uniqueResult();
	}
	
	public Jefeadministracion[] listJefeadministracion() {
		java.util.List list = super.list();
		return (Jefeadministracion[]) list.toArray(new Jefeadministracion[list.size()]);
	}
}

