package es.eoi.multimedia.interfaces;

public interface Reproducible {

	public void play();
	public void stop();
	public void pause();
	
	public Boolean isPlay();
	public Boolean isStop();
	public Boolean isPause();

}
