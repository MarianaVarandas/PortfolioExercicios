/*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

import java.util.Scanner;

public class Comparacao{
    public static void main(String[] args) {
        Scanner comparacao = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite um número inteiro");
         num1 = comparacao.nextInt();
        System.out.println("Digite outro número inteiro");
        num2 = comparacao.nextInt();

        if (num1>num2){
            System.out.println(String.format("São números diferentes. %d é maior que %d",num1,num2));
        } if (num1<num2){
            System.out.println(String.format("São número diferentes. %d é menor que %d", num1,num2));
        }else{
            System.out.println("Você digitou o mesmo número duas vezes");
        }
    }
}