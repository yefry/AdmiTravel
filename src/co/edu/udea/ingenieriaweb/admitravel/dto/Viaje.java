package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.util.Date;

/**
 * Clase DTO para transportar la informaci�n de los viajes
 * 
 * @author Yeferson Mar�n
 * 
 */
public class Viaje {
	
	private int precio;
	private Date fecha; 
	private String estado;
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}	
}
