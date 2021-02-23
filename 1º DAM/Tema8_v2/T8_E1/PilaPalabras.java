package T8_E1;
import java.util.LinkedList;
import Tema8.Producto;
public class PilaPalabras {
	private LinkedList <String> pila;  
	public PilaPalabras () {
		pila = new LinkedList <String> () ;
	}
	public void apilarPalabra(String c) {
		pila.add(c);
	}
	public String desapilarPalabra () {
		return pila.remove(pila.size() - 1);
	}
	public String obtenerPalabraCima () {
		return pila.get(pila.size()-1);
	}
	public boolean pilaPalabrasVacia () {
		return pila.isEmpty();
	}
	public String toString() {
		return "PilaPalabras [pila=" + pila + "]";
	}	
}
