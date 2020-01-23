package sv.com.stjacks.sjpos.dao;

import java.util.List;

public interface GenericDAO<T, K>{
	void insert (T o);
	void update(T o);
	void delete (T o);
	List <T> findAll();
	T get (K id);
}
