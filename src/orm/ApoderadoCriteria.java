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

public class ApoderadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression id;
	
	public ApoderadoCriteria(Criteria criteria) {
		super(criteria);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		id = new IntegerExpression("id", this);
	}
	
	public ApoderadoCriteria(PersistentSession session) {
		this(session.createCriteria(Apoderado.class));
	}
	
	public ApoderadoCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public Apoderado uniqueApoderado() {
		return (Apoderado) super.uniqueResult();
	}
	
	public Apoderado[] listApoderado() {
		java.util.List list = super.list();
		return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
	}
}

