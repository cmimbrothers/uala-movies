package ar.com.uala.movies.uala.movies.service;

import java.util.List;

import ar.com.uala.movies.uala.movies.pojo.Producto;

/**
 * 
 * @author DIEGOALV
 *
 */
public interface RecomendacionService {
	
	abstract List<Producto> recomendarProductoPorEstado(String estadoDelUsuario);
	
	void setProductos(List<Producto> productos);
	
	List<Producto> getProductos();
	
	
}
