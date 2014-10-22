package es.upm.miw.patrones.models.DAO;

import java.util.List;

public interface GenericDAO<T,ID> {
	
	public abstract void create(T entity);
	public abstract T read(ID id);
	public abstract void delete(T entity);
	public abstract void deleteByID(ID id);
	public abstract List<T> findAll();
	public abstract List<T> findAll(int index, int size);
	

}
