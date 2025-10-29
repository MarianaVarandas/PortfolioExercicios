/*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. obs: area do quadrado = lado x lado e area do circulo = 3,14 x raio²  */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ladoQuadrado = 0;
        double raioCirculo = 0;
        double area = 0;
        int escolhaUsuario;

        System.out.println("""
                Boas vindas à calculadora de áreas
                Veja no menu a opção desejada e digite a seguir o número escolhido: 
                
                1 - Calcular a área do quadrado
                2 - Calcular a área do circulo
                """);
        escolhaUsuario = input.nextInt();

        if (escolhaUsuario == 1){
            System.out.println("Agora digite o valor de um lado do quadrado");
            ladoQuadrado = input.nextDouble();

            area = ladoQuadrado * ladoQuadrado;

            System.out.println("A área desse quadrado é " + area);
        } else {
            System.out.println("Agora digite o raio do círculo");
            raioCirculo = input.nextDouble();

            area = Math.PI * (raioCirculo*raioCirculo);

            System.out.println("A area desse círculo é " + area);

        }

    }
}