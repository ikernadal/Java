package Tema9;


public class PruebaArrayListLibros {
  public static void main(String args[]) {
  	Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Fecha f1 = new Fecha(16,11,2001);
    Libro l1 = new Libro("Introducción a Java",p1, 
                         "0-13-031997-X",666,3,"Prentice-Hall","Madrid-España",f1);
                         
    Libro l2 = new Libro("Beginning Java",p1, 
                         "0-13-031997-X",154,3,"Addison","Madrid-España",f1);                     
    Libro l3 = new Libro("Avanzado Java",p1, 
                         "0-13-031997-X",1024,3,"McGraw-Hill","Madrid-España",f1);
    
                     
    
    ArrayListLibros a= new ArrayListLibros();
    a.insertar(l1);
    a.insertar(l2);
    a.insertar(l3);
   // a.ordPaginas();
 
    
  a.ordenarPaginasStream();
  a.ordenarTituloStream();
  System.out.println(a);
 
  }
}