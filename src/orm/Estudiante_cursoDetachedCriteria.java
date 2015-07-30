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

public class Estudiante_cursoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression cursoId;
	public final AssociationExpression curso;
	public final DoubleExpression promedio;
	public final DoubleExpression porcAsistencia;
	
	public Estudiante_cursoDetachedCriteria() {
		super(orm.Estudiante_curso.class, orm.Estudiante_cursoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		cursoId = new IntegerExpression("curso.id", this.getDetachedCriteria());
		curso = new AssociationExpression("curso", this.getDetachedCriteria());
		promedio = new DoubleExpression("promedio", this.getDetachedCriteria());
		porcAsistencia = new DoubleExpression("porcAsistencia", this.getDetachedCriteria());
	}
	
	public Estudiante_cursoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Estudiante_cursoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		cursoId = new IntegerExpression("curso.id", this.getDetachedCriteria());
		curso = new AssociationExpression("curso", this.getDetachedCriteria());
		promedio = new DoubleExpression("promedio", this.getDetachedCriteria());
		porcAsistencia = new DoubleExpression("porcAsistencia", this.getDetachedCriteria());
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante"));
	}
	
	public CursoDetachedCriteria createCursoCriteria() {
		return new CursoDetachedCriteria(createCriteria("curso"));
	}
	
	public Estudiante_curso uniqueEstudiante_curso(PersistentSession session) {
		return (Estudiante_curso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estudiante_curso[] listEstudiante_curso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estudiante_curso[]) list.toArray(new Estudiante_curso[list.size()]);
	}
}

