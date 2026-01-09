//Crie uma classe Animal com um metodo emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o metodo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.""

package Polimorfismo.animal;

public class Animal {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("O animal emitiu um som.");
    }
}
