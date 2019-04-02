package ar.com.uala.movies.uala.movies.pojo;

import java.time.LocalDate;

public class Documental extends Producto {

	public Documental(String titulo, LocalDate fechaEstreno,int duracionEnMinutos,double precio) {
		super(titulo, fechaEstreno, duracionEnMinutos,precio);
		super.setEsInteresante(verificarInteresante());
	}

	public static final String TITULO_INTERESANTE = "unofficial";

	@Override
	boolean verificarInteresante() {
		return TITULO_INTERESANTE.equalsIgnoreCase(super.getTitulo());
	}

}
