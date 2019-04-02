package ar.com.uala.movies.uala.movies;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ar.com.uala.movies.uala.movies.enums.EstadoUsuarioEnum;
import ar.com.uala.movies.uala.movies.pojo.HistorialReproduccion;
import ar.com.uala.movies.uala.movies.pojo.Producto;
import ar.com.uala.movies.uala.movies.pojo.Usuario;
import ar.com.uala.movies.uala.movies.util.DataLoadProducts;

public class ClienteMiraProductoInteresanteTest {
	
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
		historial.setProductoVisto(productosDisponibles.get(0));
		historial.setFechaReproduccion(LocalDate.now());
		historial.setCostoReproduccion(productosDisponibles.get(0).getPrecio());
		
		HistorialReproduccion historial2 = new HistorialReproduccion();
		historial2.setUsuario(usuario);
		historial2.setProductoVisto(productosDisponibles.get(3));
		historial2.setFechaReproduccion(LocalDate.now());
		historial2.setCostoReproduccion(productosDisponibles.get(3).getPrecio());
		
		
		HistorialReproduccion historial3 = new HistorialReproduccion();
		historial3.setUsuario(usuario);
		historial3.setProductoVisto(productosDisponibles.get(5));
		historial3.setFechaReproduccion(LocalDate.now());
		historial3.setCostoReproduccion(productosDisponibles.get(5).getPrecio());
		
		List<HistorialReproduccion> reproducciones = Arrays.asList(historial,historial2,historial3);
		usuario.setProductosVistos( reproducciones );
		
	}

	@Test
	public void test() {
		
		int productosVistosInteresantes = 0;
		
		for(HistorialReproduccion historial : usuario.getProductosVistos()){
			
			if(historial.getProductoVisto().isEsInteresante()){
				productosVistosInteresantes++;
				break;
			}
		}
		
		//Al menos un producto interesante
		assertEquals(productosVistosInteresantes, 1);

	}

}
