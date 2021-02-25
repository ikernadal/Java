package T9_e5;

import java.util.HashMap;
import java.util.Scanner;

public class MiniDiccionario {
	
	
	
	public static void main (String []args) {
		HashMap<String, String> diccionario = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);
		String palabraElegida;
		
		diccionario.put("Yo", "I");
		diccionario.put("Soy", "Am");
		diccionario.put("Yendo", "Going");
		diccionario.put("A", "To");
		diccionario.put("Secuestrar", "Kidnap");
		diccionario.put("Tu", "Your");
		diccionario.put("Mujer", "Wife");
		diccionario.put("Tambien", "Also");
		diccionario.put("Su", "Her");
		diccionario.put("Hija", "Daughter");
		diccionario.put("Y", "And");
		diccionario.put("Si", "If");
		diccionario.put("Tu", "You");
		diccionario.put("Intentar", "Try");
		diccionario.put("Gracioso", "Funny");
		diccionario.put("LLamar", "Call");
		diccionario.put("La", "The");
		diccionario.put("Policia", "Police");
		diccionario.put("Ellos", "They");
		diccionario.put("Van", "Will");
		diccionario.put("Morir", "Die");
		
		System.out.println(diccionario);
		System.out.println("Elija una palabra para traducir (exactamente como se muestra en el diccionario): ");
		palabraElegida = s.nextLine();
		
		if (diccionario.containsKey(palabraElegida)) {
			System.out.println("La palabra " + palabraElegida + " traducida es " + diccionario.get(palabraElegida));
		}
		
		
	}
}




