package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.admitravel.dao.DestinoDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de pruebas unitarias por cada método del DAO de Destino
 * @author Yeferson Marín
 *
 */
public class DestinoDaoHibernateTest {

	@Test
	public void testObtener() {
		try{
			DestinoDao dao = new DestinoDaoHibernate();
			Destino destino = dao.obtener("ColBol001");			
			System.out.println("Identificación del Destino: " + destino.getIdDestino());
			System.out.println("Nombre del destino: " + destino.getNombre() + " ");
			System.out.println("Destalles del destino: " + destino.getDetalle() + " ");			
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGuardar() {
		try{
			DestinoDao dao = new DestinoDaoHibernate();
			Destino destino = new Destino();
			destino.setIdDestino("");
			destino.setNombre("");
			destino.setDetalle("");			
			dao.guardar(destino);
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
			DestinoDao dao = new DestinoDaoHibernate();
			Destino destino = new Destino();
			destino.setIdDestino("");
			destino.setNombre("");
			destino.setDetalle("");			
			dao.actualizar(destino);
			System.out.println("Se actualizo el registro con éxito ");
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
