package es.eoi.multimedia.entity;

import es.eoi.multimedia.interfaces.Reproducible;

public class Pelicula implements Reproducible {

	private String nombre;
	private String estado;

	public Pelicula(String nombrePelicula) {
		super();
		this.nombre = nombrePelicula;
		this.estado = "STOP";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombrePelicula) {
		this.nombre = nombrePelicula;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estadoPelicula) {
		this.estado = estadoPelicula;
	}

	public void play() {
		System.out.println("Arrancando ".concat(this.nombre).concat(" en 3 2 1 ..."));
		this.estado = "PLAY";
	}

	public void stop() {
		System.out.println("Parando ".concat(this.nombre).concat(" en 3 2 1 ..."));
		this.estado = "STOP";
	}

	public void pause() {
		System.out.println("Pausando ".concat(this.nombre).concat(" en 3 2 1 ..."));
		this.estado = "PAUSE";
	}

	public Boolean isPlay() {
		return "PLAY".equals(this.estado);
	}

	public Boolean isStop() {
		return "STOP".equals(this.estado);
	}

	public Boolean isPause() {
		return "PAUSE".equals(this.estado);
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Película [nombre=");
		sb.append(this.nombre);
		sb.append("] [estado=");
		sb.append(this.estado);
		sb.append("]");
		
		return sb.toString();
	}
}
