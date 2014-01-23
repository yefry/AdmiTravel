package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.ingenieriaweb.admitravel.dao.DestinoDao;
import co.edu.udea.ingenieriaweb.admitravel.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de funciones del DAO de Destino
 * @author Yeferson Marín
 *
 */
public class DestinoDaoHibernate implements DestinoDao{

	@Override
	public Destino obtener(String idDestino) throws IWDaoException {
		Destino destino = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			destino = (Destino)sesion.createCriteria(Destino.class)
							 .add(Restrictions.eq("idDestino", idDestino))
							 .uniqueResult();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return destino;
	}

	@Override
	public Destino guardar(Destino destino) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			tx = sesion.beginTransaction();			
			sesion.save(destino);			
			tx.commit();			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return destino;
	}

	@Override
	public Destino actualizar(Destino destino) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			tx = sesion.beginTransaction();
			sesion.update(destino);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return destino;
	}

}
