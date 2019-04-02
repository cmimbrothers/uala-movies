package ar.com.uala.movies.uala.movies;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import ar.com.uala.movies.uala.movies.enums.EstadoUsuarioEnum;
import ar.com.uala.movies.uala.movies.pojo.HistorialReproduccion;
import ar.com.uala.movies.uala.movies.pojo.Producto;
import ar.com.uala.movies.uala.movies.pojo.Usuario;
import ar.com.uala.movies.uala.movies.util.Constants;
import ar.com.uala.movies.uala.movies.util.DataLoadProducts;

public class ClienteAntiguoTest {

	List<Producto> productosDisponibles;
	Usuario usuario;
	
	@Before
	public void setUp() throws Exception {
		DataLoadProducts dataload = new DataLoadProducts();
		dataload.crearProductosBase();
		productosDisponibles = dataload.getProductosCreados();
		
		usuario = new Usuario("diegoalv",1000,EstadoUsuarioEnum.CONTENTO.getEstado());
		
		HistorialReproduccion historial = new HistorialReproduccion();
		historial.setUsuario(usuario);
		historial.setProductoVisto(productosDisponibles.get(1));
		historial.setFechaReproduccion(LocalDate.now());
		historial.setCostoReproduccion(productosDisponibles.get(1).getPrecio());
		
		HistorialReproduccion historial2 = new HistorialReproduccion();
		historial2.setUsuario(usuario);
		historial2.setProductoVisto(productosDisponibles.get(4));
		historial2.setFechaReproduccion(LocalDate.now());
		historial2.setCostoReproduccion(productosDisponibles.get(4).getPrecio());
		
		
		HistorialReproduccion historial3 = new HistorialReproduccion();
		historial3.setUsuario(usuario);
		historial3.setProductoVisto(productosDisponibles.get(8));
		historial3.setFechaReproduccion(LocalDate.now());
		historial3.setCostoReproduccion(productosDisponibles.get(8).getPrecio());
		
		List<HistorialReproduccion> reproducciones = Arrays.asList(historial,historial2,historial3);
		usuario.setProductosVistos( reproducciones );
	}

	@Test
	public void test() {
		//Considero como producto viejo más de 5 anios, en la consigna no especificaba bien este valor
		List<HistorialReproduccion> productosViejos = usuario.getProductosVistos().stream()
				.filter((p)-> Constants.ANIO_ACTUAL - p.getProductoVisto().getFechaEstreno().getYear() > 5)
				.collect(Collectors.toList());
		
		
		assertEquals(usuario.getProductosVistos().size(), productosViejos.size());
	}

}
