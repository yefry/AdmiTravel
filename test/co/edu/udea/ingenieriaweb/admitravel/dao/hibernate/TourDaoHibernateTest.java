package co.edu.udea.ingenieriaweb.admitravel.dao.hibernate;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.admitravel.dao.TourDao;
import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.dto.TourId;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Implementación de pruebas unitarias por cada método del DAO de Tour
 * @author Yeferson Marín
 *
 */
public class TourDaoHibernateTest {

	@Test
	public void testObtener() {
		try{
			TourDao dao = new TourDaoHibernate();
			Tour tour = dao.obtener("Car001");
			System.out.println("Nombre del Tour: " + tour.getNombre() + " ");
			System.out.println("Destalles del Tour: " + tour.getDetalle() + " ");			
		}catch (IWDaoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método de guardar no esta bien implementado
	 */
//	@Test
//	public void testGuardar() {
//		try{
//			TourDao dao = new TourDaoHibernate();
//			Tour tour = new Tour();
//			TourId idTour = new TourId();
//			tour.setIdTour(idTour);
//			tour.setNombre("");
//			tour.setDetalle("");			
//			dao.guardar(tour);
//			System.out.println("Se guardo el registro con éxito ");
//		}catch (IWDaoException e) {
//			e.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Método de actualizar no esta bien implementado
	 */
//	@Test
//	public void testActualizar() {
//		try{
//			TourDao dao = new TourDaoHibernate();
//			Tour tour = new Tour();
//			TourId idTour = new TourId();
//			tour.setIdTour(idTour);
//			tour.setNombre("");
//			tour.setDetalle("");			
//			dao.actualizar(tour);
//			System.out.println("Se guardo el registro con éxito ");
//		}catch (IWDaoException e) {
//			e.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
