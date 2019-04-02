package ar.com.uala.movies.uala.movies.service.impl;

import java.util.List;

import ar.com.uala.movies.uala.movies.pojo.Producto;
import ar.com.uala.movies.uala.movies.service.RecomendacionService;

/**
 * 
 * @author DIEGOALV
 *
 */
public class RecomendacionParaContentosServiceImpl implements
		RecomendacionService {

	private List<Producto> productos;

	@Override
	public List<Producto> recomendarProductoPorEstado(String estadoDelUsuario) {
		// está contento hay que devolverle todo
		return productos;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	

}
