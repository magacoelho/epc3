package es.upm.miw.patrones.models.DAO;

public class MemDAOFactory extends DAOFactory{
	private static MemDAOFactory memDaoFactory=null;
    private MemDAOFactory(){
	   super();
    }
	public static DAOFactory getFactory() {
		if (MemDAOFactory.memDaoFactory == null) { 
    		MemDAOFactory.memDaoFactory = new MemDAOFactory(); 
          } 
       return MemDAOFactory.memDaoFactory; 
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
