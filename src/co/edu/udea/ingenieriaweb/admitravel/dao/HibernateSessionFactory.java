package co.edu.udea.ingenieriaweb.admitravel.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Configura y provee acceso a las sesiones de Hibernate
 */
public class HibernateSessionFactory {
	
	public static HibernateSessionFactory instance;
	private static SessionFactory sessionFactory;
	private static Configuration configuration = new Configuration();

	
	public static HibernateSessionFactory getInstance(){
		if( instance == null )
			instance = new HibernateSessionFactory();
		return instance;
	}
	
	private HibernateSessionFactory(){
		
	}
	/**
	 * Entrega una nueva session de Hibernate
	 * @return
	 */
	public Session getSession() throws IWDaoException{
		if (sessionFactory == null) {
			rebuildSessionFactory();
		}
		
		return sessionFactory.openSession();
	}
	
	/**
	 * Construye la factoría de sesiones con el archivo de configuración de Hibernate dado
	 */
	public static void rebuildSessionFactory() throws IWDaoException{
		try {
			configuration.configure("co/edu/udea/ingenieriaweb/admitravel/dao/cfg/hibernate.cfg.xml");
			
			sessionFactory = configuration.buildSessionFactory();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
	}

}