/*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo int percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/

public class CalculandoDesconto {
    public static void main(String[] args) {

        double precoOriginal = 55.99;
        int percentualDesconto = 7;
        double desconto = (precoOriginal*percentualDesconto)/100;
        double valorFinal = precoOriginal-desconto;

        String mensagem = """
                 Olá, boas-vindas à calculadora de descontos!
                 O preço original do seu produto era de R$%.2f
                 O desconto especial feito para você é de %d%%
                 Assim, o preço final do seu produto é R$%.2f
                """.formatted(precoOriginal,percentualDesconto, valorFinal);

        System.out.println(mensagem);


    }
}