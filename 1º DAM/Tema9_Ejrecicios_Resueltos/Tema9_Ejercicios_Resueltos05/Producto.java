package Tema9_Ejercicios_Resueltos05;

public class Producto implements Comparable<Producto> {
	
	private String nombre;
	private int cantidad; 
	
	public Producto(String s, int i) {
		
		nombre = s;
		cantidad = i;
	}
	
	public String toString(){
		return ("Nombre: "+nombre+" Cantidad: "+cantidad);
	}
	

public int compareTo( Producto p ) {
		return( nombre.compareToIgnoreCase(p.nombre) );
	}
	
}