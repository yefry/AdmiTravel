package co.edu.udea.ingenieriaweb.admitravel.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.admitravel.dto.Cliente;
import co.edu.udea.ingenieriaweb.admitravel.util.exception.IWDaoException;

/**
 * Define la funcionalidad a implementar en el DAO de Cliente
 * @author Yeferson Marín
 *
 */
public interface ClienteDao {
	
	/**
	 * Entrega todos los clientes que se encuentran almacenados en el sistema, sin importar
	 * si esta eliminado o no.
	 * @return lista de clientes
	 * @throws IWDaoException
	 */
	public List<Cliente> obtener() throws IWDaoException;
	
	/**
	 * Entrega los datos de un cliente dado su cedula, si el cliente no exite retorna null
	 * @param identificación: identificación del cliente
	 * @return instancia del cliente con los datos, si no existe retorna nulo.
	 * @throws IWDaoException
	 */
	public Cliente obtener(String identificacion) throws IWDaoException;
	
	/**
	 * Guarda los datos de un cliente, teniendo en cuenta los datos que pueden ser nulos
	 * @param cliente: datos del cliente
	 * @return instancia del cliente con los datos que se guardaron.
	 * @throws IWDaoException
	 */
	public Cliente guardar(Cliente cliente) throws IWDaoException;
	
	/**
	 * Actualiza los datos de un cliente, teniendo en cuenta que datos pueden ser nulos
	 * @param cliente: datos del cliente a actualizar
	 * @return instancia del cliente con los datos que se actualizaron.
	 * @throws IWDaoException
	 */
	public Cliente actualizar(Cliente cliente) throws IWDaoException;
	
//	public void eliminar(Cliente cliente) throws IWDaoException;
	
}
