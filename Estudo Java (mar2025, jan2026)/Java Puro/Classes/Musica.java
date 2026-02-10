/*Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/
package classes.estudo;
import java.util.Scanner;

public class Musica {
    Scanner input = new Scanner(System.in);
    String titulo;
    String artista;
    int anoLancamento;
    int somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da Música: " + titulo);
        System.out.println("Nome do Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliaMusica() {
        System.out.println("Digite a sua avaliação para essa música: ");
        int novaAvaliacao = input.nextInt(); // pegando o input do usuario
        somaDasAvaliacoes+= novaAvaliacao; // incrementando soma das avaliações
        numAvaliacoes++; // incrementando numero de avaliações

    }

    int calculaMedia() {
       return somaDasAvaliacoes/numAvaliacoes;
    }
}




