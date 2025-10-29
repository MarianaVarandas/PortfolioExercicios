/*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

public class MetodoFormatted {
    public static void main(String[] args) {
        double dolar = 35.99;
        double conversao = dolar * 4.94;

        String printOut = """
                Olá, boas-vindas ao nosso conversor de moedas!
                Aqui está o resultado da sua conversão.
                Seus %.2f dolares, quando convertidos serão %.2f reais.
                """.formatted(dolar, conversao);

        System.out.println(printOut);

    }
}