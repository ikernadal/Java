package Tema8;
import java.util.LinkedList; 
public class PilaPalabrasLinkedList2 {
	private LinkedList<String> pila;

	public PilaPalabrasLinkedList2() {
		pila = new LinkedList<String>();
	}
	
	public boolean apilarPalabra (String palabra) {
		return pila.add(palabra);
	}
	
	public String desapilarPalabra () {
		if (!pilaPalabrasVacia()) {
			return pila.removeLast();
		} else {
			return "La pila está vacía ";
		}	
	}
	
	public String obtenerpalabraCima() {
		if (!pilaPalabrasVacia()) {
			return pila.getLast();
		} else {
			return null;
		}
	}
	
	public boolean pilaPalabrasVacia() {
		return pila.isEmpty(); 
	}

	@Override
	public String toString() {
		return "PilaPalabrasArrayList [pila=" + pila + "]";
	}
	
	
}
