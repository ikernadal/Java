package Tema8;
import java.util.LinkedList; 
public class PilaPalabrasLinkedList {
	private LinkedList<String> pila;

	public PilaPalabrasLinkedList() {
		pila = new LinkedList<String>();
	}
	
	public boolean apilarPalabra (String palabra) {
		return pila.add(palabra);
	}
	
	public String desapilarPalabra () {
		if (!pilaPalabrasVacia()) {
			return pila.remove(pila.size()-1);
		} else {
			return "La pila est� vac�a ";
		}	
	}
	
	public String obtenerpalabraCima() {
		if (!pilaPalabrasVacia()) {
			return pila.get(pila.size()-1);
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
