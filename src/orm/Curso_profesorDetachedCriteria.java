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

public class Curso_profesorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cursoId;
	public final AssociationExpression curso;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	
	public Curso_profesorDetachedCriteria() {
		super(orm.Curso_profesor.class, orm.Curso_profesorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cursoId = new IntegerExpression("curso.id", this.getDetachedCriteria());
		curso = new AssociationExpression("curso", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
	}
	
	public Curso_profesorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Curso_profesorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cursoId = new IntegerExpression("curso.id", this.getDetachedCriteria());
		curso = new AssociationExpression("curso", this.getDetachedCriteria());
		profesorId = new IntegerExpression("profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("profesor", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria createCursoCriteria() {
		return new CursoDetachedCriteria(createCriteria("curso"));
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("profesor"));
	}
	
	public Curso_profesor uniqueCurso_profesor(PersistentSession session) {
		return (Curso_profesor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Curso_profesor[] listCurso_profesor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Curso_profesor[]) list.toArray(new Curso_profesor[list.size()]);
	}
}

