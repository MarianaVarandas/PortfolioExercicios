package Streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class PrincipalStreams {
        public static void main(String[] args) {
            //1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.

            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

            numeros.stream()
                    .filter(n -> n%2 ==0)
                    .forEach(n -> System.out.println(n));

            //2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.

            List<String> palavras = Arrays.asList("java", "stream", "lambda");

            palavras.stream()
                    .map(n -> n.toUpperCase())
                    .forEach(n -> System.out.println(n));

            //3 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2 e colete os resultados em uma nova lista.

            List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

            numeros2.stream()
                    .filter(n -> n % 2 != 0)
                    .map (n -> n *2)
                    .toList()
                    .forEach(System.out::println);

            //4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez) e imprima o resultado.

            List<String> palavras3 = Arrays.asList("apple", "banana", "apple", "orange", "banana");

            palavras3.stream()
                    .distinct()
                    .forEach(n -> System.out.println(n));

            //5 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista e os ordene em ordem crescente.

            List<List<Integer>> listaDeNumeros = Arrays.asList( // pra esse criei um método auxiliar
                    Arrays.asList(1, 2, 3, 4),
                    Arrays.asList(5, 6, 7, 8),
                    Arrays.asList(9, 10, 11, 12));

            listaDeNumeros.stream()
                    .flatMap(l -> l.stream()) //
                    .filter(n -> MetodosAuxiliares.verificaSePrimo(n))
                    .sorted()
                    .toList()
                    .forEach(System.out::println);

            //6 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos, extraia os nomes e imprima-os em ordem alfabética.

            List<PessoaStreams> pessoas = Arrays.asList(
                    new PessoaStreams("Alice", 22),
                    new PessoaStreams("Charlie", 19),
                    new PessoaStreams("Bob", 17));

            pessoas.stream()
                    .filter (p -> p.idade >= 18)
                    .sorted(Comparator.comparing(p -> p.getNome()))
                    .map(p -> p.getNome())// aqui a lista deixa de ser de instâncias e passa a ser de Strings
                    .forEach(System.out::println);

            //7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

            List<ProdutoStream> produtos = Arrays.asList(
                    new ProdutoStream("Smartphone", 800.0, "Eletrônicos"),
                    new ProdutoStream("Notebook", 1500.0, "Eletrônicos"),
                    new ProdutoStream("Teclado", 200.0, "Eletrônicos"),
                    new ProdutoStream("Cadeira", 300.0, "Móveis"),
                    new ProdutoStream("Monitor", 900.0, "Eletrônicos"),
                    new ProdutoStream("Mesa", 700.0, "Móveis")

            );

            List<ProdutoStream> produtosFiltrados = produtos.stream()
                    .filter(p -> p.getCategoria().equals("Eletrônicos") && p.getPreco() < 1000.0)
                    .sorted(Comparator.comparing(p -> p.getPreco()))
                    .toList();

            // 8 - Tomando o mesmo código do exercício anterior como base, modifique o código para que a saída mostre apenas os três produtos mais baratos da categoria "Eletrônicos".

            List<ProdutoStream> produtosFiltrados2 = produtos.stream()
                    .filter(p -> p.getCategoria().equals("Eletrônicos"))
                    .sorted(Comparator.comparing(p -> p.getPreco()))
                    .limit(3)
                    .toList();

            //9 - Calcule a média de preço de todos os produtos da categoria "Eletrônicos".

            double produtosmedia = produtos.stream()
                    .filter(p -> p.getCategoria().equals("Eletrônicos"))
                    .mapToDouble(p -> p.getPreco())
                    .average()// o java não me deixa terminar aqui, então eu tenho duas opções: forçar que ele transforme esse average em .getAsDouble() (mas se estiver vazio ele vai quebrar) ou pedir pra ele abrir essa "gaveta" e me der 0.0 se estiver vazia.
                    .orElse(0.0);

            System.out.println(produtosmedia);

            //Exemplo em caso de solicitação de outras informações estatísitcas (ex: qual o produto mais barato, o mais caro e a soma total?)

            DoubleSummaryStatistics estatisticas = produtos.stream()
                    .filter(p -> p.getCategoria().equals("Eletrônicos"))
                    .mapToDouble(ProdutoStream::getPreco)
                    .summaryStatistics(); //

            System.out.println("Média: " + estatisticas.getAverage());
            System.out.println("Mínimo: " + estatisticas.getMin());
            System.out.println("Máximo: " + estatisticas.getMax());
            System.out.println("Soma: " + estatisticas.getSum());
            System.out.println("Qtd: " + estatisticas.getCount()); // quantos produtos tem

                }
        }


