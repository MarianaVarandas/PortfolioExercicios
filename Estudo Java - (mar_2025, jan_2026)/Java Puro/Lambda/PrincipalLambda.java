package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalLambda {
    public static void main(String[] args) {

        //exercício 1
        IMultiplicador novaConta = (a, b) -> a * b;

        int resultado = novaConta.multiplicacao(5, 4);

        System.out.println(resultado);

        //exercício 2
        IVerificador novaVerificacao = n -> n % 2 == 0;
        boolean sePar = novaVerificacao.verificador(2);
        System.out.println(sePar);

        //exercício 3

        IConversao novaConversao = s -> s.toUpperCase();
        String maiuscula = novaConversao.conversor("ola, pessoa que está vendo meu exercício");
        System.out.println(maiuscula);

        //exercicio 4

        IPalindromo novoPalindromo = str -> {
            String invertida = new StringBuilder(str).reverse().toString(); //criando um StringBuilder com a String original pra checar se é palindromo
            return str.equalsIgnoreCase(invertida); // checando se str é igual invertida - ignorando maiusculas e minusculas
        };

        boolean SePalin = novoPalindromo.verificarPalindromo("Arara");
        System.out.println(SePalin);

        //exercicio 5

        List<Integer> listaInicial = new ArrayList<>();
        listaInicial.add(4);
        listaInicial.add(3);
        listaInicial.add(33);

        listaInicial.replaceAll(n -> n * 3);
        System.out.println(listaInicial);

        /*esse metodo ajuda a mudar todos os itens de uma lista. Porém, pra mim ele não entrega o que o enunciado pediu, que era uma nova lista. Por isso, deixo abaixo minha primeira responsta (sem replaceAll):


        List<Integer> listaConvertida = new ArrayList<>();

        for (int i = 0; i < e.size(); i++) {
            int valorOriginal = (int) e.get(i); // pegando o valor que tá no indice i para multiplicar
            listaConvertida.add(valorOriginal *3 );// adiciono na nova lista o valor original multiplicado por 3
            }
        return listaConvertida;

        List listaFinal = novaConversaoLista.convertendoLista(listaInicial);
        System.out.println(listaFinal);
        */

        //exercício 6
        List<String> listaParaOrdenar = new ArrayList<>(Arrays.asList("Pão", "Camiseta", "Gato", "Amora"));

        listaParaOrdenar.sort(String :: compareTo); // encurtando isso aqui: (p1, p2) -> p1.compareTo(p2)

        System.out.println(listaParaOrdenar);

        //exercício 7

        IDivisor minhaDivisao = (a, b) -> {
            if (b == 0) { // caso o divisor for zero, ele aponta o exception
                throw new ArithmeticException("Não é possível dividir por zero");
            }
            return (double) a / b;
        };

        double resultadoDivisao = minhaDivisao.dividir(8,2);
        System.out.println(resultadoDivisao);





    }
}








