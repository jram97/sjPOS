package sv.com.stjacks.sjpos.ejb3;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import sv.com.stjacks.sjpos.dao.GenericDAO;

@Stateless
@LocalBean
public class GenericDAOJpa<T, K> implements Serializable {
	
	private final EntityManagerFactory emf;
	private Class<T> claseDePersistencia;
	

	public GenericDAOJpa(Class<T> entity) {
		claseDePersistencia = entity;
//		try {
			emf = Persistence.createEntityManagerFactory("sjPOSEJB");
//		} catch (Throwable ex) {
//			throw new ExceptionInInitializerError(ex);
//		}
	}
	
	//@PersistenceContext(unitName = "sjPOSEJB", type = PersistenceContextType.TRANSACTION)
	public javax.persistence.EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
//		return emf.createEntityManager();
	}

	public void insert(T obj) {
		EntityManager entityManager = null;
		try {
			entityManager = this.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(obj);
			entityManager.getTransaction().commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(T obj){
		EntityManager entityManager = null;
		try {
			entityManager = this.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.merge(obj);
			entityManager.getTransaction().commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void delete(T obj){
		EntityManager entityManager = null;
		try {
			entityManager = this.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.remove(obj);
			entityManager.getTransaction().commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<T> findAll() {
		System.out.println(claseDePersistencia.getSimpleName());
		EntityManager entityManager = null;
		List<T> objList = null;
		try {
			entityManager = this.getEntityManager();
			if(getEntityManager() == null) {
				System.out.println("Entity manager nulo");
			}
			TypedQuery<T> query = entityManager.createNamedQuery(claseDePersistencia.getSimpleName()+".findAll", claseDePersistencia);
			objList = query.getResultList();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return objList;
	}
	

	public T get(K id){
		EntityManager entityManager = null;
		T obj = null;

		try {
			entityManager = this.getEntityManager();
			obj = (T) entityManager.find(claseDePersistencia, id);		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
