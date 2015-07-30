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

public class SecretariaDAO {
	public static Secretaria loadSecretariaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSecretariaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria getSecretariaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getSecretariaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSecretariaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria getSecretariaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getSecretariaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Secretaria) session.load(orm.Secretaria.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria getSecretariaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Secretaria) session.get(orm.Secretaria.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Secretaria) session.load(orm.Secretaria.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria getSecretariaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Secretaria) session.get(orm.Secretaria.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySecretaria(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return querySecretaria(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySecretaria(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return querySecretaria(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria[] listSecretariaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listSecretariaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria[] listSecretariaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listSecretariaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySecretaria(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Secretaria as Secretaria");
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
	
	public static List querySecretaria(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Secretaria as Secretaria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Secretaria", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria[] listSecretariaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySecretaria(session, condition, orderBy);
			return (Secretaria[]) list.toArray(new Secretaria[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria[] listSecretariaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySecretaria(session, condition, orderBy, lockMode);
			return (Secretaria[]) list.toArray(new Secretaria[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSecretariaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadSecretariaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Secretaria[] secretarias = listSecretariaByQuery(session, condition, orderBy);
		if (secretarias != null && secretarias.length > 0)
			return secretarias[0];
		else
			return null;
	}
	
	public static Secretaria loadSecretariaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Secretaria[] secretarias = listSecretariaByQuery(session, condition, orderBy, lockMode);
		if (secretarias != null && secretarias.length > 0)
			return secretarias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSecretariaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateSecretariaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSecretariaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateSecretariaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSecretariaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Secretaria as Secretaria");
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
	
	public static java.util.Iterator iterateSecretariaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Secretaria as Secretaria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Secretaria", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria createSecretaria() {
		return new orm.Secretaria();
	}
	
	public static boolean save(orm.Secretaria secretaria) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(secretaria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Secretaria secretaria) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(secretaria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Secretaria secretaria)throws PersistentException {
		try {
			if(secretaria.getPersona() != null) {
				secretaria.getPersona().setSecretaria(null);
			}
			
			orm.Matricula[] lMatriculas = secretaria.matricula.toArray();
			for(int i = 0; i < lMatriculas.length; i++) {
				lMatriculas[i].setSecretaria(null);
			}
			orm.Mensualidad[] lMensualidads = secretaria.mensualidad.toArray();
			for(int i = 0; i < lMensualidads.length; i++) {
				lMensualidads[i].setSecretaria(null);
			}
			return delete(secretaria);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Secretaria secretaria, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(secretaria.getPersona() != null) {
				secretaria.getPersona().setSecretaria(null);
			}
			
			orm.Matricula[] lMatriculas = secretaria.matricula.toArray();
			for(int i = 0; i < lMatriculas.length; i++) {
				lMatriculas[i].setSecretaria(null);
			}
			orm.Mensualidad[] lMensualidads = secretaria.mensualidad.toArray();
			for(int i = 0; i < lMensualidads.length; i++) {
				lMensualidads[i].setSecretaria(null);
			}
			try {
				session.delete(secretaria);
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
	
	public static boolean refresh(orm.Secretaria secretaria) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(secretaria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Secretaria secretaria) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(secretaria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Secretaria loadSecretariaByCriteria(SecretariaCriteria secretariaCriteria) {
		Secretaria[] secretarias = listSecretariaByCriteria(secretariaCriteria);
		if(secretarias == null || secretarias.length == 0) {
			return null;
		}
		return secretarias[0];
	}
	
	public static Secretaria[] listSecretariaByCriteria(SecretariaCriteria secretariaCriteria) {
		return secretariaCriteria.listSecretaria();
	}
}
