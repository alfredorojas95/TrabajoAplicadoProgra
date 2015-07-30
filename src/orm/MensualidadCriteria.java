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

public class MensualidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression mes;
	public final IntegerExpression monto;
	
	public MensualidadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		secretariaId = new IntegerExpression("secretaria.id", this);
		secretaria = new AssociationExpression("secretaria", this);
		estudianteId = new IntegerExpression("estudiante.id", this);
		estudiante = new AssociationExpression("estudiante", this);
		mes = new IntegerExpression("mes", this);
		monto = new IntegerExpression("monto", this);
	}
	
	public MensualidadCriteria(PersistentSession session) {
		this(session.createCriteria(Mensualidad.class));
	}
	
	public MensualidadCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public SecretariaCriteria createSecretariaCriteria() {
		return new SecretariaCriteria(createCriteria("secretaria"));
	}
	
	public EstudianteCriteria createEstudianteCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante"));
	}
	
	public Mensualidad uniqueMensualidad() {
		return (Mensualidad) super.uniqueResult();
	}
	
	public Mensualidad[] listMensualidad() {
		java.util.List list = super.list();
		return (Mensualidad[]) list.toArray(new Mensualidad[list.size()]);
	}
}

