package Estatisticas;

import java.util.*;
import java.util.stream.Collectors;



public class MainStats {
    public static void main(String[] args) {
        //1. Dada a lista de números inteiros a seguir, encontre o maior número dela.

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        IntSummaryStatistics stats =  numeros.stream()
                .collect(Collectors.summarizingInt(n -> n));

        System.out.println("O maior número da lista é: " + stats.getMax());

        //2.Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. A seguir, há um exemplo prático do resultado esperado:{4=[java, code], 6=[stream, lambda]}

        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List <String>> subPorTamanho = palavras.stream() //Crie uma variável chamada subPorTamanho. Ela vai ser um Mapa onde as etiquetas são Números Inteiros e, dentro de cada etiqueta, haverá uma Lista de Palavras."
                .collect(Collectors.groupingBy(p -> p.length()));


        System.out.println("Reagrupamento por tamanho: " + subPorTamanho);

        //3. Dada a lista de nomes abaixo, concatene-os separados por vírgula. No código a seguir, há um exemplo prático do resultado esperado:  "Alice, Bob, Charlie"

        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String juntandoNomes = nomes.stream()
                .collect(Collectors.joining(", ", "\"", "\"")); // transformo esses strings em um string só, separados por virgula. A ordem do joining é delimitador, prefixo e sufixo. Lembrando que, pro java não ficar confuso, eu preciso colocar uma barra ao contrario antes dessa aspa de sufixo e prefixo

        System.out.println(juntandoNomes);

        //4. Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntSummaryStatistics stats2 = numeros2.stream()
                .filter (n -> n % 2 == 0)
                .peek(n -> System.out.println("Apenas pares: " + n))
                .map(n -> n * n)
                .peek (n -> System.out.println("Pares transformados em quadrado: " + n))
                .collect(Collectors.summarizingInt(n -> n));

        System.out.println("A soma dos quadrados dos números pares é: " + stats2.getSum()); // eu tinha pedido pra somar stats sem o 2 e tava, claro dando um resultado errado. Coloquei o peek pra ver se alguma parte da lógica tava errada e só depois reparei que eu concatenei a variável errada kkk

        //5. Dada uma lista de números inteiros, separe os números pares dos ímpares.

        List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> novaLista = numeros3.stream() // coloquei boolean porque o resultado do partitioning vai ser um boolean
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(novaLista);

        // observação sobre groupingBy e pstitioningBy (achei parecidos)
        // groupingBy: É um Generalista. Serve para agrupar por qualquer coisa (nomes, idades, cidades, datas).
        //
        //partitioningBy: É um Especialista. Serve exclusivamente para dividir em dois grupos (Verdadeiro ou Falso).

        //6. Dada a lista de produtos abaixo, agrupe-os por categoria em um Map<String, List<Produto>>

        List<ProdutoStats> produtos3 = Arrays.asList(
                new ProdutoStats("Smartphone", 800.0, "Eletrônicos"),
                new ProdutoStats("Notebook", 1500.0, "Eletrônicos"),
                new ProdutoStats("Teclado", 200.0, "Eletrônicos"),
                new ProdutoStats("Cadeira", 300.0, "Móveis"),
                new ProdutoStats("Monitor", 900.0, "Eletrônicos"),
                new ProdutoStats("Mesa", 700.0, "Móveis")
        );

        Map<String, List<ProdutoStats>> reagruop = produtos3.stream()
                .collect(Collectors.groupingBy(p -> p.getCategoria()));

        System.out.println(reagruop);

        //7. Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long>.

        Map<String, Long> quantidade = produtos3.stream()
                .collect(Collectors.groupingBy(p-> p.getCategoria(), Collectors.counting()));

        System.out.println(quantidade);

        //8. Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene o resultado em um Map<String, Optional<Produto>>.

        Map<String, Optional<ProdutoStats>> maisCaro = produtos3.stream()
                .collect(Collectors.groupingBy( p -> p.getCategoria(), // a chave = categoria
                Collectors.maxBy( // a ação = pegar o maior
                        Comparator.comparingDouble(p -> p.getPreco()) // o maior o que? preço
                )));

        System.out.println(maisCaro);

        //9. Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria e armazene o resultado em um Map<String, Double>.

        Map<String, Double> total = produtos3.stream()
                .collect(Collectors.groupingBy( p -> p.getCategoria(), Collectors.summingDouble(p -> p.getPreco())));

        System.out.println(total);























    }
}
