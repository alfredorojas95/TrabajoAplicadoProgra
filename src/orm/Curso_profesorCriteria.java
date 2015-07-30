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

public class Curso_profesorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cursoId;
	public final AssociationExpression curso;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	
	public Curso_profesorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		cursoId = new IntegerExpression("curso.id", this);
		curso = new AssociationExpression("curso", this);
		profesorId = new IntegerExpression("profesor.id", this);
		profesor = new AssociationExpression("profesor", this);
	}
	
	public Curso_profesorCriteria(PersistentSession session) {
		this(session.createCriteria(Curso_profesor.class));
	}
	
	public Curso_profesorCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public CursoCriteria createCursoCriteria() {
		return new CursoCriteria(createCriteria("curso"));
	}
	
	public ProfesorCriteria createProfesorCriteria() {
		return new ProfesorCriteria(createCriteria("profesor"));
	}
	
	public Curso_profesor uniqueCurso_profesor() {
		return (Curso_profesor) super.uniqueResult();
	}
	
	public Curso_profesor[] listCurso_profesor() {
		java.util.List list = super.list();
		return (Curso_profesor[]) list.toArray(new Curso_profesor[list.size()]);
	}
}

