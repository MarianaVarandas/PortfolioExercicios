package Collections.sort_LinkedList_Comparable_compareTo;

import Collections.sort_LinkedList_Comparable_compareTo.classes.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();
        for (int i=10; i >=0; i--) {
            numerosInteiros.add(i);
        }

        Collections.sort(numerosInteiros);

        System.out.println("Lista de números inteiros em ordem crescente: " + numerosInteiros);


        Titulo titulo1 = new Titulo("Angela");
        Titulo titulo2 = new Titulo("Sabrina");
        Titulo titulo3 = new Titulo("José");

        List<Titulo> listaDeNomes = new ArrayList<>();
        listaDeNomes.add(titulo1);
        listaDeNomes.add(titulo2);
        listaDeNomes.add(titulo3);

        listaDeNomes.sort(Comparator.comparing(Titulo::getNome)); // comparando através da string
        System.out.println("Lista de Nomes em ordem alfabética: " + listaDeNomes);

    }
}
