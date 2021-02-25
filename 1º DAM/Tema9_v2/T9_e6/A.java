package T9_e6;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int entero; 
		Scanner s = new Scanner (System.in);
		try {
			System.out.println("Introduzca un entero: ");
			entero = s.nextInt();
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Introduce un entero");
		}
	}
}


