package Tema8;

public class MainPilaPalabrasLinkedList2 {

	public static void main(String[] args) {
		PilaPalabrasLinkedList2 ppal = new PilaPalabrasLinkedList2();
		ppal.apilarPalabra("Ciclo");
		ppal.apilarPalabra("DAM"); 
		System.out.println(ppal.pilaPalabrasVacia());
		System.out.println(ppal.obtenerpalabraCima());
		System.out.println(ppal.desapilarPalabra());
		System.out.println(ppal);
	}

}
