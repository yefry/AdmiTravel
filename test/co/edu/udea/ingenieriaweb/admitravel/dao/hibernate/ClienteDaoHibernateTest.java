package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.admitravel.dao.ClienteDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.dto.ClienteViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de pruebas unitarias por cada método del DAO de Cliente
 * @author Yeferson Marín
 *
 */
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
	
	/**
	 * Cambiar datos a guardar para evita error, sobre todo la identificación que es la clave primaria
	 */
	@Test
	public void testGuardar() {
		try{
			ClienteDao dao = new ClienteDaoHibernate();
			Cliente cliente = new Cliente();
			cliente.setTipoIdentificacion("");
			cliente.setIdentificacion("42567840");
			cliente.setNombres("Luciana Franco");
			cliente.setEmail("luci@gmail.com");
			cliente.setTelefono("4562345");
			cliente.setCelular1("");
			cliente.setCelular2("");
			cliente.setDireccion("");
			cliente.setPazysalvo("si");
			cliente.setGenero("F");			
			dao.guardar(cliente);
			System.out.println("Se guardo el registro con éxito ");
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testActualizar() {
		try{
			ClienteDao dao = new ClienteDaoHibernate();
			Cliente cliente = new Cliente();
			cliente.setTipoIdentificacion("cc");
			cliente.setIdentificacion("42567840");
			cliente.setNombres("Luciana Franco");
			cliente.setEmail("luci@gmail.com");
			cliente.setTelefono("4562345");
			cliente.setCelular1("3103458723");
			cliente.setCelular2("");
			cliente.setDireccion("");
			cliente.setPazysalvo("si");
			cliente.setGenero("F");			
			dao.actualizar(cliente);
			System.out.println("Se actualizo el registro con éxito ");
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
