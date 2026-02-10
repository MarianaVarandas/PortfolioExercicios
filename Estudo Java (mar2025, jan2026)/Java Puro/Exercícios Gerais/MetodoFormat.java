/*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/

public class MetodoFormat {
    public static void main(String[] args) {

        double precoProduto = 99.50;
        int quantidade = 6;
        double valorTotal = precoProduto * quantidade;

        System.out.println(String.format("O valor desta compra é R$%.2f",valorTotal));
    }
}