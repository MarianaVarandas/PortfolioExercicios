package ArrayLists_castings_instanceof.Main;

import ArrayLists_castings_instanceof.Classes.Circulo;
import ArrayLists_castings_instanceof.Classes.Quadrado;
import ArrayLists_castings_instanceof.Interface.Forma;

import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(15.6);
        Circulo circulo1 = new Circulo(9.50);
        Circulo circulo2 = new Circulo(8.88);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(quadrado1);
        listaDeFormas.add(quadrado2);
        listaDeFormas.add(circulo1);
        listaDeFormas.add(circulo2);

        for (Forma item: listaDeFormas){
            System.out.println(String.format("A area dessa forma é: %.2f cm", item.calculaArea()));

        }

    }
}
