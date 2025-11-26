package ArrayLists_castings_instanceof.Classes;

public class Cachorro extends Animal{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public Cachorro(String especie, int idade, String raca) {
        super(especie, idade);
        this.raca = raca;
    }
}
