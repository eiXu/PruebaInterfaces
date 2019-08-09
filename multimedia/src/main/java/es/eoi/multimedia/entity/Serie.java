package es.eoi.multimedia.entity;

import es.eoi.multimedia.interfaces.Capituleable;
import es.eoi.multimedia.interfaces.Reproducible;

public class Serie implements Reproducible, Capituleable {

	private String nombre;
	private String estado;
	private int numCapitulos;
	private int capituloActual;

	public Serie(String nombreSerie, int numCapitulos) {
		super();
		this.nombre = nombreSerie;
		this.estado = "STOP";
		this.capituloActual = 1;
		this.numCapitulos = numCapitulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreSerie) {
		this.nombre = nombreSerie;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estadoSerie) {
		this.estado = estadoSerie;
	}

	public int getNumCapitulos() {
		return numCapitulos;
	}

	public void setNumCapitulos(int numCapitulos) {
		this.numCapitulos = numCapitulos;
	}

	public int getCapituloActual() {
		return capituloActual;
	}

	public void setCapituloActual(int capituloActual) {
		this.capituloActual = capituloActual;
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

		sb.append("Serie [nombre=");
		sb.append(this.nombre);
		sb.append("] [estado=");
		sb.append(this.estado);
		sb.append("] [capitulo=");
		sb.append(this.capituloActual);
		sb.append("/");
		sb.append(this.numCapitulos);
		sb.append("]");

		return sb.toString();
	}

	public void next() {
		
		if(this.capituloActual != this.numCapitulos) {
			this.capituloActual++;
		} else {
			System.out.println("No hay más capítulos hacia arriba");
		}

	}

	public void previous() {
		if(this.capituloActual != 1) {
			this.capituloActual--;
		} else {
			System.out.println("No hay más capítulos hacia abajo");
		}
	}

}
