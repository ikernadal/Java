package Tema8;

import java.util.ArrayList;
import java.util.Iterator;

/*métodos tamaño de la lista, imprimirLista, agregar un producto, buscar y recuperar el producto por la posición,
buscar y recuperar el producto por su código, eliminar un producto por su código, cambiarPrecio (del producto
mediante su código y el nuevo precio).*/


public class ArrayProducto {
	private ArrayList <Producto> lista;

	public ArrayProducto(ArrayList<Producto> lista) {
		lista = new ArrayList <Producto> () ; 
	} 
	
	public int tamaño () {
		return lista.size();
	}
	
	public void imprimirLista () {
		for (int i=0; i<lista.size(); i++) {
			System.out.println (lista.get(i) + "/n-------------------------------------------------------/n");
		}
	}
	
	public boolean AgregarUnProducto (Producto p) {
		return lista.add(p);
	}
	
	
	public static void main(String []args) {
		
	}
	
	
	
}
