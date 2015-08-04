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

public class MatriculaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression estadoMatricula;
	public final IntegerExpression monto;
	
	public MatriculaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		secretariaId = new IntegerExpression("secretaria.id", this);
		secretaria = new AssociationExpression("secretaria", this);
		estudianteId = new IntegerExpression("estudiante.id", this);
		estudiante = new AssociationExpression("estudiante", this);
		estadoMatricula = new IntegerExpression("estadoMatricula", this);
		monto = new IntegerExpression("monto", this);
	}
	
	public MatriculaCriteria(PersistentSession session) {
		this(session.createCriteria(Matricula.class));
	}
	
	public MatriculaCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public SecretariaCriteria createSecretariaCriteria() {
		return new SecretariaCriteria(createCriteria("secretaria"));
	}
	
	public EstudianteCriteria createEstudianteCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante"));
	}
	
	public Matricula uniqueMatricula() {
		return (Matricula) super.uniqueResult();
	}
	
	public Matricula[] listMatricula() {
		java.util.List list = super.list();
		return (Matricula[]) list.toArray(new Matricula[list.size()]);
	}
}

