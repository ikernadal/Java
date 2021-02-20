package T6_e2;



public class Prueba_Pizza {
	
	public static void main (String []args) {
		
		
		Pizza p1 = new Pizza ("Mediana", "Margarita");
		System.out.println (p1);
		p1.servirPizza();
		
		System.out.println("-------------------------------------------------------------------------");
		
		Pizza p2 = new Pizza ("Familiar", "Funghi");
		System.out.println (p2);
		p2.servirPizza();
		
		System.out.println("-------------------------------------------------------------------------");

		Pizza p3 = new Pizza ("Mediano", "Cuatro Quesos");
		System.out.println (p3);
		
		
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Pedidas: " + Pizza.getPedidas());
		System.out.println("Servidas: " + Pizza.getServidas());
	}
}
