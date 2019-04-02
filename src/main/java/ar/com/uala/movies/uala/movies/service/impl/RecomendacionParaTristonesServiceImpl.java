package ar.com.uala.movies.uala.movies.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.uala.movies.uala.movies.enums.EstadoUsuarioEnum;
import ar.com.uala.movies.uala.movies.pojo.Producto;
import ar.com.uala.movies.uala.movies.service.RecomendacionService;
import ar.com.uala.movies.uala.movies.util.Constants;

/**
 * 
 * @author DIEGOALV
 *
 */
public class RecomendacionParaTristonesServiceImpl implements
		RecomendacionService {

	private List<Producto> productos;

	public List<Producto> recomendarProductoPorEstado(String estadoDelUsuario) {

		List<Producto> recomendaciones = new ArrayList<Producto>();

		if (EstadoUsuarioEnum.TRISTE.getEstado().equals(estadoDelUsuario)) {

			recomendaciones = productos
					.stream()
					.filter((p) -> p.getDuracionEnMinutos() > Constants.DOS_HORAS)
					.collect(Collectors.toList());
		}

		return recomendaciones;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
