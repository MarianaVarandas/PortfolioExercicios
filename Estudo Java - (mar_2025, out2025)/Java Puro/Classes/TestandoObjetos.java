// esse arquivo não pretende ser funcional. É apenas para testar as classes criadas e criar objetos*/

package classes.estudo;

public class TestandoObjetos {
    public static void main(String[] args) {
        //classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Antonio";
        pessoa1.idade = 32;
        pessoa1.genero = "Masculino";

        pessoa1.exibeOlaMundo();

        //classe Calculadora
        Calculadora calculadora1 = new Calculadora();
        System.out.println("O dobro é: " + calculadora1.dobraNumero(5));

        //classe Musica
        Musica musica1 = new Musica();
        musica1.titulo = "Wish you were here";
        musica1.artista= "Pink Floyd";
        musica1.anoLancamento = 1975;

        musica1.exibeFichaTecnica();

        System.out.println("AVALIAÇÕES:");
        musica1.avaliaMusica();
        musica1.avaliaMusica();
        musica1.avaliaMusica();

        System.out.println("O número de avaliações recebidas foi: " + musica1.numAvaliacoes);
        System.out.println("A média de avaliações dessa música é: " + musica1.calculaMedia());

        // classe Carro

        Carro carro1 = new Carro();
        carro1.modelo = "Gol";
        carro1.anoLancamento = 1998;
        carro1.cor = "Amarelo";

        carro1.exibeFichaTecnica();
        System.out.println("A idade do carro é: " + carro1.calculaIdadeCarro() + " anos");

        //classe Alune

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Andressa";
        aluno1.idade = 12;

        aluno1.exibeInfo();













    }
}