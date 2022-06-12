import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ListaDoble {

    public static void main(String[] args) throws FileNotFoundException { 
        
        int numero = 10000; //se refiere a la cantidad de arreglos que contendran los peores casos

        ArrayList<DoubleLinkedList> listasD = new ArrayList<DoubleLinkedList>();
        String archivo = "archivo2.txt";
        PrintWriter oS = new PrintWriter(archivo);

        for (int i = 1; i <= numero; i++) {
            DoubleLinkedList<Integer> lista = new DoubleLinkedList<Integer>();
            for (int j = 0; j < i; j++)
                lista.push(i - j);

            listasD.add(lista);
        }

        for (int i = 0; i < listasD.size(); i++)
            oS.println(String.valueOf(listasD.get(i).ordenamientoInsercion()));

        oS.close();

        //el grafico sera hecho por otro miembro solo se genera el archivo con los datos necesarios
    }
}

