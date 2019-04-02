package ar.com.uala.movies.uala.movies.enums;

public enum EstadoUsuarioEnum {

	TRISTE("TRISTE"), CONTENTO("CONTENTO"), MELANCOLICO("MELANCOLICO");

	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	private EstadoUsuarioEnum(String estado) {
		this.estado = estado;
	}

}
