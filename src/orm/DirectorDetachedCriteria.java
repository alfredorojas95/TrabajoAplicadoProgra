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

public class DirectorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression id;
	public final CollectionExpression curso;
	
	public DirectorDetachedCriteria() {
		super(orm.Director.class, orm.DirectorCriteria.class);
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		id = new IntegerExpression("id", this.getDetachedCriteria());
		curso = new CollectionExpression("ORM_Curso", this.getDetachedCriteria());
	}
	
	public DirectorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.DirectorCriteria.class);
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		id = new IntegerExpression("id", this.getDetachedCriteria());
		curso = new CollectionExpression("ORM_Curso", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public CursoDetachedCriteria createCursoCriteria() {
		return new CursoDetachedCriteria(createCriteria("ORM_Curso"));
	}
	
	public Director uniqueDirector(PersistentSession session) {
		return (Director) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Director[] listDirector(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Director[]) list.toArray(new Director[list.size()]);
	}
}

