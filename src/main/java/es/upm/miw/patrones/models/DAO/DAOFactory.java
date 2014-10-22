package es.upm.miw.patrones.models.DAO;


public class DAOFactory {
	private static DAOFactory daoFactory=null;
	
	private DAOFactory(){
		
	}
	public static DAOFactory getFactory(){
    	if (DAOFactory.daoFactory == null) { 
    		DAOFactory.daoFactory = new DAOFactory(); 
          } 
       return DAOFactory.daoFactory; 
  }
	public RoundDAO getRoundDAO(){
		return null;
	}
	public UserDAO getUserDAO(){
		return null;
	}

}
