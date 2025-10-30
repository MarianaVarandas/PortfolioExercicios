package Polimorfismo.animal;

import Polimorfismo.animal.Cachorro;
import Polimorfismo.animal.Gato;

public class Teste {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.setNome("Chico");
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Banzé");

        gato1.emitirSom();
        cachorro1.emitirSom();
        gato1.arranharMoveis();
        cachorro1.abanarRabo();

    }
}