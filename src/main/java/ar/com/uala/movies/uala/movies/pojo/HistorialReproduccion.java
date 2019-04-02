package ar.com.uala.movies.uala.movies.pojo;

import java.time.LocalDate;

/**
 * Clase dummy para guardar el historial de reproducciones 
 * @author DIEGOALV
 *
 */
public class HistorialReproduccion {

	private Usuario usuario;
	private Producto productoVisto;
	private LocalDate fechaReproduccion;
	private double costoReproduccion;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Producto getProductoVisto() {
		return productoVisto;
	}

	public void setProductoVisto(Producto productoVisto) {
		this.productoVisto = productoVisto;
	}

	public LocalDate getFechaReproduccion() {
		return fechaReproduccion;
	}

	public void setFechaReproduccion(LocalDate fechaReproduccion) {
		this.fechaReproduccion = fechaReproduccion;
	}

	public double getCostoReproduccion() {
		return costoReproduccion;
	}

	public void setCostoReproduccion(double costoReproduccion) {
		this.costoReproduccion = costoReproduccion;
	}

}
