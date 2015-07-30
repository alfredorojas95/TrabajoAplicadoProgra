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

public class MensualidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression mes;
	public final IntegerExpression monto;
	
	public MensualidadDetachedCriteria() {
		super(orm.Mensualidad.class, orm.MensualidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
	}
	
	public MensualidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MensualidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		secretariaId = new IntegerExpression("secretaria.id", this.getDetachedCriteria());
		secretaria = new AssociationExpression("secretaria", this.getDetachedCriteria());
		estudianteId = new IntegerExpression("estudiante.id", this.getDetachedCriteria());
		estudiante = new AssociationExpression("estudiante", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
	}
	
	public SecretariaDetachedCriteria createSecretariaCriteria() {
		return new SecretariaDetachedCriteria(createCriteria("secretaria"));
	}
	
	public EstudianteDetachedCriteria createEstudianteCriteria() {
		return new EstudianteDetachedCriteria(createCriteria("estudiante"));
	}
	
	public Mensualidad uniqueMensualidad(PersistentSession session) {
		return (Mensualidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensualidad[] listMensualidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensualidad[]) list.toArray(new Mensualidad[list.size()]);
	}
}

