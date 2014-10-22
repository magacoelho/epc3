package es.upm.miw.patrones.models.DAO;

public class MemDAOFactory extends DAOFactory{
   private MemDAOFactory(){
	   super();
   }
	@Override
	public DAOFactory getFactory() {
		if (DAOFactory.daoFactory == null) { 
    		DAOFactory.daoFactory = new MemDAOFactory(); 
          } 
       return DAOFactory.daoFactory; 
	}

	@Override
	public RoundDAO getRoundDAO() {
		// TODO Auto-generated method stub
		return new MemRoundDAO();
	}

	@Override
	public UserDAO getUserDAO() {
		// TODO Auto-generated method stub
		return new MemUserDAO();
	}

}
