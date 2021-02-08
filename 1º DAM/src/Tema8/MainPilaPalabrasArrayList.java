package Tema8;

public class MainPilaPalabrasArrayList {

	public static void main(String[] args) {
		PilaPalabrasArrayList ppal = new PilaPalabrasArrayList();
		ppal.apilarPalabra("Ciclo");
		ppal.apilarPalabra("DAM"); 
		System.out.println(ppal.pilaPalabrasVacia());
		System.out.println(ppal.obtenerpalabraCima());
		System.out.println(ppal.desapilarPalabra());
		System.out.println(ppal);
	}

}
