package Collections.sort_LinkedList_Comparable_compareTo.classes;

public class Titulo {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int compareTo(Titulo outroTitulo) { // metodo da interface comparable para permitir a ordenação de listas de Titulos
        return this.getNome().compareTo(outroTitulo.getNome()); // ao inves de criar uma matematica pra comparação, eu delego. Como nome é String, ele vai comparar pelo comparable dessa classe
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
