package co.edu.udea.ingenieriaweb.admitravel.dao;

import co.edu.udea.ingenieriaweb.admitravel.dto.Destino;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Define la funcionalidad a implementar en el DAO de Destino
 * @author Yeferson Marín
 *
 */
public interface DestinoDao {
	
	/**
	 * Entrega los datos de un destino dado su idDestino, si el destino no exite retorna null
	 * @param idDestino: identificación del destino
	 * @return instancia del destino con los datos, si no existe retorna nulo.
	 * @throws IWDaoException
	 */
	public Destino obtener(String idDestino) throws IWDaoException;
	
	/**
	 * Guarda los datos de un destino, teniendo en cuenta los datos que pueden ser nulos
	 * @param destino: datos del destino
	 * @return instancia del destino con los datos que se guardaron.
	 * @throws IWDaoException
	 */
	public Destino guardar(Destino destino) throws IWDaoException;
	
	/**
	 * Actualiza los datos de un destino, teniendo en cuenta que datos pueden ser nulos
	 * @param destino: datos del destino a actualizar
	 * @return instancia del destino con los datos que se actualizaron.
	 * @throws IWDaoException
	 */
	public Destino actualizar(Destino destino) throws IWDaoException;
	
//	public void eliminar(Destino destino) throws IWDaoException;
}
