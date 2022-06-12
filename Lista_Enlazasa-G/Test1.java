
import java.util.*;
public class Test1 {

  public static void main(String[] args) {
    int tamano;

    Scanner teclado = new Scanner( System.in );
    System.out.print( "Introduzca el tamaño del arreglo: " );
    tamano = teclado.nextInt();

    ArrayList<LinkedList<Integer>> casos = new ArrayList<LinkedList<Integer>>();
    for(int n=1; n<=tamano; n++) {
    	casos.add(generarPeorCaso(n));
    }
    Iterator<LinkedList<Integer>> puntero = casos.iterator();
    while(puntero.hasNext()){
    	System.out.println(insertionSortTime(puntero.next()));
    }
  }
    public  static <E extends Comparable<E>> long insertionSortTime(LinkedList<E> A) {
    Node<E> key;
    int i;
    long nano_startTime = System.nanoTime();
    for (int j=1; j<A.getTamaño(); j++) {
      key = A.get(j);
      i = j - 1;
      while(i >= 0 && A.get(i).getData().compareTo(key.getData())>0) {	
	A.get(i).setNext(A.get(i+1).getNext());
	A.insert(A.get(i).getData(), i+2);
	i--;
      }
      //System.out.println(A);
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
      
     //System.out.println("Lista ordenada: " + A);
    }

    long nano_endTime = System.nanoTime();
    return nano_endTime - nano_startTime; 
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
	//System.out.println(A);
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

	//System.out.println("Lista ordenada: " + A);
      }
    }
    public static  LinkedList<Integer> generarPeorCaso(int t) {
      LinkedList<Integer> lista= new LinkedList<Integer>();
      for (int i = 0; i < t; i++) {
	lista.insertLast(t-i-1); 
      }
      //System.out.println(lista.getTamaño());
      return lista;
    }
}
