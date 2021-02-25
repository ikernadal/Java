package T9_e3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListLibros_HashSet {
	private HashSet<Libro> lista;

	public ArrayListLibros_HashSet(HashSet<Libro> lista) {
		this.lista = lista;
	}
	
	public int tam() {
		
		return lista.size();
		
	}
	
	public void agregar(Libro l) {
		
		lista.add(l);
		
	}
	
	public void eliminarPos(int i) {
		
		lista.remove(i);
		
	}
	
	public boolean coleccionVacia() {
		 
		return lista.isEmpty();
	}
	
	
	public void buscarContenido(String c) {
		
	      Iterator<Libro> puntero = lista.iterator();
	      boolean contiene = false;
	      while(contiene == false && puntero.hasNext()) {

	          Libro l = puntero.next();
	          if (l.getTitulo().contains(c)) {
	              contiene = true;
	              System.out.println(l);
	          }
	      }

	      if (contiene == false) {

	          System.out.println("El libro que buscas no existe.");
	      }
	  }
	
}


