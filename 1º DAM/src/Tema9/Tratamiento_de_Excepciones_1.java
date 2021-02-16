package Tema9;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Tratamiento_de_Excepciones_1 {

	public static  void main(String[] args) {
		int numero; 
		Scanner s = new Scanner (System.in);
		System.out.println ("Introduzca un número: ");
		
		try
	 	{
			numero = s.nextInt();
		}
		catch (InputMismatchException excepcion){
			System.out.println ("Los tipos no coinciden");
		}
		finally {
			System.out.println ("De putos locos que va bien y todo");
		}
	}
	
}
