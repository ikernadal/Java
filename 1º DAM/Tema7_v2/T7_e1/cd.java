package T7_e1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class cd {
	private static int maxcanciones = 1000;
	private static int cancionesDisponibles = 999;
	private int contador;
	private Cancion[] canciones;
	
	public cd() {
		this.contador = 0;
		this.canciones = new Cancion [maxcanciones + 1];
	}
	
	public boolean agrega(Cancion c) {
		if (contador < 0 || contador > cancionesDisponibles) {
			return false; 
		} else {
			canciones [contador] = c;
			contador++;
			return true;
		}
	}
	
	public int numeroCanciones () {
		return contador;
	}
	
	public Cancion dameCancion(int i) {
		
		return canciones[i];
	
	}
	
	public boolean grabaCanciones (int i, Cancion c)  {
		if (i < 0 || i > cancionesDisponibles) {
			return false; 
		} else {
			canciones [i] = c;
			return true; 
		}
		
	}
	
	public boolean eliminaCancion (int i) {
		if (i < 0 || i > cancionesDisponibles) {
			return false; 
		} else {
			canciones [i] = canciones [maxcanciones];
			contador --;
			return true; 
			
		}
	}

	
	public String toString() {
		return "cd [contador=" + contador + ", canciones=" + Arrays.toString(canciones) + "]";
	}
	
	

}
