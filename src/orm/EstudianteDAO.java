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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EstudianteDAO {
	public static Estudiante loadEstudianteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudianteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getEstudianteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudianteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getEstudianteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estudiante) session.load(orm.Estudiante.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estudiante) session.get(orm.Estudiante.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudiante) session.load(orm.Estudiante.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudiante) session.get(orm.Estudiante.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryEstudiante(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryEstudiante(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listEstudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listEstudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudiante", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstudiante(session, condition, orderBy);
			return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstudiante(session, condition, orderBy, lockMode);
			return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estudiante[] estudiantes = listEstudianteByQuery(session, condition, orderBy);
		if (estudiantes != null && estudiantes.length > 0)
			return estudiantes[0];
		else
			return null;
	}
	
	public static Estudiante loadEstudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estudiante[] estudiantes = listEstudianteByQuery(session, condition, orderBy, lockMode);
		if (estudiantes != null && estudiantes.length > 0)
			return estudiantes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateEstudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateEstudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudiante", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante createEstudiante() {
		return new orm.Estudiante();
	}
	
	public static boolean save(orm.Estudiante estudiante) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Estudiante estudiante) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estudiante estudiante)throws PersistentException {
		try {
			if(estudiante.getPersona() != null) {
				estudiante.getPersona().setEstudiante(null);
			}
			
			if(estudiante.getApoderado() != null) {
				estudiante.getApoderado().estudiante.remove(estudiante);
			}
			
			orm.Estudiante_curso[] lEstudiante_cursos = estudiante.estudiante_curso.toArray();
			for(int i = 0; i < lEstudiante_cursos.length; i++) {
				lEstudiante_cursos[i].setEstudiante(null);
			}
			if(estudiante.getMatricula() != null) {
				estudiante.getMatricula().setEstudiante(null);
			}
			
			orm.Mensualidad[] lMensualidads = estudiante.mensualidad.toArray();
			for(int i = 0; i < lMensualidads.length; i++) {
				lMensualidads[i].setEstudiante(null);
			}
			return delete(estudiante);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estudiante estudiante, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(estudiante.getPersona() != null) {
				estudiante.getPersona().setEstudiante(null);
			}
			
			if(estudiante.getApoderado() != null) {
				estudiante.getApoderado().estudiante.remove(estudiante);
			}
			
			orm.Estudiante_curso[] lEstudiante_cursos = estudiante.estudiante_curso.toArray();
			for(int i = 0; i < lEstudiante_cursos.length; i++) {
				lEstudiante_cursos[i].setEstudiante(null);
			}
			if(estudiante.getMatricula() != null) {
				estudiante.getMatricula().setEstudiante(null);
			}
			
			orm.Mensualidad[] lMensualidads = estudiante.mensualidad.toArray();
			for(int i = 0; i < lMensualidads.length; i++) {
				lMensualidads[i].setEstudiante(null);
			}
			try {
				session.delete(estudiante);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Estudiante estudiante) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Estudiante estudiante) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByCriteria(EstudianteCriteria estudianteCriteria) {
		Estudiante[] estudiantes = listEstudianteByCriteria(estudianteCriteria);
		if(estudiantes == null || estudiantes.length == 0) {
			return null;
		}
		return estudiantes[0];
	}
	
	public static Estudiante[] listEstudianteByCriteria(EstudianteCriteria estudianteCriteria) {
		return estudianteCriteria.listEstudiante();
	}
}
