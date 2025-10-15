/* Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.*/

public class Casting2 {
    public static void main(String[] args) {
        double peso = 78.5;
        int idade = 32;

        int pesoInt = (int) peso;

        System.out.println("Sua idade é "+idade+" anos e seu peso é "+pesoInt+" quilos");

    }

    }