package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.admitravel.dao.ViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementaci�n de pruebas unitarias por cada m�todo del DAO de Viajes
 * @author Yeferson Mar�n
 *
 */
public class ViajeDaoHibernateTest {

	@Test
	public void testObtener() {
		try{
			ViajeDao dao = new ViajeDaoHibernate();
			
			List<Viaje> lista = dao.obtener();
			
			for(Viaje viaje : lista){
				System.out.println("Fecha en la que se hace el viaje: " + viaje.getFecha());
				System.out.println("Estado del viaje: " + viaje.getEstado() + " ");
				System.out.println("Precio del viaje: " + viaje.getPrecio() + " ");
			}
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	public void testObtenerString() {
//		try{
//			ViajeDao dao = new ViajeDaoHibernate();
//			Viaje viaje = dao.obtener("0000001");			
//			System.out.println("Fecha en la que se hace el viaje: " + viaje.getFecha());
//			System.out.println("Estado del viaje: " + viaje.getEstado() + " ");
//			System.out.println("Precio del viaje: " + viaje.getPrecio() + " ");
//			
//		}catch (IWDaoException e) {
//			e.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Para la implementaci�n de estos m�todos se necesita el DTO idViaje
	 */
//	@Test
//	public void testGuardar() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testActualizar() {
//		fail("Not yet implemented"); // TODO
//	}

}
