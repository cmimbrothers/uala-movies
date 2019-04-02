package ar.com.uala.movies.uala.movies.pojo;

import java.time.LocalDate;

/**
 * 
 * @author DIEGOALV
 *
 */
public abstract class Producto {

	private String titulo;
	private LocalDate fechaEstreno;
	private int duracionEnMinutos;
	private double precio;
	private boolean esInteresante;

	public Producto(String titulo, LocalDate fechaEstreno,
			int duracionEnMinutos, double precio) {
		super();
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.duracionEnMinutos = duracionEnMinutos;
		this.precio = precio;
	}

	abstract boolean verificarInteresante();

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsInteresante() {
		return esInteresante;
	}

	public void setEsInteresante(boolean esInteresante) {
		this.esInteresante = esInteresante;
	}

	
}
