package co.edu.udea.ingenieriaweb.admitravel.dto;

import java.util.Date;
import java.util.Set;


public class Viaje implements java.io.Serializable {

	private ViajeId id;
	private PaqueteDeViaje paquetedeviaje;
	private int precio;
	private Date fecha;
	private String estado;
	private Set<ClienteViaje> clienteviajes;

	public ViajeId getId() {
		return this.id;
	}

	public void setId(ViajeId id) {
		this.id = id;
	}

	public PaqueteDeViaje getPaquetedeviaje() {
		return this.paquetedeviaje;
	}

	public void setPaquetedeviaje(PaqueteDeViaje paquetedeviaje) {
		this.paquetedeviaje = paquetedeviaje;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<ClienteViaje> getClienteviajes() {
		return this.clienteviajes;
	}

	public void setClienteviajes(Set<ClienteViaje> clienteviajes) {
		this.clienteviajes = clienteviajes;
	}

}
