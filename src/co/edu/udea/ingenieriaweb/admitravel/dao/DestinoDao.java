package co.edu.udea.ingenieriaweb.admitravel.dao;

import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

public interface DestinoDao {
	public Destino obtener(String cedula) throws IWDaoException;
	
	public Destino guardar(Destino cliente) throws IWDaoException;
	
	public Destino actualizar(Destino cliente) throws IWDaoException;
	
	public void eliminar(Destino cliente) throws IWDaoException;
}
