
import java.util.*;
public class Test1 {

  public static void main(String[] args) {
    int tamano;

    Scanner teclado = new Scanner( System.in );
    System.out.print( "Introduzca el tamaño del arreglo: " );
    tamano = teclado.nextInt();

    LinkedList<Integer> lint = generarPeorCaso(tamano);
    System.out.println(lint);
    System.out.println("-------------------");
    insertionSort(lint);
  }
  public  static <E extends Comparable<E>> void insertionSort(LinkedList<E> A) {
    Node<E> key;
    int i;
    for (int j=1; j<A.getTamaño(); j++) {
      key = A.get(j);
      i = j - 1;
      while(i >= 0 && A.get(i).getData().compareTo(key.getData())>0) {	
	A.get(i).setNext(A.get(i+1).getNext());
	A.insert(A.get(i).getData(), i+2);
	i--;
      }
      System.out.println(A);
      if(i == -1){
	A.insertFirst(key.getData());
	A.remove(1);
      }
      else{
	Node<E> aux;
	aux = A.get(i+1).getNext();
	key.setNext(aux);
	A.get(i).setNext(key);
      }
      
     System.out.println("Lista ordenada: " + A);
    }
  }
  public static  LinkedList<Integer> generarPeorCaso(int t) {
    LinkedList<Integer> lista= new LinkedList<Integer>();
    for (int i = 0; i < t; i++) {
      lista.insertLast(t-i-1); 
    }
    System.out.println(lista.getTamaño());
    return lista;
  }
}
