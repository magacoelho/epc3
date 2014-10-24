package es.upm.miw.patrones.models.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class MemGenericDAO<T,ID> implements GenericDAO<T, ID> {
    private Map<ID, T> map = new HashMap<ID, T>();
	@Override
	public void create(T entity) {
		
		this.map.put(this.getId(), entity);
	}

	protected abstract ID getId();

	@Override
	public T read(ID id) {
		
		return map.get(id);
	}

	@Override
	public void delete(T entity) {
	
		map.remove(entity);
	}

	@Override
	public void deleteByID(ID id) {
		map.remove(id);
       
		
	}

	@Override
	public List<T> findAll() {
		List<T> lista = new ArrayList<T>();
		
		return null ;
	}

	@Override
	public List<T> findAll(int index, int size) {
		
		return null;
	}

	
}
