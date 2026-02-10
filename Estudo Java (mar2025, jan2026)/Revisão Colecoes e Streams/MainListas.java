import java.util.*;
import java.util.stream.Collectors;

public class MainListas {
    public static void main(String[] args) {
        //exercício 1
        List<String> listaStrings = new ArrayList<>();

        listaStrings.add("João");
        listaStrings.add("Maria");
        listaStrings.add("Victor");
        listaStrings.add("Ana");

        System.out.println("Lista de funcionários: " + listaStrings);

        // exercício 2

        List<String> nomesAlunos = new ArrayList<>();

        Collections.addAll(nomesAlunos, "Joana", "Lucas", "Pedro","Antonio"); // testando outros jeitos de adicionar
        System.out.println(" Lista inicial: " + nomesAlunos);
        nomesAlunos.remove(2);
        System.out.println(" Lista após a exclusão: " + nomesAlunos);

        //exercício 3 - usarei a lista do exercício dois para essa consulta

        System.out.println("A segunda pessoa da lista é: " + nomesAlunos.get(1));
        System.out.println("Total de funcionários: " + nomesAlunos.size());

        //exercício 4

        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        List<String> eventosSemDuplicacao = eventos.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista de eventos: " + eventosSemDuplicacao);

        // exercício 5

        Map<Integer,String> listaDeClientes = new HashMap<>();

        listaDeClientes.put(1, "Maria José");
        listaDeClientes.put(2, "José Maria");
        listaDeClientes.put(3, "Enzo Valentino");

        System.out.println("O nome do cliente com ID 2 é: " + listaDeClientes.get(2));

        //exercício 6

        Map<Integer,String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        var validacao = clientes.containsKey(6);

        if (validacao == true){
            System.out.println("O nome do cliente cujo ID é 6 é: " + clientes.get(6));
        }else{
            System.out.println("Este cliente não existe");
        }

        // exercício 7

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        var listaFiltrada = funcionarios.stream()
                .filter(f -> f.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(listaFiltrada);

        //exercício 8

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        var listaAoQuadrado = numeros.stream()
                .map(f -> f*f)
                .collect(Collectors.toList());

        System.out.println(listaAoQuadrado);

        //exercício 9

        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        var somaPrecos = precosProdutos.stream()
                .reduce(0.0, Double::sum);

        System.out.println("Valor total antes do imposto: " + somaPrecos);

        double precosComImposto = somaPrecos + (somaPrecos*8/100);

        System.out.println("Valor total com imposto de 8%: " + precosComImposto);

        //exercício 10

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        var somaNotas = notas.stream()
                .reduce(0.0, Double:: sum);

        var media = somaNotas/ notas.size();

        var min = notas.stream()
                .min(Comparator.naturalOrder())
                .orElse(0.0); // pra evitar que na saída ele coloque o optional

        var max = notas.stream()
                .max(Comparator.naturalOrder())
                .orElse(0.0);

        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota foi: " + min);
        System.out.println("A maior nota foi: " + max);













    }
}
