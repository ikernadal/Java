package Tema6;

public class EjemploPizza {
	public static void main (String [] args) {
		Pizza p1 = new Pizza ("Mediano", "Margarita");
		System.out.println (p1);
		System.out.println ("Nos van a servir la pizza ");
		p1.yaServida();
		System.out.println (p1);
		
		System.out.println("-------------------------------------------------------------------------");
		
		Pizza p2 = new Pizza ("Familiar", "Funghi");
		System.out.println (p2);
		System.out.println("Nos van a servir la pizza");
		p2.yaServida();
		System.out.println(p2);
		
		System.out.println("-------------------------------------------------------------------------");

		Pizza p3 = new Pizza ("Mediano", "Cuatro Quesos");
		System.out.println (p3);
		System.out.println("Nos van a servir la pizza");
		p3.yaServida();
		System.out.println(p3);
		
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Pedidas: " + Pizza.getTotalPedidas());
		System.out.println("Servidas: " + Pizza.getTotalServidas());
	}
}
