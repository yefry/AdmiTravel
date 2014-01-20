package co.edu.udea.ingenieriaweb.admitravel.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public interface ViajeDao {

	public List<Viaje> obtener() throws IWDaoException;
	
	public Viaje obtener(String cedula) throws IWDaoException;
	
	public Viaje guardar(Viaje cliente) throws IWDaoException;
	
	public Viaje actualizar(Viaje cliente) throws IWDaoException;
	
	public void eliminar(Viaje cliente) throws IWDaoException;
}
