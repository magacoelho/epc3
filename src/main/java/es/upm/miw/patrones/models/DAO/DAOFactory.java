package es.upm.miw.patrones.models.DAO;


public abstract class DAOFactory {
	protected static DAOFactory daoFactory=null;
	
	protected DAOFactory(){
		
	}
	public abstract  DAOFactory getFactory();
	public abstract RoundDAO getRoundDAO();
	public abstract UserDAO getUserDAO();

}
