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
				
//				for (ClienteViaje viajes : cliente.getViajes()) {
//					System.out.println("*******************************************************************");
//				}
			}
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testObtenerString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGuardar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testActualizar() {
		fail("Not yet implemented"); // TODO
	}

}
