package es.eoi.multimedia.app;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import es.eoi.multimedia.entity.Pelicula;
import es.eoi.multimedia.entity.Serie;
import es.eoi.multimedia.interfaces.Reproducible;

public class MultimediaApp {

	public static void main(String[] args) {
		
		//List<Pelicula> misPeliculas = new ArrayList<Pelicula>();
		
		List<Reproducible> misMultimedia = new ArrayList<Reproducible>();
		
		misMultimedia.add(new Pelicula("Titanic"));
		misMultimedia.add(new Pelicula("Interestellar"));
		misMultimedia.add(new Pelicula("Lluvia de albóndigas"));
		
		misMultimedia.add(new Serie("GOT",79));
		misMultimedia.add(new Serie("Simpson",2000000));
		misMultimedia.add(new Serie("Stranger Things",30));
		
		System.out.println("-----------------");
		System.out.println("MIS REPRODUCIBLES");
		System.out.println("-----------------");
		for(Reproducible multimedia : misMultimedia) {
			System.out.println(multimedia);
			multimedia.play();
			System.out.println(multimedia);
			multimedia.pause();
			System.out.println(multimedia);
			
			if(multimedia instanceof Serie) {
				if("GOT".equals(((Serie) multimedia).getNombre())) {
					((Serie) multimedia).previous();
					((Serie) multimedia).next();
					System.out.println(multimedia);
					((Serie) multimedia).next();
					System.out.println(multimedia);
					((Serie) multimedia).next();
					System.out.println(multimedia);
					
				}
			}
			
		}
		

	}

}
