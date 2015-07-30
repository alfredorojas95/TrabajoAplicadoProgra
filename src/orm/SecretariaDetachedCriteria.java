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

public class SecretariaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression matricula;
	public final CollectionExpression mensualidad;
	
	public SecretariaDetachedCriteria() {
		super(orm.Secretaria.class, orm.SecretariaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		matricula = new CollectionExpression("ORM_Matricula", this.getDetachedCriteria());
		mensualidad = new CollectionExpression("ORM_Mensualidad", this.getDetachedCriteria());
	}
	
	public SecretariaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.SecretariaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		matricula = new CollectionExpression("ORM_Matricula", this.getDetachedCriteria());
		mensualidad = new CollectionExpression("ORM_Mensualidad", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public MatriculaDetachedCriteria createMatriculaCriteria() {
		return new MatriculaDetachedCriteria(createCriteria("ORM_Matricula"));
	}
	
	public MensualidadDetachedCriteria createMensualidadCriteria() {
		return new MensualidadDetachedCriteria(createCriteria("ORM_Mensualidad"));
	}
	
	public Secretaria uniqueSecretaria(PersistentSession session) {
		return (Secretaria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Secretaria[] listSecretaria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Secretaria[]) list.toArray(new Secretaria[list.size()]);
	}
}

