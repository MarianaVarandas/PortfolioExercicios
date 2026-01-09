package Construtores;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Tesoura", 32.5, 3);
        Produto produto2 = new Produto("Pente", 5.65, 1);
        Produto produto3 = new Produto("Pasta de dentes", 10.5,10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("O tamanho da lista é: " + listaDeProdutos.size());
        System.out.println("O terceito ítem da lista é: " + listaDeProdutos.get(2));
        System.out.println(("Lista completa de produtos: " + listaDeProdutos));

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Ovo",10.5,40, "15/08/2025");

        System.out.println(produtoPerecivel1);

    }
}
