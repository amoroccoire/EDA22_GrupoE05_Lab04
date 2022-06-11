
public class Test1 {

  public static void main(String[] args) {
    LinkedList<Integer> lint = new LinkedList<Integer>();
    lint.insertFirst(10);
    System.out.println(lint);
    lint.insertFirst(14);
    System.out.println(lint);
    lint.insertFirst(7);
    System.out.println(lint);
    lint.insertFirst(19);
    System.out.println(lint);
    lint.insertFirst(25);
    System.out.println(lint);
    lint.remove(9);
    System.out.println(lint);
    insertionSort(lint);
  }
  public  static <E extends Comparable<E>> void insertionSort(LinkedList<E> A) {
    Node<E> key;
    int i;
    for (int j=1; j<A.getTamaño(); j=j+1) {
      key = A.get(j);
      i=j-1;
      while(i>-1 && A.get(i).getData().compareTo(key.getData())<0) {
	A.remove(i+1);
	i = i-1;
      }
      System.out.println(A);
      A.get(i).setNext(key);
    }
  }

}
