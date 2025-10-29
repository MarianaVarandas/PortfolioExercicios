/*Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.

  Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.

  Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting de valores.*/

public class Casting {
    public static void main(String[] args) {
        double temperaturaCelsius = 30;
        double temperaturaFahren = (temperaturaCelsius * 1.8) + 32;

        int temperaturaFahrenInt = (int) temperaturaFahren ;

        System.out.println("Temperatura convertida para Fahrenheit: " + temperaturaFahrenInt);
    }
}