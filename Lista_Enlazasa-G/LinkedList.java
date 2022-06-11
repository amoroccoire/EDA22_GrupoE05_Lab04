public class LinkedList<E> implements TDAList<E> {
  private Node<E> first;

  public LinkedList() {
    this.first = null;
  }

  public boolean isEmpty() {
    return this.first == null;
  }

  public boolean search(E x) {
    Node<E> aux = this.first;
    while (aux != null && !aux.getData().equals(x)) {
      aux = aux.getNext();
    }
    if (aux != null)
      return true;
    return false;
  }

  public void remove(E x) {
    Node<E> aux = this.first;
    if (!this.isEmpty()) {
      if (aux != null && aux.getData().equals(x)) {
	this.first = aux.getNext();
	aux.setNext(null);
      } else {

	for (; aux.getNext() != null && !aux.getNext().getData().equals(x); aux = aux.getNext())
	  ;
	aux.setNext(aux.getNext().getNext());
      }
    }
  }

  public void insert(E x, int p) {
    int count = 0;
    Node<E> aux = this.first;
    while (aux != null && count < p - 2) {
      aux = aux.getNext();
      count++;
    }
    if (p == 1 || this.isEmpty()) {
      this.insertFirst(x);
    } else if (count >= 0 && aux != null) {
      aux.setNext(new Node<E>(x,aux.getNext()));
    } else
      System.out.println("No existe dicha posición");


  }

  public String toString() {
    String str = "";
    for (Node<E> aux = this.first; aux != null; aux = aux.getNext()) {
      str += aux.getData() + ",";
    }
    return str;
  }

}
