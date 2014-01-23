package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.ingenieriaweb.admitravel.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.admitravel.dao.ViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de funciones del DAO de Viaje
 * @author Yeferson Marín
 *
 */
public class ViajeDaoHibernate implements ViajeDao{

	@Override
	public List<Viaje> obtener() throws IWDaoException {
		List<Viaje> viajes = new ArrayList<Viaje>();
		Session sesion = null;
		try{
			sesion = HibernateSessionFactory.getInstance().getSession();			
			viajes = sesion.createCriteria(Viaje.class).list();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}finally{
			if(sesion != null)
				sesion.close();
		}		
		return viajes;
	}

	@Override
	public Viaje obtener(String id) throws IWDaoException {
		Viaje viaje = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			viaje = (Viaje)sesion.createCriteria(Viaje.class)
							 .add(Restrictions.eq("id", id))
							 .uniqueResult();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return viaje;
	}

	@Override
	public Viaje guardar(Viaje viaje) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();			
			tx = sesion.beginTransaction();			
			sesion.save(viaje);			
			tx.commit();			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return viaje;
	}

	@Override
	public Viaje actualizar(Viaje viaje) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			tx = sesion.beginTransaction();
			sesion.update(viaje);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return viaje;
	}

}
