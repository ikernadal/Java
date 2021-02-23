package T8_e3;
import java.util.ArrayList;

public class ArrayProducto {
	private ArrayList <Producto> lista; 
	
	public ArrayProducto () {
		lista = new ArrayList();
	}
	
	public int tamañodelaLista () {
		return lista.size();
	}
	
	
	public String toString() {
		return "ArrayProducto [lista=" + lista + "]";
	}

	public void  agregarProducto (Producto c) {
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
