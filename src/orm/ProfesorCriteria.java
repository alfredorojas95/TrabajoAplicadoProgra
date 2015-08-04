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

public class ProfesorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression curso_profesor;
	public final CollectionExpression sueldo;
	
	public ProfesorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this);
		sueldo = new CollectionExpression("ORM_Sueldo", this);
	}
	
	public ProfesorCriteria(PersistentSession session) {
		this(session.createCriteria(Profesor.class));
	}
	
	public ProfesorCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public Curso_profesorCriteria createCurso_profesorCriteria() {
		return new Curso_profesorCriteria(createCriteria("ORM_Curso_profesor"));
	}
	
	public SueldoCriteria createSueldoCriteria() {
		return new SueldoCriteria(createCriteria("ORM_Sueldo"));
	}
	
	public Profesor uniqueProfesor() {
		return (Profesor) super.uniqueResult();
	}
	
	public Profesor[] listProfesor() {
		java.util.List list = super.list();
		return (Profesor[]) list.toArray(new Profesor[list.size()]);
	}
}

