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

public class Sueldo_profesorDAO {
	public static Sueldo_profesor loadSueldo_profesorByORMID(orm.Sueldo sueldo, orm.Profesor profesor) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldo_profesorByORMID(session, sueldo, profesor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor getSueldo_profesorByORMID(orm.Sueldo sueldo, orm.Profesor profesor) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getSueldo_profesorByORMID(session, sueldo, profesor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByORMID(orm.Sueldo sueldo, orm.Profesor profesor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldo_profesorByORMID(session, sueldo, profesor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor getSueldo_profesorByORMID(orm.Sueldo sueldo, orm.Profesor profesor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getSueldo_profesorByORMID(session, sueldo, profesor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByORMID(PersistentSession session, orm.Sueldo sueldo, orm.Profesor profesor) throws PersistentException {
		try {
			Sueldo_profesor sueldo_profesor = new orm.Sueldo_profesor();
			sueldo_profesor.setORM_Sueldo(sueldo);
			sueldo_profesor.setORM_Profesor(profesor);
			
			return (Sueldo_profesor) session.load(orm.Sueldo_profesor.class, sueldo_profesor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor getSueldo_profesorByORMID(PersistentSession session, orm.Sueldo sueldo, orm.Profesor profesor) throws PersistentException {
		try {
			Sueldo_profesor sueldo_profesor = new orm.Sueldo_profesor();
			sueldo_profesor.setORM_Sueldo(sueldo);
			sueldo_profesor.setORM_Profesor(profesor);
			
			return (Sueldo_profesor) session.get(orm.Sueldo_profesor.class, sueldo_profesor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByORMID(PersistentSession session, orm.Sueldo sueldo, orm.Profesor profesor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Sueldo_profesor sueldo_profesor = new orm.Sueldo_profesor();
			sueldo_profesor.setORM_Sueldo(sueldo);
			sueldo_profesor.setORM_Profesor(profesor);
			
			return (Sueldo_profesor) session.load(orm.Sueldo_profesor.class, sueldo_profesor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor getSueldo_profesorByORMID(PersistentSession session, orm.Sueldo sueldo, orm.Profesor profesor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Sueldo_profesor sueldo_profesor = new orm.Sueldo_profesor();
			sueldo_profesor.setORM_Sueldo(sueldo);
			sueldo_profesor.setORM_Profesor(profesor);
			
			return (Sueldo_profesor) session.get(orm.Sueldo_profesor.class, sueldo_profesor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySueldo_profesor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return querySueldo_profesor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySueldo_profesor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return querySueldo_profesor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor[] listSueldo_profesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listSueldo_profesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor[] listSueldo_profesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listSueldo_profesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySueldo_profesor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo_profesor as Sueldo_profesor");
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
	
	public static List querySueldo_profesor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo_profesor as Sueldo_profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sueldo_profesor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor[] listSueldo_profesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySueldo_profesor(session, condition, orderBy);
			return (Sueldo_profesor[]) list.toArray(new Sueldo_profesor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor[] listSueldo_profesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySueldo_profesor(session, condition, orderBy, lockMode);
			return (Sueldo_profesor[]) list.toArray(new Sueldo_profesor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldo_profesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldo_profesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sueldo_profesor[] sueldo_profesors = listSueldo_profesorByQuery(session, condition, orderBy);
		if (sueldo_profesors != null && sueldo_profesors.length > 0)
			return sueldo_profesors[0];
		else
			return null;
	}
	
	public static Sueldo_profesor loadSueldo_profesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sueldo_profesor[] sueldo_profesors = listSueldo_profesorByQuery(session, condition, orderBy, lockMode);
		if (sueldo_profesors != null && sueldo_profesors.length > 0)
			return sueldo_profesors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSueldo_profesorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateSueldo_profesorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSueldo_profesorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateSueldo_profesorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSueldo_profesorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo_profesor as Sueldo_profesor");
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
	
	public static java.util.Iterator iterateSueldo_profesorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo_profesor as Sueldo_profesor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sueldo_profesor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor createSueldo_profesor() {
		return new orm.Sueldo_profesor();
	}
	
	public static boolean save(orm.Sueldo_profesor sueldo_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(sueldo_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Sueldo_profesor sueldo_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(sueldo_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Sueldo_profesor sueldo_profesor)throws PersistentException {
		try {
			orm.Sueldo sueldo = sueldo_profesor.getSueldo();
			if(sueldo_profesor.getSueldo() != null) {
				sueldo_profesor.getSueldo().sueldo_profesor.remove(sueldo_profesor);
			}
			sueldo_profesor.setORM_Sueldo(sueldo);
			
			orm.Profesor profesor = sueldo_profesor.getProfesor();
			if(sueldo_profesor.getProfesor() != null) {
				sueldo_profesor.getProfesor().sueldo_profesor.remove(sueldo_profesor);
			}
			sueldo_profesor.setORM_Profesor(profesor);
			
			if(sueldo_profesor.getJefeadministracion() != null) {
				sueldo_profesor.getJefeadministracion().sueldo_profesor.remove(sueldo_profesor);
			}
			
			return delete(sueldo_profesor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Sueldo_profesor sueldo_profesor, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Sueldo sueldo = sueldo_profesor.getSueldo();
			if(sueldo_profesor.getSueldo() != null) {
				sueldo_profesor.getSueldo().sueldo_profesor.remove(sueldo_profesor);
			}
			sueldo_profesor.setORM_Sueldo(sueldo);
			
			orm.Profesor profesor = sueldo_profesor.getProfesor();
			if(sueldo_profesor.getProfesor() != null) {
				sueldo_profesor.getProfesor().sueldo_profesor.remove(sueldo_profesor);
			}
			sueldo_profesor.setORM_Profesor(profesor);
			
			if(sueldo_profesor.getJefeadministracion() != null) {
				sueldo_profesor.getJefeadministracion().sueldo_profesor.remove(sueldo_profesor);
			}
			
			try {
				session.delete(sueldo_profesor);
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
	
	public static boolean refresh(orm.Sueldo_profesor sueldo_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(sueldo_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Sueldo_profesor sueldo_profesor) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(sueldo_profesor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo_profesor loadSueldo_profesorByCriteria(Sueldo_profesorCriteria sueldo_profesorCriteria) {
		Sueldo_profesor[] sueldo_profesors = listSueldo_profesorByCriteria(sueldo_profesorCriteria);
		if(sueldo_profesors == null || sueldo_profesors.length == 0) {
			return null;
		}
		return sueldo_profesors[0];
	}
	
	public static Sueldo_profesor[] listSueldo_profesorByCriteria(Sueldo_profesorCriteria sueldo_profesorCriteria) {
		return sueldo_profesorCriteria.listSueldo_profesor();
	}
}
