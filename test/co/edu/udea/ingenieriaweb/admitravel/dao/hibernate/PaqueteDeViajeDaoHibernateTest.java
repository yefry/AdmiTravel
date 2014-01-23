package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.admitravel.dao.PaqueteDeViajeDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteDeViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementaci�n de pruebas unitarias por cada m�todo del DAO de Paquetes de viaje
 * @author Yeferson Mar�n
 *
 */
public class PaqueteDeViajeDaoHibernateTest {

	@Test
	public void testObtener() {
		try{
			PaqueteDeViajeDao dao = new PaqueteDeViajeDaoHibernate();
			
			List<PaqueteDeViaje> lista = dao.obtener();
			
			for(PaqueteDeViaje paquete : lista){
				System.out.println("Identificaci�n del paquete: " + paquete.getIdPaquete());
				System.out.println("Tipo de transporte: " + paquete.getTransporte() + " ");
				System.out.println("Tiempo que dura el viaje: " + paquete.getDuracionViaje() + " ");
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
			PaqueteDeViajeDao dao = new PaqueteDeViajeDaoHibernate();
			PaqueteDeViaje paquete = dao.obtener("SaMCar001");			
			System.out.println("Identificaci�n del paquete: " + paquete.getIdPaquete());
			System.out.println("Tipo de transporte: " + paquete.getTransporte() + " ");
			System.out.println("Tiempo que dura el viaje: " + paquete.getDuracionViaje() + " ");
			
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGuardar() {
		try{
			PaqueteDeViajeDao dao = new PaqueteDeViajeDaoHibernate();
			PaqueteDeViaje paquete = new PaqueteDeViaje();
			paquete.setIdPaquete("");
			paquete.setTransporte("");
			paquete.setAlimentacion("");
			paquete.setDestinos("");
			paquete.setDuracionViaje("");		
			dao.guardar(paquete);
			System.out.println("Se guardo el registro con �xito ");
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testActualizar() {
		try{
			PaqueteDeViajeDao dao = new PaqueteDeViajeDaoHibernate();
			PaqueteDeViaje paquete = new PaqueteDeViaje();
			paquete.setIdPaquete("");
			paquete.setTransporte("");
			paquete.setAlimentacion("");
			paquete.setDestinos("");
			paquete.setDuracionViaje("");		
			dao.actualizar(paquete);
			System.out.println("Se actualizo el registro con �xito ");
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
