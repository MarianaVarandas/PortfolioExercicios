//Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("O título do livro é: " + this.titulo);// lembrete: caso eu quisesse deixar o código mais "automatizado" para o caso de mudanças de regras de negócio, poderia usar o this+getter e aí eu alteraria a regra direto no getter, sem ter que mudar em dois lugares
        System.out.println("O autor do livro é: " + this.autor);
    }
}