import java.util.Scanner;

/*Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/
public class ParImpar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numeroUsuario = input.nextInt();

        if (numeroUsuario%2 == 0){
            System.out.println(String.format("%d é um número par", numeroUsuario));
        } else{
            System.out.println(String.format("%d é um número ímpar", numeroUsuario));
        }

    }
}