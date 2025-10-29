/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.*/

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner adivinhacao = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas= 1;
        int respostaUsuario= 0;

        while (tentativas <= 5 && tentativas > 0 ) {
            System.out.println(String.format("""
                    Vamos adivinhar?
                    Você tem %d tentativas
                    Digite um número de 0 a 100;
                    """, 6-tentativas));
            respostaUsuario = adivinhacao.nextInt();

            if (respostaUsuario < numeroSecreto && tentativas < 5){
                System.out.println(String.format("Ops! Não era esse! o Número Secreto é maior que %d", respostaUsuario));

            } else if (respostaUsuario > numeroSecreto && tentativas <5) {
                System.out.println(String.format("Ops! Não era esse! o Número Secreto é menor que %d", respostaUsuario));

            } else if (respostaUsuario == numeroSecreto){
                System.out.println(String.format("Parabens, você acertou! O Número Secreto é %d e você digitou %d", numeroSecreto, respostaUsuario));
                break;
            }
        ++tentativas; //lembrete: fora das condicionais para que se o usuário errar, a condição de 5 tentativas continue válida (do contrário, se ficar dentro dos if caso ele erre na 5ª tentativa, não vai passar na condição e não vai incrementar porque o if só acontece de tentativas não for ). Depois das condicionais para só incrementar depois da validação
        }

        System.out.println(String.format("""
                Fim das tentativas! :(
                
                O Número Secreto era %d.
                """, numeroSecreto));

    }
}