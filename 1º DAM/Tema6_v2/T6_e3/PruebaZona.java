package T6_e3;

import java.util.Scanner;

public class PruebaZona {

	public static void main(String[] args) {
		Zona principal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona vip = new Zona(25);
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("1.- Mostrar número de entradas libres");
		System.out.println("2.- Vender entradas");
		System.out.println("3.- Salir");
		System.out.println("Seleccione insertando un número lo que quiere hacer:");
		i = s.nextInt();
		
		switch(i)
		{
		   case 1 :
			 
		     System.out.println(principal.getEntradas());
		     System.out.println(compraVenta.getEntradas());
		     System.out.println(vip.getEntradas());
		     break; 
		     
		   case 2 :
			   System.out.println("Indique la zona donde quiere comprar las entradas: ");
			   System.out.println("1.- Zona Principal");
			   System.out.println("2.- Zona Compra-Venta");
			   System.out.println("3.- Zona VIP");
			   int z; 
			   z = s.nextInt();
			   if (z==1) {
				   System.out.println("Indique la cantidad de entradas que quiere: ");
				   int c;
				   c = s.nextInt();
				   principal.venderEntradas(c);
			   } else {
				   if (z==2) {
					   System.out.println("Indique la cantidad de entradas que quiere: ");
					   int c;
					   c = s.nextInt();
					   compraVenta.venderEntradas(c);
				   } else {
					   if (z==3) {
						   System.out.println("Indique la cantidad de entradas que quiere: ");
						   int c;
						   c = s.nextInt();
						   vip.venderEntradas(c);
					   } else {
						   System.out.println("La zona no es valida");
					   }
				   }
			   }
			   
		      break;
		      
		   case 3 : 
			   break;
		   
		   
		   default : 
			   break;
		     
		}
	}

}
