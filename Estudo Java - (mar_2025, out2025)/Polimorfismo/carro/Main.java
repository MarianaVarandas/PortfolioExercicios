package Polimorfismo.carro;
import Polimorfismo.carro.ModeloCarro;

public class Main{
    public static void main(String[] args) {
        ModeloCarro modelo1 = new ModeloCarro();
        modelo1.setNome("Civic");
        modelo1.setPrecoAno2005(25000);
        modelo1.setPrecoAno2006(30000);
        modelo1.setPrecoAno2007(15000);

        modelo1.maiorPreco();
        modelo1.menorPreco();


    }
}