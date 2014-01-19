package co.edu.udea.ingenieriaweb.admitravel.dto;

/**
 * Clase DTO para transportar la informaci�n de los Viajes con los clientes que participaron de �l
 * 
 * @author Yeferson Mar�n
 * 
 */
public class ClienteViaje {
	
	private String estadoPago;
	private ClienteViajeId id;
	
	public ClienteViajeId getId() {
		return id;
	}
	public void setId(ClienteViajeId id) {
		this.id = id;
	}
	public String getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}
	
}
