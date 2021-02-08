package Tema8;

public class MainPilaPalabrasLinkedList {

	public static void main(String[] args) {
		PilaPalabrasLinkedList ppal = new PilaPalabrasLinkedList();
		ppal.apilarPalabra("Ciclo");
		ppal.apilarPalabra("DAM"); 
		System.out.println(ppal.pilaPalabrasVacia());
		System.out.println(ppal.obtenerpalabraCima());
		System.out.println(ppal.desapilarPalabra());
		System.out.println(ppal);
	}

}
