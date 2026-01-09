package ArrayLists_castings_instanceof.Main;

import ArrayLists_castings_instanceof.Classes.Produto;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 2.5);
        Produto produto2 = new Produto("Lapis", 1.55);
        Produto produto3 = new Produto("Caderno", 10.99);

        ArrayList <Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double acumulador = 0;
        double calculoMedia = 0;

        for(Produto item: listaDeProdutos){
            acumulador += item.getPreco();
        }

        calculoMedia = acumulador / listaDeProdutos.size();

        System.out.println(String.format("A média dos valores dos produtos dessa lista é: %.2f ", calculoMedia));

    }

}
