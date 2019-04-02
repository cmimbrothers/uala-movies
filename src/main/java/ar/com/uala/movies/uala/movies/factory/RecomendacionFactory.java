package ar.com.uala.movies.uala.movies.factory;

import ar.com.uala.movies.uala.movies.enums.EstadoUsuarioEnum;
import ar.com.uala.movies.uala.movies.service.RecomendacionService;
import ar.com.uala.movies.uala.movies.service.impl.RecomendacionParaContentosServiceImpl;
import ar.com.uala.movies.uala.movies.service.impl.RecomendacionParaMelancosServiceImpl;
import ar.com.uala.movies.uala.movies.service.impl.RecomendacionParaTristonesServiceImpl;

/**
 * Devuelve una implementacion recomendacion segun el estado del usuario
 * @author DIEGOALV
 *
 */
public class RecomendacionFactory {

	public static RecomendacionService getRecomendacion(String estadoUsuario) {

		if (EstadoUsuarioEnum.TRISTE.getEstado().equals(estadoUsuario)) {
			return new RecomendacionParaTristonesServiceImpl();
		} else if (EstadoUsuarioEnum.CONTENTO.getEstado().equals(estadoUsuario)) {
			return new RecomendacionParaContentosServiceImpl();
		} else if (EstadoUsuarioEnum.MELANCOLICO.getEstado().equals(estadoUsuario)) {
			return new RecomendacionParaMelancosServiceImpl();
		}

		return null;
	}
}
