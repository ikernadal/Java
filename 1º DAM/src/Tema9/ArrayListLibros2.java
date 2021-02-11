package Tema9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListLibros2 {
 
  private ArrayList<Libro> lista;

  public ArrayListLibros2() {
    lista = new ArrayList<Libro>();
  }

  public boolean vacia() { return lista.isEmpty(); }

  public int length() { return lista.size(); }

  public int buscar(String parte) { 


    int i=0;
    boolean encontrado=false;
    while ((i<lista.size())&&(!encontrado)){
       if ((lista.get(i).dameTitulo().toUpperCase().indexOf(parte.toUpperCase()))!=-1) 
            encontrado=true;
        else i++;
    }
    if (encontrado) return i;
    else return -1;

  }


  public boolean insertar(Libro p) {

      lista.add(p);
      return true;

  }

  public void ordTitulo() {

      Collections.sort(lista, new TituloComparator());

  }

  public void ordPaginas() {

      Collections.sort(lista, new PaginasComparator());

  }
  
  
  

  public boolean eliminar(int pos) {
     if((pos < 1) || (pos > lista.size())||  (vacia()))
              return false;
     else
     {
         lista.remove(pos-1);
         return true;
     }
  }

  public Libro recuperar(int pos) {

    if((pos < 1) || (pos > lista.size())) return null;
    return lista.get(pos-1);
  }

  public String toString() {
    String cad = lista.size() + " Elementos de la lista:\n\n";
    for(int i = 0; i < lista.size(); i++)
      cad += lista.get(i) + "\n-----------------------------------------------\n";
    return cad;
  }

}