package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.admitravel.dao.ClienteDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.ClienteViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public class ClienteDaoHibernateTest {

	@Test
	public void testObtener() {
		try{
			ClienteDao dao = new ClienteDaoHibernate();
			
			List<Cliente> lista = dao.obtener();
			
			for(Cliente cliente : lista){
				System.out.println("Cedula: " + cliente.getIdentificacion());
				System.out.println("Nombre completo: " + cliente.getNombres() + " ");
				System.out.println("Genero: " + cliente.getGenero() + " ");
			}
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testObtenerString() {
		try{
			ClienteDao dao = new ClienteDaoHibernate();
			Cliente cliente = dao.obtener("1023345789");			
			System.out.println("Cedula: " + cliente.getIdentificacion());
			System.out.println("Nombre completo: " + cliente.getNombres() + " ");
			System.out.println("Genero: " + cliente.getGenero() + " ");
			
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGuardar() {
		try{
			ClienteDao dao = new ClienteDaoHibernate();
			Cliente cliente = dao.obtener("1023345789");			
			System.out.println("Cedula: " + cliente.getIdentificacion());
			System.out.println("Nombre completo: " + cliente.getNombres() + " ");
			System.out.println("Genero: " + cliente.getGenero() + " ");
			
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	public void testActualizar() {
//		fail("Not yet implemented"); // TODO
//	}

}
