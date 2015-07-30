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

public class CursoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombreCurso;
	public final IntegerExpression estadocurso;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	public final IntegerExpression cupos;
	public final CollectionExpression curso_profesor;
	public final CollectionExpression estudiante_curso;
	
	public CursoDetachedCriteria() {
		super(orm.Curso.class, orm.CursoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombreCurso = new StringExpression("nombreCurso", this.getDetachedCriteria());
		estadocurso = new IntegerExpression("estadocurso", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
		cupos = new IntegerExpression("cupos", this.getDetachedCriteria());
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this.getDetachedCriteria());
		estudiante_curso = new CollectionExpression("ORM_Estudiante_curso", this.getDetachedCriteria());
	}
	
	public CursoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.CursoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombreCurso = new StringExpression("nombreCurso", this.getDetachedCriteria());
		estadocurso = new IntegerExpression("estadocurso", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
		cupos = new IntegerExpression("cupos", this.getDetachedCriteria());
		curso_profesor = new CollectionExpression("ORM_Curso_profesor", this.getDetachedCriteria());
		estudiante_curso = new CollectionExpression("ORM_Estudiante_curso", this.getDetachedCriteria());
	}
	
	public DirectorDetachedCriteria createDirectorCriteria() {
		return new DirectorDetachedCriteria(createCriteria("director"));
	}
	
	public Curso_profesorDetachedCriteria createCurso_profesorCriteria() {
		return new Curso_profesorDetachedCriteria(createCriteria("ORM_Curso_profesor"));
	}
	
	public Estudiante_cursoDetachedCriteria createEstudiante_cursoCriteria() {
		return new Estudiante_cursoDetachedCriteria(createCriteria("ORM_Estudiante_curso"));
	}
	
	public Curso uniqueCurso(PersistentSession session) {
		return (Curso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Curso[] listCurso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Curso[]) list.toArray(new Curso[list.size()]);
	}
}

