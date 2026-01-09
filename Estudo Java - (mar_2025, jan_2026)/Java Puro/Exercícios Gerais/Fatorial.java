import java.util.Scanner;

/*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número*/
/* lembrança: fatorial é multiplicar todos os números até n. Para n=3, fatorial é 1*2*3 = 6*/

public class Fatorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int respostaUsuario = 0;

        System.out.println("Digite um número inteiro:");
        respostaUsuario = input.nextInt();

        int fatorial = 1; // variável para acumular os resultados do loop

        for (int i=1; i <= respostaUsuario; i++ ){
            fatorial *= i;
            /* a cada volta do loop, a variavel fatorial vai armazenar o valor anterior.
            Ex: se respostaUsuario for 5:
                1ª volta = 1(fatorial)*1(i)=1
                2ª volta = 1(fatorial)*2(i)=2 (novo valor de fatorial)
                3ª volta = 2(fatorial)*3(i)=6 e assim por diante até 5.  */
        }
        System.out.println(String.format("O fatorial de %d é %d", respostaUsuario,fatorial));
    }
}