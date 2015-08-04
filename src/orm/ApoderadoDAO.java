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

public class ApoderadoDAO {
	public static Apoderado loadApoderadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadApoderadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getApoderadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadApoderadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getApoderadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Apoderado) session.load(orm.Apoderado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Apoderado) session.get(orm.Apoderado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Apoderado) session.load(orm.Apoderado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado getApoderadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Apoderado) session.get(orm.Apoderado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryApoderado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryApoderado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryApoderado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryApoderado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listApoderadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listApoderadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryApoderado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Apoderado as Apoderado");
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
	
	public static List queryApoderado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Apoderado as Apoderado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Apoderado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryApoderado(session, condition, orderBy);
			return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado[] listApoderadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryApoderado(session, condition, orderBy, lockMode);
			return (Apoderado[]) list.toArray(new Apoderado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadApoderadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadApoderadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Apoderado[] apoderados = listApoderadoByQuery(session, condition, orderBy);
		if (apoderados != null && apoderados.length > 0)
			return apoderados[0];
		else
			return null;
	}
	
	public static Apoderado loadApoderadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Apoderado[] apoderados = listApoderadoByQuery(session, condition, orderBy, lockMode);
		if (apoderados != null && apoderados.length > 0)
			return apoderados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateApoderadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateApoderadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateApoderadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateApoderadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateApoderadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Apoderado as Apoderado");
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
	
	public static java.util.Iterator iterateApoderadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Apoderado as Apoderado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Apoderado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado createApoderado() {
		return new orm.Apoderado();
	}
	
	public static boolean save(orm.Apoderado apoderado) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Apoderado apoderado) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Apoderado apoderado)throws PersistentException {
		try {
			if(apoderado.getPersona() != null) {
				apoderado.getPersona().setApoderado(null);
			}
			
			orm.Estudiante[] lEstudiantes = apoderado.estudiante.toArray();
			for(int i = 0; i < lEstudiantes.length; i++) {
				lEstudiantes[i].setApoderado(null);
			}
			return delete(apoderado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Apoderado apoderado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(apoderado.getPersona() != null) {
				apoderado.getPersona().setApoderado(null);
			}
			
			orm.Estudiante[] lEstudiantes = apoderado.estudiante.toArray();
			for(int i = 0; i < lEstudiantes.length; i++) {
				lEstudiantes[i].setApoderado(null);
			}
			try {
				session.delete(apoderado);
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
	
	public static boolean refresh(orm.Apoderado apoderado) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Apoderado apoderado) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(apoderado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Apoderado loadApoderadoByCriteria(ApoderadoCriteria apoderadoCriteria) {
		Apoderado[] apoderados = listApoderadoByCriteria(apoderadoCriteria);
		if(apoderados == null || apoderados.length == 0) {
			return null;
		}
		return apoderados[0];
	}
	
	public static Apoderado[] listApoderadoByCriteria(ApoderadoCriteria apoderadoCriteria) {
		return apoderadoCriteria.listApoderado();
	}
}
