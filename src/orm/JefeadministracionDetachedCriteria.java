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

public class JefeadministracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression sueldo_profesor;
	
	public JefeadministracionDetachedCriteria() {
		super(orm.Jefeadministracion.class, orm.JefeadministracionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this.getDetachedCriteria());
	}
	
	public JefeadministracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.JefeadministracionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		sueldo_profesor = new CollectionExpression("ORM_Sueldo_profesor", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public Sueldo_profesorDetachedCriteria createSueldo_profesorCriteria() {
		return new Sueldo_profesorDetachedCriteria(createCriteria("ORM_Sueldo_profesor"));
	}
	
	public Jefeadministracion uniqueJefeadministracion(PersistentSession session) {
		return (Jefeadministracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Jefeadministracion[] listJefeadministracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Jefeadministracion[]) list.toArray(new Jefeadministracion[list.size()]);
	}
}

