package ar.com.uala.movies.uala.movies;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ar.com.uala.movies.uala.movies.enums.EstadoUsuarioEnum;
import ar.com.uala.movies.uala.movies.factory.RecomendacionFactory;
import ar.com.uala.movies.uala.movies.pojo.Producto;
import ar.com.uala.movies.uala.movies.pojo.Usuario;
import ar.com.uala.movies.uala.movies.service.RecomendacionService;
import ar.com.uala.movies.uala.movies.util.DataLoadProducts;

public class ClienteMelancoTest {
	
	List<Producto> productosDisponibles;
	Usuario usuario;
	RecomendacionService elRecomendador;

	@Before
	public void setUp() throws Exception {
		
		DataLoadProducts dataload = new DataLoadProducts();
		dataload.crearProductosBase();
		productosDisponibles = dataload.getProductosCreados();
		
		usuario = new Usuario("diegoalv",1000,EstadoUsuarioEnum.MELANCOLICO.getEstado());
		
//		HistorialReproduccion historial = new HistorialReproduccion();
//		historial.setUsuario(usuario);
//		historial.setProductoVisto(productosDisponibles.get(1));
//		historial.setFechaReproduccion(LocalDate.now());
//		historial.setCostoReproduccion(productosDisponibles.get(1).getPrecio());
//		
//		HistorialReproduccion historial2 = new HistorialReproduccion();
//		historial2.setUsuario(usuario);
//		historial2.setProductoVisto(productosDisponibles.get(4));
//		historial2.setFechaReproduccion(LocalDate.now());
//		historial2.setCostoReproduccion(productosDisponibles.get(4).getPrecio());
//		
//		
//		HistorialReproduccion historial3 = new HistorialReproduccion();
//		historial3.setUsuario(usuario);
//		historial3.setProductoVisto(productosDisponibles.get(8));
//		historial3.setFechaReproduccion(LocalDate.now());
//		historial3.setCostoReproduccion(productosDisponibles.get(8).getPrecio());
//		
//		List<HistorialReproduccion> reproducciones = Arrays.asList(historial,historial2,historial3);
//		usuario.setProductosVistos( reproducciones );
		
		
		
	}

	@Test
	public void test() {
		//Obtenemos la recomendacion segun el estado del usuario
		elRecomendador = RecomendacionFactory.getRecomendacion(usuario.getEstado());
		elRecomendador.setProductos(productosDisponibles);
		
		List<Producto> productosParaMelancos = new ArrayList<Producto>();
		
		productosParaMelancos = elRecomendador.recomendarProductoPorEstado(usuario.getEstado());
		//Tenemos 6 pelis de hace mas de 10 anios
		assertEquals(6, productosParaMelancos.size());
		
	}

}
