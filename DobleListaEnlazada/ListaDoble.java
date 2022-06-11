import java.util.Scanner;

public class ListaDoble{
    public static void main(String[] args){
        DoubleLinkedList<Integer> listas = new DoubleLinkedList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la lista: ");
        int tamanio = sc.nextInt();

        for (int i = 0; i < tamanio; i++)
            lista.push(tamanio - i);

        System.out.print(lista.toString());
}
