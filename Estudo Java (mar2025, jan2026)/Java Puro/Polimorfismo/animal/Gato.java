package Polimorfismo.animal;

public class Gato extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("O " + this.nome + " emitiu um som: Miau! Miau!.");
    }

    public void arranharMoveis(){
        System.out.println("O gato está arranhando os móveis");
    }
}
