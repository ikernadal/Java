package Tema6;

public class pruebaejemplo {
	public static void main (String [] args) {
		ejemplo e = new ejemplo ("Titulo1", "Autor1 ", 125);
		System.out.println (e);
		e.setPaginas(234);
		e.prestar();
		System.out.println (e.isPrestado());
	}
}
