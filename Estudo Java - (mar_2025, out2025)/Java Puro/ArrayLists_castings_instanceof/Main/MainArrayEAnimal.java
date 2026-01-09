package ArrayLists_castings_instanceof.Main;

import ArrayLists_castings_instanceof.Classes.Animal;
import ArrayLists_castings_instanceof.Classes.Cachorro;

import java.util.ArrayList;

public class MainArrayEAnimal {
    public static void main(String[] args) {
    ArrayList<String> listaDeStrings = new ArrayList<>();
    listaDeStrings.add("Laranja");
    listaDeStrings.add("Grey's Anatomy");
    listaDeStrings.add("Carro");

    for (String item: listaDeStrings){
        System.out.println(item);
    }

    Cachorro cachorro1 =  new Cachorro("mamifero",7,"Lulu da Pomerânia");

    if (cachorro1 instanceof Animal meuAnimal1){ // casting
        System.out.println("A espécie de cachorro1 é: " + meuAnimal1.getEspecie());

    }










}
}
