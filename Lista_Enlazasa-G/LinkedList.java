public class LinkedList<E> implements List<E> {
  private Node<E> raiz;
  private int tamaño;

  public LinkedList() {
    this.raiz = null;
    tamaño = 0;
  }

  public boolean isEmpty() {
    return this.raiz == null;
  }

  public Node<E> get(int indice) {
    Node<E> aux= this.raiz;
    for(int i=0; i<indice; i++)
        aux=aux.getNext();
    return aux;
  }

  public void insertFirst(E x) {
    this.raiz = new Node<E>(x, this.raiz);
    this.tamaño+=1;
  }

  public void remove(int indice) {
    if(indice<this.tamaño) {
      if(indice==0)
	raiz=raiz.getNext();
      else {
	Node<E> anterior=this.get(indice-1);
	anterior.setNext(this.get(indice+1));
      }
      this.tamaño--;
    }
  }

  public void insert(E x, int p) {
    int count = 0;
    Node<E> aux = this.raiz;
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
    for (Node<E> aux = this.raiz; aux != null; aux = aux.getNext()) {
      str += aux.getData() + ",";
    }
    return str;
  }
}
