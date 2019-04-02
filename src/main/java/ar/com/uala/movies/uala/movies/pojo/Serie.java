package ar.com.uala.movies.uala.movies.pojo;

import java.time.LocalDate;

/**
 * 
 * @author DIEGOALV
 *
 */
public class Serie extends Producto {

	public Serie(String titulo, LocalDate fechaEstreno, int duracionEnMinutos,double precio, int temporadas) {
		super(titulo, fechaEstreno, duracionEnMinutos,precio);
		this.temporadas = temporadas;
		super.setEsInteresante(verificarInteresante());
	}

	private int temporadas;

	@Override
	boolean verificarInteresante() {
		return temporadas == 4 || temporadas == 5;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

}
