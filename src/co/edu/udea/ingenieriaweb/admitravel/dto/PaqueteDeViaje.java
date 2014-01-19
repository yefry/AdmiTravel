package co.edu.udea.ingenieriaweb.admitravel.dto;

/**
 * Clase DTO para transportar la información de los Paquetes de Viaje
 * 
 * @author Yeferson Marín
 * 
 */
public class PaqueteDeViaje {
	private String idPaquete;
	private String destinos;
	private String transporte;
	private String alimentacion;
	private String duracionViaje;
	
	public String getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getDestinos() {
		return destinos;
	}
	public void setDestinos(String destinos) {
		this.destinos = destinos;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public String getDuracionViaje() {
		return duracionViaje;
	}
	public void setDuracionViaje(String duracionViaje) {
		this.duracionViaje = duracionViaje;
	}
	
}
