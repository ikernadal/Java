package T8_e4;

public class Prueba_ArrayProducto_LinkedList {

	public static void main(String[] args) {
		ArrayProducto_LinkedList l1 = new ArrayProducto_LinkedList();
		Producto_LinkedList p1 = new Producto_LinkedList(1, "taka taka", "abaja", 1, 1);
		Producto_LinkedList p2 = new Producto_LinkedList(2, "teke teke", "ebeje", 2, 2);
		Producto_LinkedList p3 = new Producto_LinkedList(3, "tiki tiki", "ibiji", 3, 3);
		Producto_LinkedList p4 = new Producto_LinkedList(4, "toko toko", "obojo", 4, 4);
		Producto_LinkedList p5 = new Producto_LinkedList(5, "tuku tuku", "ubuju", 5, 5);
		l1.agregarProducto(p1);
		l1.agregarProducto(p2);
		l1.agregarProducto(p3);
		l1.agregarProducto(p4);
		System.out.println(l1.tamañodelaLista());
		l1.agregarProducto(p5);
		System.out.println(l1);
		System.out.println(l1.tamañodelaLista());
		l1.buscarCodigo(4);
		l1.eliminarCodigo(4);
		System.out.println(l1);
		l1.cambiarPrecio(5, 55.01);
		
		
	}

}
