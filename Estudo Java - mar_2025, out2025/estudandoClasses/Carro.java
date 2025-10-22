/*Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.*/

package estudandoClasses;

public class Carro {
    String modelo;
    int anoLancamento;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + anoLancamento);
        System.out.println("Cor do carro: " + cor);
    }

    int calculaIdadeCarro(){
        int anoAtual = 2025;
        int idadeCarro = anoAtual-anoLancamento;
        return idadeCarro;
    }

}
