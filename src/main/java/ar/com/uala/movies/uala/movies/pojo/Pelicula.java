package ar.com.uala.movies.uala.movies.pojo;

import java.time.LocalDate;

public class Pelicula extends Producto {

	public Pelicula(String titulo, LocalDate fechaEstreno, int duracionEnMinutos,int oscarGanados,double precio) {
		super(titulo, fechaEstreno, duracionEnMinutos,precio);
		this.oscarGanados = oscarGanados;
		super.setEsInteresante(verificarInteresante());
		
	}

	private int oscarGanados;

	@Override
	boolean verificarInteresante() {
		return oscarGanados > 0;
	}

	public int getOscarGanados() {
		return oscarGanados;
	}

	public void setOscarGanados(int oscarGanados) {
		this.oscarGanados = oscarGanados;
	}

}
