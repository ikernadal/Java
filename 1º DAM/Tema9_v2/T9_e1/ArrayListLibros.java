package T9_e1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLibros {
	
	private ArrayList<Libro> lista;
	
	public ArrayListLibros() {
		
		this.lista = new ArrayList<Libro>();
		
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
	
	public Libro buscarPos(int i) {
		
		return lista.get(i);
		
	}
	
	public void compareTitle(Libro l1, Libro l2) {
		Collections.sort(lista, new TituloComparator());
	}
	
	public void comparePaginas(Libro l1, Libro l2) {
		Collections.sort(lista, new PaginasComparator());
	}
	
	
	
	public int findTitulo(String t) {
		
		boolean seguir = true;
		int i = 0;
		
		while ((i<lista.size())&&(seguir)){
			
			if ((lista.get(i).getTitulo().toUpperCase().indexOf(t.toUpperCase()))!=-1) {
				
				seguir = false;
			
			} else {
				
				i++;
				
			}
		
		}
		
		if(!seguir) {
			
			return i;
			
		} else {
			
			return -1;
			
		}
		
	}
	
}
