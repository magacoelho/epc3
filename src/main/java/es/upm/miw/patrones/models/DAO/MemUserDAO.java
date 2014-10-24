package es.upm.miw.patrones.models.DAO;

import java.util.List;

import es.upm.miw.patrones.models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO  {

	@Override
	protected Integer getId() {
		
		return null;
	}

	
}
