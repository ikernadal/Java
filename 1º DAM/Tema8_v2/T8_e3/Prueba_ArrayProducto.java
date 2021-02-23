package T8_e3;

public class Prueba_ArrayProducto {

	public static void main(String[] args) {
		ArrayProducto l1 = new ArrayProducto();
		Producto p1 = new Producto(1, "taka taka", "abaja", 1, 1);
		Producto p2 = new Producto(2, "teke teke", "ebeje", 2, 2);
		Producto p3 = new Producto(3, "tiki tiki", "ibiji", 3, 3);
		Producto p4 = new Producto(4, "toko toko", "obojo", 4, 4);
		Producto p5 = new Producto(5, "tuku tuku", "ubuju", 5, 5);
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
