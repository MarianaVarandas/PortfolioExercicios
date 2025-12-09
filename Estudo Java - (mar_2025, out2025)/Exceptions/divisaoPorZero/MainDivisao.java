package Exceptions.divisaoPorZero;

import java.util.Scanner;

public class MainDivisao{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Divisao divisao = new Divisao();

        System.out.println("Digite o dividendo: ");
        int valor1 = input.nextInt();
        divisao.setDividendo(valor1);

        System.out.println("Digite o divisor: ");
        int valor2 = input.nextInt();
        divisao.setDivisor(valor2);



        try {
            int resultado = divisao.daOResultado();
            System.out.println("O resultado é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível fazer uma divisão por zero.");
        }finally{
            System.out.println("Programa encerrado.");
        }


    }
}