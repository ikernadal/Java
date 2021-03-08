package Proyecto1;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String titulo, String autor, String formato, double duracion, String genero
		
		ListaMultimedia l1 = new ListaMultimedia();
		Disco d1 = new Disco("Cancion del Waffle molón", "Daft Punk", "mp4", 3.21,  "Musica clásica");
		Disco d2 = new Disco("Me vengo con el Waffle", "Faraón Love Shady", "mp4", 4.56,  "Hard Punk");
		Disco d3 = new Disco("Pana Miguel", "Keyan", "mp10", 600.00,  "Temardo");
		
		l1.add(d1);
		l1.add(d2);
		l1.add(d3);
	
		//Aquí acaban los discos
		
		
		//String titulo, String autor, String formato, double duracion, String autorPrincipal, String actrizPrincipal
		
		Pelicula p1 = new Pelicula("El retorno del Waffle", "Stephen Hawkins", "Comedia repetitiva", 999999999999999999.999, "El Waffle", "La encimera");
		Pelicula p2 = new Pelicula("8M", "Don comedia", "Comedia racista", 42069.69, "Feministas", "Princesos");
		Pelicula p3 = new Pelicula("El Waffle anti manifestaciones", "Persona con cabeza", "Comedia/Terror", 10.25, "El Waffle falangista", "Las cocina");
		
		
	}


}
