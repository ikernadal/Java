package T7_e1;

public class PruebaCancion {

	public static void main(String[] args) {
		
		cd cd1 = new cd();
		
		Cancion c1 = new Cancion ("Soy guapo", "Faraón Love Shady");
		Cancion c2 = new Cancion ("Perreo en la mesa", "Faraón Love Shady");
		Cancion c3 = new Cancion ("Oh me vengo", "Faraón Love Shady");
		
		cd1.agrega(c1);
		System.out.println(cd1);
		cd1.dameCancion(0);
		System.out.println(cd1.numeroCanciones());
		cd1.grabaCanciones(999, c2);
		System.out.println(cd1);
		cd1.eliminaCancion(0);
		cd1.numeroCanciones();
		System.out.println(cd1);
		
	}

}
