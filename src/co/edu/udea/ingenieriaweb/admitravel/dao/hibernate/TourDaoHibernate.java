package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.ingenieriaweb.admitravel.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.admitravel.dao.TourDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de funciones del DAO de Tour
 * @author Yeferson Marín
 *
 */
public class TourDaoHibernate implements TourDao{

	@Override
	public Tour obtener(String idTour) throws IWDaoException {
		Tour tour = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			tour = (Tour)sesion.createCriteria(Tour.class)
							 .add(Restrictions.eq("idTour", idTour))
							 .uniqueResult();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return tour;
	}

	@Override
	public Tour guardar(Tour tour) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			tx = sesion.beginTransaction();			
			sesion.save(tour);			
			tx.commit();			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return tour;
	}

	@Override
	public Tour actualizar(Tour tour) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			tx = sesion.beginTransaction();
			sesion.update(tour);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return tour;
	}
	
}
