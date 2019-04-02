package ar.com.uala.movies.uala.movies.pojo;

import java.util.List;

public class Usuario {

	private String usuarioId;
	private double creditoDisponible;
	private String estado;

	private List<CanalComunicacion> canalesHabilitados;
	private List<HistorialReproduccion> productosVistos;
	
	

	public Usuario(String usuarioId, double creditoDisponible, String estado) {
		super();
		this.usuarioId = usuarioId;
		this.creditoDisponible = creditoDisponible;
		this.estado = estado;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public double getCreditoDisponible() {
		return creditoDisponible;
	}

	public void setCreditoDisponible(double creditoDisponible) {
		this.creditoDisponible = creditoDisponible;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<CanalComunicacion> getCanalesHabilitados() {
		return canalesHabilitados;
	}

	public void setCanalesHabilitados(List<CanalComunicacion> canalesHabilitados) {
		this.canalesHabilitados = canalesHabilitados;
	}

	public List<HistorialReproduccion> getProductosVistos() {
		return productosVistos;
	}

	public void setProductosVistos(List<HistorialReproduccion> productosVistos) {
		this.productosVistos = productosVistos;
	}
	
	

}
