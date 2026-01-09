package Exceptions.senha;

import java.util.Scanner;

public class MainSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Digite sua nova senha de 8 dígitos: ");
            String senhaDigitada = input.nextLine();
            Senha senha = new Senha(senhaDigitada);
            System.out.println("Senha aceita com sucesso!");
        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Programa finalizado.");
        }


    }
}
