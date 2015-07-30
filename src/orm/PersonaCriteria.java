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

public class PersonaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression rut;
	public final StringExpression pass;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	public final IntegerExpression profesorId;
	public final AssociationExpression profesor;
	public final IntegerExpression jefeadministracionId;
	public final AssociationExpression jefeadministracion;
	public final IntegerExpression estudianteId;
	public final AssociationExpression estudiante;
	public final IntegerExpression secretariaId;
	public final AssociationExpression secretaria;
	public final IntegerExpression apoderadoId;
	public final AssociationExpression apoderado;
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		rut = new StringExpression("rut", this);
		pass = new StringExpression("pass", this);
		directorId = new IntegerExpression("director.id", this);
		director = new AssociationExpression("director", this);
		profesorId = new IntegerExpression("profesor.id", this);
		profesor = new AssociationExpression("profesor", this);
		jefeadministracionId = new IntegerExpression("jefeadministracion.id", this);
		jefeadministracion = new AssociationExpression("jefeadministracion", this);
		estudianteId = new IntegerExpression("estudiante.id", this);
		estudiante = new AssociationExpression("estudiante", this);
		secretariaId = new IntegerExpression("secretaria.id", this);
		secretaria = new AssociationExpression("secretaria", this);
		apoderadoId = new IntegerExpression("apoderado.id", this);
		apoderado = new AssociationExpression("apoderado", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(orm.DBprueba2PersistentManager.instance().getSession());
	}
	
	public DirectorCriteria createDirectorCriteria() {
		return new DirectorCriteria(createCriteria("director"));
	}
	
	public ProfesorCriteria createProfesorCriteria() {
		return new ProfesorCriteria(createCriteria("profesor"));
	}
	
	public JefeadministracionCriteria createJefeadministracionCriteria() {
		return new JefeadministracionCriteria(createCriteria("jefeadministracion"));
	}
	
	public EstudianteCriteria createEstudianteCriteria() {
		return new EstudianteCriteria(createCriteria("estudiante"));
	}
	
	public SecretariaCriteria createSecretariaCriteria() {
		return new SecretariaCriteria(createCriteria("secretaria"));
	}
	
	public ApoderadoCriteria createApoderadoCriteria() {
		return new ApoderadoCriteria(createCriteria("apoderado"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

