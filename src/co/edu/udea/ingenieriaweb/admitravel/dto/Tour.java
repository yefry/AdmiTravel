package co.edu.udea.ingenieriaweb.admitravel.dto;

/**
 * Clase DTO para transportar la información de los Toures
 * 
 * @author Yeferson Marín
 * 
 */
public class Tour {
	
	private String nombre;
	private String detalle;
	private TourId id;
	
	public TourId getId() {
		return id;
	}
	public void setId(TourId id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
