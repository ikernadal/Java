package T9_e5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MiniDiccionario2 {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);
		String palabraElegida;
		int rand;
		
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
		
		int verdadero = 0;
		int falso = 0;
		
		
		for (int k=0; k<5; k++) {
			Iterator i = diccionario.keySet().iterator();
			rand = (int)(Math.random()*diccionario.size());
			for (int j=0; j<rand; j++) {
				i.next();
			}
			String joseluis = (String)(i.next()); //joseluis es la clave de todo
			System.out.println(joseluis);
			System.out.println("Escriba la traducción de la palabra: ");
			palabraElegida = s.nextLine();
			if (palabraElegida.toUpperCase().equals(diccionario.get(joseluis).toUpperCase())) {
				verdadero++;
				} else {
					falso++;
				}
			}
		
		System.out.println("Palabras acertadas: " + verdadero);
		System.out.println("Palabras no acertadas: " + falso);
	}
}
