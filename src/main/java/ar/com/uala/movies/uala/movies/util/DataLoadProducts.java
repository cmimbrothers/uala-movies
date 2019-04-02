package ar.com.uala.movies.uala.movies.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.com.uala.movies.uala.movies.pojo.Documental;
import ar.com.uala.movies.uala.movies.pojo.Pelicula;
import ar.com.uala.movies.uala.movies.pojo.Producto;
import ar.com.uala.movies.uala.movies.pojo.Serie;

public class DataLoadProducts {
	
	private List<Producto> productosCreados;
	
	public void crearProductosBase(){
		
		List<Producto> productosEnStock = new ArrayList<>();
		
		Producto serie1 = new Serie("Millennials", LocalDate.of(2018, 11, 26), 60,100 , 2);
		Producto serie2 = new Serie("Grey's Anatomy",LocalDate.of(2005, 3, 27), 60,100, 15);
		Producto serie3 = new Serie("El Marginal",LocalDate.of(2016,6,2), 60 ,100, 2);
		
		Producto peli1 = new Pelicula("Bohemian Rhapsody", LocalDate.of(2018,10,24), 133, 1,200);
		Producto peli2 = new Pelicula("Citizen Kane", LocalDate.of(1941,8,8), 120, 0, 250);
		Producto peli3 = new Pelicula("Titanic", LocalDate.of(1998,2,5), 195, 11 , 99);
		
		Producto documental1 = new Documental("Bowling for Columbine", LocalDate.of(2002, 11, 21), 120,60);
		Producto documental2 = new Documental("Zeitgeist",LocalDate.of(2007, 6, 1),123,70);
		Producto documental3 = new Documental("Super Size Me",LocalDate.of(2004, 3, 3), 100,80);
		
		productosEnStock = Arrays.asList(serie1,serie2,serie3, peli1,peli2, peli3, documental1,documental2,documental3 );
		setProductosCreados(productosEnStock);
	}

	public List<Producto> getProductosCreados() {
		return productosCreados;
	}

	public void setProductosCreados(List<Producto> productosCreados) {
		this.productosCreados = productosCreados;
	}
	
	
	
}
