package Tema9;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Iterator;
public class Minidiccionario {
	
	public static void main (String [] args) {
		HashMap<Integer, String> esp = new HashMap<Integer, String>();
		HashMap<Integer, String> eng = new HashMap<Integer, String>();
		
		esp.put(0, "1.- hola");
		eng.put(0, "1.- hello");
		
		esp.put(1, "2.- nombre");
		eng.put(1, "2.-name");
		
		esp.put(2, "3.- lleno");
		eng.put(2, "3.- full");
		
		esp.put(3, "4.- pelota");
		eng.put(3, "4.- ball");
		
		esp.put(4, "5.- jardín");
		eng.put(4, "5.- garden");
		
		esp.put(5, "6.- playa");
		eng.put(5, "6.- beach");
		
		esp.put(6, "7.- palabra");
		eng.put(6, "7.- word");
		
		esp.put(7, "8.- pájaro");
		eng.put(7, "8.- bird");
		
		esp.put(8, "9.- cadena");
		eng.put(8, "9.- string");
		
		esp.put(9, "10.- ladrillo");
		eng.put(9, "10.- brick");
		
		esp.put(10, "11.- mar");
		eng.put(10, "11.- sea");
		
		esp.put(11, "12.- caballo");
		eng.put(11, "12.- horse");
		
		esp.put(12, "13.- gato");
		eng.put(12, "13.- cat");
		
		esp.put(13, "14.- perro");
		eng.put(13, "14.- dog");
		
		esp.put(14, "15.- persona");
		eng.put(14, "15.- person");
		
		esp.put(15, "16.- pescado");
		eng.put(15, "16.- fish");
		
		esp.put(16, "17.- patata");
		eng.put(16, "17.- potatoe");
		
		esp.put(17, "18.- mano");
		eng.put(17, "18.- hand");
		
		esp.put(18, "19.- brazo");
		eng.put(18, "19.- arm");
		
		esp.put(19, "20.- sol");
		eng.put(19, "20.- sun");
		
		/*for (int i=0; i<esp.size(); i++) {
			System.out.println(esp.get(i));
			System.out.println(eng.get(i));
			System.out.println("");
		}*/
		

		
		Scanner s = new Scanner (System.in);
		int NumElegido;
		for (String valor : esp.values()) {
			System.out.println(valor);
		}
	        
		System.out.println("Elige el número de la palabra para traducirla al inglés: " );
		NumElegido = s.nextInt();
		System.out.println();
		
		for (int i=0; i<NumElegido; i++) {
			if ((i+1) == NumElegido) {
				System.out.println(esp);
			}
		}
		
	}
	
}
