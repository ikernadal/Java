package Tema8;

import java.util.ArrayList;
import java.util.Iterator;

/*m�todos tama�o de la lista, imprimirLista, agregar un producto, buscar y recuperar el producto por la posici�n,
buscar y recuperar el producto por su c�digo, eliminar un producto por su c�digo, cambiarPrecio (del producto
mediante su c�digo y el nuevo precio).*/


public class ArrayProducto {
	private ArrayList <Producto> lista;

	public ArrayProducto(ArrayList<Producto> lista) {
		lista = new ArrayList <Producto> () ; 
	} 
	
	public int tama�o () {
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
