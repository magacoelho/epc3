package es.upm.miw.patrones.models.DAO;

import java.util.List;

public class MemGenericDAO<T,ID> implements GenericDAO<T, ID> {

	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
