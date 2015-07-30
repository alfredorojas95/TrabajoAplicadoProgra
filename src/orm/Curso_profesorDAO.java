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

public class Curso_profesorDAO {
	public static Curso_profesor loadCurso_profesorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadCurso_profesorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor getCurso_profesorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getCurso_profesorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadCurso_profesorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor getCurso_profesorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getCurso_profesorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Curso_profesor) session.load(orm.Curso_profesor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor getCurso_profesorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Curso_profesor) session.get(orm.Curso_profesor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso_profesor) session.load(orm.Curso_profesor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor getCurso_profesorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso_profesor) session.get(orm.Curso_profesor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_profesor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryCurso_profesor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_profesor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryCurso_profesor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor[] listCurso_profesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listCurso_profesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor[] listCurso_profesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listCurso_profesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso_profesor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_profesor as Curso_profesor");
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
	
	public static List queryCurso_profesor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_profesor as Curso_profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso_profesor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor[] listCurso_profesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCurso_profesor(session, condition, orderBy);
			return (Curso_profesor[]) list.toArray(new Curso_profesor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor[] listCurso_profesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCurso_profesor(session, condition, orderBy, lockMode);
			return (Curso_profesor[]) list.toArray(new Curso_profesor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadCurso_profesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadCurso_profesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Curso_profesor[] curso_profesors = listCurso_profesorByQuery(session, condition, orderBy);
		if (curso_profesors != null && curso_profesors.length > 0)
			return curso_profesors[0];
		else
			return null;
	}
	
	public static Curso_profesor loadCurso_profesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Curso_profesor[] curso_profesors = listCurso_profesorByQuery(session, condition, orderBy, lockMode);
		if (curso_profesors != null && curso_profesors.length > 0)
			return curso_profesors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCurso_profesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateCurso_profesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurso_profesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateCurso_profesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCurso_profesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_profesor as Curso_profesor");
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
	
	public static java.util.Iterator iterateCurso_profesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Curso_profesor as Curso_profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso_profesor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor createCurso_profesor() {
		return new orm.Curso_profesor();
	}
	
	public static boolean save(orm.Curso_profesor curso_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(curso_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Curso_profesor curso_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(curso_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Curso_profesor curso_profesor)throws PersistentException {
		try {
			if(curso_profesor.getCurso() != null) {
				curso_profesor.getCurso().curso_profesor.remove(curso_profesor);
			}
			
			if(curso_profesor.getProfesor() != null) {
				curso_profesor.getProfesor().curso_profesor.remove(curso_profesor);
			}
			
			return delete(curso_profesor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Curso_profesor curso_profesor, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(curso_profesor.getCurso() != null) {
				curso_profesor.getCurso().curso_profesor.remove(curso_profesor);
			}
			
			if(curso_profesor.getProfesor() != null) {
				curso_profesor.getProfesor().curso_profesor.remove(curso_profesor);
			}
			
			try {
				session.delete(curso_profesor);
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
	
	public static boolean refresh(orm.Curso_profesor curso_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(curso_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Curso_profesor curso_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(curso_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso_profesor loadCurso_profesorByCriteria(Curso_profesorCriteria curso_profesorCriteria) {
		Curso_profesor[] curso_profesors = listCurso_profesorByCriteria(curso_profesorCriteria);
		if(curso_profesors == null || curso_profesors.length == 0) {
			return null;
		}
		return curso_profesors[0];
	}
	
	public static Curso_profesor[] listCurso_profesorByCriteria(Curso_profesorCriteria curso_profesorCriteria) {
		return curso_profesorCriteria.listCurso_profesor();
	}
}
