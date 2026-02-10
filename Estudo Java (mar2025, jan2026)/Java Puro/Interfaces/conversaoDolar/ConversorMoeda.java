//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.//

package Interfaces.conversaoDolar;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        double cotacaoDolarDia = 5.5;
        double valorConvertido = valorEmDolar * cotacaoDolarDia;
        return valorConvertido;
    }
}
