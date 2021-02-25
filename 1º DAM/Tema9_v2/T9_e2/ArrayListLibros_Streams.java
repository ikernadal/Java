package T9_e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListLibros_Streams {
	
	private ArrayList<Libro> lista;
	
	public ArrayListLibros_Streams() {
		
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
	

	public void orderTituloStream () {
		  lista = lista.stream().sorted((x,y) -> x.getTitulo().compareToIgnoreCase(y.getTitulo())).collect(Collectors.toCollection(ArrayList::new));  
		  }
	  
	  public void orderPaginasStream () {
		  lista = lista.stream().sorted((x,y) -> x.getPaginas()-y.getPaginas()).collect(Collectors.toCollection(ArrayList::new));
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
