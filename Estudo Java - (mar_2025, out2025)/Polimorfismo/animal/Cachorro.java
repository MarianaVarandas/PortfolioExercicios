package Polimorfismo.animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("O " + this.nome + " emitiu um som: Au! Au!.");
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo");
    }
}
