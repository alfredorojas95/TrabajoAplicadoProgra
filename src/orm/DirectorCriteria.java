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

public class DirectorCriteria extends AbstractORMCriteria {
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression id;
	public final CollectionExpression curso;
	
	public DirectorCriteria(Criteria criteria) {
		super(criteria);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		id = new IntegerExpression("id", this);
		curso = new CollectionExpression("ORM_Curso", this);
	}
	
	public DirectorCriteria(PersistentSession session) {
		this(session.createCriteria(Director.class));
	}
	
	public DirectorCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public CursoCriteria createCursoCriteria() {
		return new CursoCriteria(createCriteria("ORM_Curso"));
	}
	
	public Director uniqueDirector() {
		return (Director) super.uniqueResult();
	}
	
	public Director[] listDirector() {
		java.util.List list = super.list();
		return (Director[]) list.toArray(new Director[list.size()]);
	}
}

