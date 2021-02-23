package T8_e2;
import java.util.ArrayList;
import Tema8.Producto;
public class PilaPalabrasArrayList {
	private ArrayList <String> pila;  
	public PilaPalabrasArrayList () {
		pila = new ArrayList <String> () ;
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
