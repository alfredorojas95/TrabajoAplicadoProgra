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

public class ApoderadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression estudiante;
	
	public ApoderadoDetachedCriteria() {
		super(orm.Apoderado.class, orm.ApoderadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		estudiante = new CollectionExpression("ORM_Estudiante", this.getDetachedCriteria());
	}
	
	public ApoderadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ApoderadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		estudiante = new CollectionExpression("ORM_Estudiante", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("ORM_Estudiante"));
	}
	
	public Apoderado uniqueApoderado(PersistentSession session) {
		return (Apoderado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Apoderado[] listApoderado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
	}
}

