package T8_e4;
import java.util.LinkedList;

public class ArrayProducto_LinkedList {
	private LinkedList <Producto_LinkedList> lista; 
	
	public ArrayProducto_LinkedList () {
		lista = new LinkedList();
	}
	
	public int tamañodelaLista () {
		return lista.size();
	}
	
	
	public String toString() {
		return "ArrayProducto [lista=" + lista + "]";
	}

	public void  agregarProducto (Producto_LinkedList c) {
		lista.add(c);
	}
	
	public void buscarPosicion (int p) {
		System.out.println(lista.get(p));
	}
	
	public void buscarCodigo (int codigo) {
		for (int i =0; i<lista.size(); i++) {
			if (codigo == lista.get(i).getCodigo()) {
				System.out.println(lista.get(i));
			}
		}
	}
	
	public void eliminarCodigo(int codigo) {
		for (int i =0; i<lista.size(); i++) {
			if (codigo == lista.get(i).getCodigo()) {
				System.out.println(lista.remove(i));
			}
		}
	}
	
	public void cambiarPrecio (int codigo, double precio) {
		for (int i =0; i<lista.size(); i++) {
			if (codigo == lista.get(i).getCodigo()) {
				lista.get(i).setPrecio(precio);
				System.out.println(precio);
			}
		}
	}
	
	
}
