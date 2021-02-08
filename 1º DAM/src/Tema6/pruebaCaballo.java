package Tema6;

public class pruebaCaballo {
	public static void main (String [] args) {
		Caballo c1 = new Caballo("Pura sangre", 5, 120, "Paco", "Blanco", false, 1500);
		System.out.println(c1);
		System.out.println("Vamos a comprar el caballo");
		c1.vender();
		System.out.println("Está disponible el caballo 1 ---> " + c1.isDisponible());
		System.out.println(c1);
		System.out.println("No sabemos si hemos comprado el caballo ");
		c1.vender();
		System.out.println(c1);
		
		System.out.println("------------------------------------------------");
		
		Caballo c2 = new Caballo("Árabe", 6, 105, "Osama Bin-Laden", "Marrón", false, 5100);
		System.out.println(c2);
		System.out.println("Vamos a comprar el caballo ");
		c2.vender();
		System.out.println("Está disponible el caballo 2 ---> " + c2.isDisponible());
		System.out.println(c2);
		System.out.println("Tenemos el caballo, pero es muy feo y lo vendemos");
		c2.devolverCaballo();
		System.out.println("Está disponible el caballo 2 ---> " + c2.isDisponible());
		System.out.println(c2);
		System.out.println("No sabemos si hemos devuelto el caballo y lo vamos a devolver otra vez ");
		c2.devolverCaballo();
	}
}
