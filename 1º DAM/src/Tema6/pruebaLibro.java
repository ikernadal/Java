package Tema6;

public class pruebaLibro {
	public static void main (String [] args) {
		
		Libro l2 = new Libro ("Isbn2", "Titulo2", "Autor2", 222); 
		System.out.println(l2);
		l2.prestar();
		System.out.println("Está prestado el libro 2 ---> " + l2.isPrestado());
		System.out.println(l2);

	}
}
