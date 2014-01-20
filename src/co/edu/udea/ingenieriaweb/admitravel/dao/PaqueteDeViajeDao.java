package co.edu.udea.ingenieriaweb.admitravel.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.PaqueteViaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public interface PaqueteDeViajeDao {
	public List<PaqueteViaje> obtener() throws IWDaoException;
	
	public PaqueteViaje obtener(String cedula) throws IWDaoException;
	
	public PaqueteViaje guardar(PaqueteViaje cliente) throws IWDaoException;
	
	public PaqueteViaje actualizar(PaqueteViaje cliente) throws IWDaoException;
	
	public void eliminar(PaqueteViaje cliente) throws IWDaoException;
}
