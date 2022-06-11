public class DoubleLinkedList<T> {

    private Node<T> cabeza;
    private Node<T> cola;

    public DoubleLinkedList(){
        cabeza = null;
        cola = null;
    }

    public void push(T dato) {
        Node<T> nodo = new Node<T>(nodo);

        if (cabeza != null) {
            cola.setNextNode(nodo);
            nodo.setPreviousNode(cola);
            cola = nodo;
        }
    
    }
}
