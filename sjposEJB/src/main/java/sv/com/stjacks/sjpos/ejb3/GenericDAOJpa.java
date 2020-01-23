package sv.com.stjacks.sjpos.ejb3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import sv.com.stjacks.sjpos.dao.GenericDAO;

public class GenericDAOJpa<T, K> implements GenericDAO<T, K>{
	
	private final EntityManagerFactory emf;
	private Class<T> claseDePersistencia;
	
	public GenericDAOJpa() {
		try {
			emf = Persistence.createEntityManagerFactory("sjPOSEJB");
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	@Override
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

	@Override
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

	@Override
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

	@Override
	public List<T> findAll() {
		EntityManager entityManager = null;
		List<T> objList = null;
		try {
			entityManager = this.getEntityManager();
			TypedQuery<T> query = entityManager.createNamedQuery(claseDePersistencia.getName()+".findAll", claseDePersistencia);
			objList = query.getResultList();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return objList;
	}
	

	@Override
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
