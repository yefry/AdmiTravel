package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.ingenieriaweb.admitravel.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.admitravel.dao.PaqueteDeViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de funciones del DAO de PaqueteDeViaje
 * @author Yeferson Marín
 *
 */
public class PaqueteDeViajeDaoHibernate implements PaqueteDeViajeDao{

	@Override
	public List<PaqueteDeViaje> obtener() throws IWDaoException {
		List<PaqueteDeViaje> paquetes = new ArrayList<PaqueteDeViaje>();
		Session sesion = null;
		try{
			sesion = HibernateSessionFactory.getInstance().getSession();			
			paquetes = sesion.createCriteria(PaqueteDeViaje.class).list();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}finally{
			if(sesion != null)
				sesion.close();
		}		
		return paquetes;
	}

	@Override
	public PaqueteDeViaje obtener(String idPaquete) throws IWDaoException {
		PaqueteDeViaje paquete = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			paquete = (PaqueteDeViaje)sesion.createCriteria(PaqueteDeViaje.class)
							 .add(Restrictions.eq("idPaquete", idPaquete))
							 .uniqueResult();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return paquete;
	}

	@Override
	public PaqueteDeViaje guardar(PaqueteDeViaje paquete) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			tx = sesion.beginTransaction();			
			sesion.save(paquete);			
			tx.commit();			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return paquete;
	}

	@Override
	public PaqueteDeViaje actualizar(PaqueteDeViaje paquete) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			tx = sesion.beginTransaction();
			sesion.update(paquete);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return paquete;
	}

}
