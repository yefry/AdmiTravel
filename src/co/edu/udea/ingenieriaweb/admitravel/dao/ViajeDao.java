package co.edu.udea.ingenieriaweb.admitravel.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Viaje;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Define la funcionalidad a implementar en el DAO de Viaje
 * @author Yeferson Marín
 *
 */
public interface ViajeDao {

	/**
	 * Entrega todos los Viajes que se encuentran almacenados en el sistema, sin importar
	 * si esta eliminado o no.
	 * @return lista de viajes
	 * @throws IWDaoException
	 */
	public List<Viaje> obtener() throws IWDaoException;
	
	/**
	 * Entrega los datos de un viaje dado su IdViaje, si el viaje no exite retorna null
	 * @param IdViaje: identificación del viaje
	 * @return instancia del viaje con los datos, si no existe retorna nulo.
	 * @throws IWDaoException
	 */
	public Viaje obtener(String IdViaje) throws IWDaoException;
	
	/**
	 * Guarda los datos de un viaje, teniendo en cuenta los datos que pueden ser nulos
	 * @param viaje: datos del viaje
	 * @return instancia del viaje con los datos que se guardaron.
	 * @throws IWDaoException
	 */
	public Viaje guardar(Viaje viaje) throws IWDaoException;
	
	/**
	 * Actualiza los datos de un viaje, teniendo en cuenta que datos pueden ser nulos
	 * @param viaje: datos del viaje a actualizar
	 * @return instancia del viaje con los datos que se actualizaron.
	 * @throws IWDaoException
	 */
	public Viaje actualizar(Viaje viaje) throws IWDaoException;
	
//	public void eliminar(Viaje cliente) throws IWDaoException;
}
