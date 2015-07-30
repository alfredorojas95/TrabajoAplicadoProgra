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

public class Estudiante_cursoDAO {
	public static Estudiante_curso loadEstudiante_cursoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudiante_cursoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso getEstudiante_cursoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getEstudiante_cursoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudiante_cursoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso getEstudiante_cursoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return getEstudiante_cursoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estudiante_curso) session.load(orm.Estudiante_curso.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso getEstudiante_cursoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estudiante_curso) session.get(orm.Estudiante_curso.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudiante_curso) session.load(orm.Estudiante_curso.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso getEstudiante_cursoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudiante_curso) session.get(orm.Estudiante_curso.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante_curso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryEstudiante_curso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante_curso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return queryEstudiante_curso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso[] listEstudiante_cursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listEstudiante_cursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso[] listEstudiante_cursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return listEstudiante_cursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante_curso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante_curso as Estudiante_curso");
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
	
	public static List queryEstudiante_curso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante_curso as Estudiante_curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudiante_curso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso[] listEstudiante_cursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstudiante_curso(session, condition, orderBy);
			return (Estudiante_curso[]) list.toArray(new Estudiante_curso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso[] listEstudiante_cursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstudiante_curso(session, condition, orderBy, lockMode);
			return (Estudiante_curso[]) list.toArray(new Estudiante_curso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudiante_cursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return loadEstudiante_cursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estudiante_curso[] estudiante_cursos = listEstudiante_cursoByQuery(session, condition, orderBy);
		if (estudiante_cursos != null && estudiante_cursos.length > 0)
			return estudiante_cursos[0];
		else
			return null;
	}
	
	public static Estudiante_curso loadEstudiante_cursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estudiante_curso[] estudiante_cursos = listEstudiante_cursoByQuery(session, condition, orderBy, lockMode);
		if (estudiante_cursos != null && estudiante_cursos.length > 0)
			return estudiante_cursos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstudiante_cursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateEstudiante_cursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudiante_cursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.DBprueba2PersistentManager.instance().getSession();
			return iterateEstudiante_cursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudiante_cursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante_curso as Estudiante_curso");
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
	
	public static java.util.Iterator iterateEstudiante_cursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudiante_curso as Estudiante_curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudiante_curso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso createEstudiante_curso() {
		return new orm.Estudiante_curso();
	}
	
	public static boolean save(orm.Estudiante_curso estudiante_curso) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().saveObject(estudiante_curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Estudiante_curso estudiante_curso) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().deleteObject(estudiante_curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estudiante_curso estudiante_curso)throws PersistentException {
		try {
			if(estudiante_curso.getEstudiante() != null) {
				estudiante_curso.getEstudiante().estudiante_curso.remove(estudiante_curso);
			}
			
			if(estudiante_curso.getCurso() != null) {
				estudiante_curso.getCurso().estudiante_curso.remove(estudiante_curso);
			}
			
			return delete(estudiante_curso);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estudiante_curso estudiante_curso, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(estudiante_curso.getEstudiante() != null) {
				estudiante_curso.getEstudiante().estudiante_curso.remove(estudiante_curso);
			}
			
			if(estudiante_curso.getCurso() != null) {
				estudiante_curso.getCurso().estudiante_curso.remove(estudiante_curso);
			}
			
			try {
				session.delete(estudiante_curso);
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
	
	public static boolean refresh(orm.Estudiante_curso estudiante_curso) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().refresh(estudiante_curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Estudiante_curso estudiante_curso) throws PersistentException {
		try {
			orm.DBprueba2PersistentManager.instance().getSession().evict(estudiante_curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante_curso loadEstudiante_cursoByCriteria(Estudiante_cursoCriteria estudiante_cursoCriteria) {
		Estudiante_curso[] estudiante_cursos = listEstudiante_cursoByCriteria(estudiante_cursoCriteria);
		if(estudiante_cursos == null || estudiante_cursos.length == 0) {
			return null;
		}
		return estudiante_cursos[0];
	}
	
	public static Estudiante_curso[] listEstudiante_cursoByCriteria(Estudiante_cursoCriteria estudiante_cursoCriteria) {
		return estudiante_cursoCriteria.listEstudiante_curso();
	}
}
