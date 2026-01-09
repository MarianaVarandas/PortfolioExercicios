import java.util.Scanner;

/*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo"/*

 */
public class Condicional {
    public static void main(String[] args) {
        Scanner numeroDigitado = new  Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int respostaUsuario = numeroDigitado.nextInt();

        if (respostaUsuario > 0) {
            System.out.println("Esse número é positivo");
        } if (respostaUsuario == 0){
            System.out.println("Zero não é nem positivo, nem negativo");
        }else{
            System.out.println("Esse número é negativo");
        }
    }
}