package T8_e2;

import T8_E1.PilaPalabras;

public class Prueba_PilaPalabrasArrayList {
	public static void main(String[] args) {
		PilaPalabras p1 = new PilaPalabras();
		System.out.println(p1.pilaPalabrasVacia());
		p1.apilarPalabra("a");
		p1.apilarPalabra("b");
		p1.apilarPalabra("c");
		p1.apilarPalabra("d");
		p1.apilarPalabra("nigger");
		p1.apilarPalabra("f");
		p1.apilarPalabra("snk");
		
		System.out.println(p1.obtenerPalabraCima());
		System.out.println(p1.desapilarPalabra());
		System.out.println(p1.obtenerPalabraCima());
		System.out.println(p1.pilaPalabrasVacia());
		System.out.println(p1);
	}
}
