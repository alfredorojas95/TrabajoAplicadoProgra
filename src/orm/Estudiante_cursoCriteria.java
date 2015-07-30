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

public class Estudiante_cursoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression cursoId;
	public final AssociationExpression curso;
	public final DoubleExpression promedio;
	public final DoubleExpression porcAsistencia;
	
	public Estudiante_cursoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		estudianteId = new IntegerExpression("estudiante.id", this);
		estudiante = new AssociationExpression("estudiante", this);
		cursoId = new IntegerExpression("curso.id", this);
		curso = new AssociationExpression("curso", this);
		promedio = new DoubleExpression("promedio", this);
		porcAsistencia = new DoubleExpression("porcAsistencia", this);
	}
	
	public Estudiante_cursoCriteria(PersistentSession session) {
		this(session.createCriteria(Estudiante_curso.class));
	}
	
	public Estudiante_cursoCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public EstudianteCriteria createEstudianteCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante"));
	}
	
	public CursoCriteria createCursoCriteria() {
		return new CursoCriteria(createCriteria("curso"));
	}
	
	public Estudiante_curso uniqueEstudiante_curso() {
		return (Estudiante_curso) super.uniqueResult();
	}
	
	public Estudiante_curso[] listEstudiante_curso() {
		java.util.List list = super.list();
		return (Estudiante_curso[]) list.toArray(new Estudiante_curso[list.size()]);
	}
}

