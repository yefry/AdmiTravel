package co.edu.udea.ingenieriaweb.admitravel.dao;

import co.edu.udea.ingenieriaweb.admitravel.dto.Tour;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public interface TourDao {
	public Tour obtener(String cedula) throws IWDaoException;
	
	public Tour guardar(Tour cliente) throws IWDaoException;
	
	public Tour actualizar(Tour cliente) throws IWDaoException;
	
	public void eliminar(Tour cliente) throws IWDaoException;
}
