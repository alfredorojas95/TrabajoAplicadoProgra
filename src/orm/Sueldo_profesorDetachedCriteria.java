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

public class Sueldo_profesorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression sueldoId;
	public final AssociationExpression sueldo;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	
	public Sueldo_profesorDetachedCriteria() {
		super(orm.Sueldo_profesor.class, orm.Sueldo_profesorCriteria.class);
		sueldoId = new IntegerExpression("ORM_Sueldo.id", this.getDetachedCriteria());
		sueldo = new AssociationExpression("ORM_Sueldo", this.getDetachedCriteria());
		profesorId = new IntegerExpression("ORM_Profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("ORM_Profesor", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
	}
	
	public Sueldo_profesorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Sueldo_profesorCriteria.class);
		sueldoId = new IntegerExpression("ORM_Sueldo.id", this.getDetachedCriteria());
		sueldo = new AssociationExpression("ORM_Sueldo", this.getDetachedCriteria());
		profesorId = new IntegerExpression("ORM_Profesor.id", this.getDetachedCriteria());
		profesor = new AssociationExpression("ORM_Profesor", this.getDetachedCriteria());
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this.getDetachedCriteria());
		jefeadministracion = new AssociationExpression("jefeadministracion", this.getDetachedCriteria());
	}
	
	public SueldoDetachedCriteria createSueldoCriteria() {
		return new SueldoDetachedCriteria(createCriteria("ORM_Sueldo"));
	}
	
	public ProfesorDetachedCriteria createProfesorCriteria() {
		return new ProfesorDetachedCriteria(createCriteria("ORM_Profesor"));
	}
	
	public JefeadministracionDetachedCriteria createJefeadministracionCriteria() {
		return new JefeadministracionDetachedCriteria(createCriteria("jefeadministracion"));
	}
	
	public Sueldo_profesor uniqueSueldo_profesor(PersistentSession session) {
		return (Sueldo_profesor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sueldo_profesor[] listSueldo_profesor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sueldo_profesor[]) list.toArray(new Sueldo_profesor[list.size()]);
	}
}

