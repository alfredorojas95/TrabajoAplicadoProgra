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

public class SueldoDAO {
	public static Sueldo loadSueldoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo getSueldoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getSueldoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo getSueldoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getSueldoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Sueldo) session.load(orm.Sueldo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo getSueldoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Sueldo) session.get(orm.Sueldo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sueldo) session.load(orm.Sueldo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo getSueldoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sueldo) session.get(orm.Sueldo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySueldo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return querySueldo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySueldo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return querySueldo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo[] listSueldoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listSueldoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo[] listSueldoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listSueldoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySueldo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo as Sueldo");
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
	
	public static List querySueldo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo as Sueldo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sueldo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo[] listSueldoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySueldo(session, condition, orderBy);
			return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo[] listSueldoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySueldo(session, condition, orderBy, lockMode);
			return (Sueldo[]) list.toArray(new Sueldo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSueldoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sueldo[] sueldos = listSueldoByQuery(session, condition, orderBy);
		if (sueldos != null && sueldos.length > 0)
			return sueldos[0];
		else
			return null;
	}
	
	public static Sueldo loadSueldoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sueldo[] sueldos = listSueldoByQuery(session, condition, orderBy, lockMode);
		if (sueldos != null && sueldos.length > 0)
			return sueldos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSueldoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateSueldoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSueldoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateSueldoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSueldoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo as Sueldo");
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
	
	public static java.util.Iterator iterateSueldoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Sueldo as Sueldo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sueldo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo createSueldo() {
		return new orm.Sueldo();
	}
	
	public static boolean save(orm.Sueldo sueldo) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(sueldo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Sueldo sueldo) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(sueldo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Sueldo sueldo)throws PersistentException {
		try {
			if(sueldo.getJefeadministracion() != null) {
				sueldo.getJefeadministracion().sueldo.remove(sueldo);
			}
			
			if(sueldo.getProfesor() != null) {
				sueldo.getProfesor().sueldo.remove(sueldo);
			}
			
			return delete(sueldo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Sueldo sueldo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(sueldo.getJefeadministracion() != null) {
				sueldo.getJefeadministracion().sueldo.remove(sueldo);
			}
			
			if(sueldo.getProfesor() != null) {
				sueldo.getProfesor().sueldo.remove(sueldo);
			}
			
			try {
				session.delete(sueldo);
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
	
	public static boolean refresh(orm.Sueldo sueldo) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(sueldo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Sueldo sueldo) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(sueldo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sueldo loadSueldoByCriteria(SueldoCriteria sueldoCriteria) {
		Sueldo[] sueldos = listSueldoByCriteria(sueldoCriteria);
		if(sueldos == null || sueldos.length == 0) {
			return null;
		}
		return sueldos[0];
	}
	
	public static Sueldo[] listSueldoByCriteria(SueldoCriteria sueldoCriteria) {
		return sueldoCriteria.listSueldo();
	}
}
