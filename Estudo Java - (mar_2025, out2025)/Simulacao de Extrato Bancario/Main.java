import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Mariana Varandas";
        String conta = "Corrente";
        double saldo = 500;
        int escolhaUsuario = 0;
        double valorRecebido = 0;
        double valorEnviado = 0;

        System.out.println(String.format("""
                ***********************************************************
                
                Bem-vindo ao assistente virtual do Banco Mais Você!
                Dados da sua conta:
                
                Nome: %s
                Tipo de conta: %s
                Saldo atual: R$%.2f
                
                ***********************************************************
                """, nome, conta, saldo));


        while(escolhaUsuario !=4){
            System.out.println("""
                
                MENU DE OPÇÕES
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Escolha a opção desejada:
                """);
            escolhaUsuario = input.nextInt();


        switch (escolhaUsuario) {
            case 1:
                System.out.println(String.format("Seu saldo atual é: R$%.2f", saldo));
                break;

            case 2:
                System.out.println("Qual o valor que deseja receber?");
                valorRecebido = input.nextDouble();
                saldo += valorRecebido;
                System.out.println(String.format("Seu saldo atual é: R$%.2f",saldo));
                break;

            case 3:
                System.out.println("Informe o valor a transferir");
                valorEnviado = input.nextDouble();
                if (valorEnviado > saldo){
                    System.out.println("Seu saldo é insuficiente para essa transação");
                }else{
                    saldo -= valorEnviado;
                System.out.println(String.format("Seu saldo atual é: R$%.2f",saldo));
                }
                break;

            default:
                System.out.println("Opção inválida. Tente novamente!");
                break;

        }
        }

        System.out.println("Até mais!");

    }

        }