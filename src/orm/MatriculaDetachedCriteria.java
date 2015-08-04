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

public class MatriculaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression estadoMatricula;
	public final IntegerExpression monto;
	
	public MatriculaDetachedCriteria() {
		super(orm.Matricula.class, orm.MatriculaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		estadoMatricula = new IntegerExpression("estadoMatricula", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
	}
	
	public MatriculaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MatriculaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		estadoMatricula = new IntegerExpression("estadoMatricula", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
	}
	
	public SecretariaDetachedCriteria createSecretariaCriteria() {
		return new SecretariaDetachedCriteria(createCriteria("secretaria"));
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante"));
	}
	
	public Matricula uniqueMatricula(PersistentSession session) {
		return (Matricula) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Matricula[] listMatricula(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Matricula[]) list.toArray(new Matricula[list.size()]);
	}
}

