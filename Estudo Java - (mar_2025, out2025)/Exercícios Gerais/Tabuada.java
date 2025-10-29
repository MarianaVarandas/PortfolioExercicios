import java.util.Scanner;

/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInserido = 0;
        int multiplicador = 1;

        System.out.println("Digite um número");
        numeroInserido = input.nextInt();

        System.out.println(String.format("A tabuada de %d é: ", numeroInserido));

        while (multiplicador <= 10) {
            int resultado = numeroInserido * multiplicador;
            System.out.println(String.format("%d x %d = "+ resultado, multiplicador, numeroInserido));
            multiplicador++;
        }
    }
}