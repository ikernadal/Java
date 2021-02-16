package Tema9;

import java.util.Scanner;

public class Tratamiento_de_excepciones_2 {

	public static void enviarMensaje(String[] cadenita) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Ingrese su correo electrónico: ");
		try {
			cadenita = s.next();
		}
		catch {
			
		}
	}
	public static void main(String[] args) {
		
		String[] cadenita = new String[50];
		
		
		enviarMensaje(cadenita);
	}


}
