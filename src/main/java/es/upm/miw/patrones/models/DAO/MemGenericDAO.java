package es.upm.miw.patrones.models.DAO;

import java.util.List;

public class MemGenericDAO<T,ID> implements GenericDAO<T, ID> {

	@Override
	public void create(T entity) {
		
		
	}

	@Override
	public T read(ID id) {
		
		return null;
	}

	@Override
	public void delete(T entity) {
	
		
	}

	@Override
	public void deleteByID(ID id) {

		
	}

	@Override
	public List<T> findAll() {
		
		return null;
	}

	@Override
	public List<T> findAll(int index, int size) {
		
		return null;
	}

	
}
