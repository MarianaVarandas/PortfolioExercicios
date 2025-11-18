package Interfaces.conversaoDolar;

public class PrincipalConversor {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorParaConverter = 500;
        double valorConvertido = conversor.converterDolarParaReal(500);

        System.out.println(String.format("O valor de US$%.2f convertido em reais é de R$%.2f", valorParaConverter, valorConvertido));
    }
}
