package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.ingenieriaweb.admitravel.dao.ClienteDao;
import co.edu.udea.ingenieriaweb.admitravel.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de funciones del DAO de Cliente
 * @author Yeferson Marín
 *
 */
public class ClienteDaoHibernate implements ClienteDao {

	@Override
	public List<Cliente> obtener() throws IWDaoException {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session sesion = null;
		try{
			sesion = HibernateSessionFactory.getInstance().getSession();			
			clientes = sesion.createCriteria(Cliente.class).list();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}finally{
			if(sesion != null)
				sesion.close();
		}		
		return clientes;
	}

	@Override
	public Cliente obtener(String identificacion) throws IWDaoException {		
		Cliente cliente = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			
			cliente = (Cliente)sesion.createCriteria(Cliente.class)
							 .add(Restrictions.eq("identificacion", identificacion))
							 .uniqueResult();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return cliente;
	}

	@Override
	public Cliente guardar(Cliente cliente) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			
			tx = sesion.beginTransaction();
			
			sesion.save(cliente);
			
			tx.commit();
			
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}		
		return cliente;
	}

	@Override
	public Cliente actualizar(Cliente cliente) throws IWDaoException {
		Transaction tx = null;
		try{
			Session sesion = HibernateSessionFactory.getInstance().getSession();
			tx = sesion.beginTransaction();
			sesion.update(cliente);
			tx.commit();
		}catch (HibernateException e) {
			throw new IWDaoException(e);
		}
		
		return cliente;
	}
}
