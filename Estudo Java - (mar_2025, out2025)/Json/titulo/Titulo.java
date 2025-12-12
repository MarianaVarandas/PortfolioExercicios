package Json.titulo;

public class Titulo {
    private String nome;
    private String anoDeLancamento;
    private String tipo;
    private String duracao;

    public Titulo(String nome, String anoDeLancamento, String tipo, String duracao) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDuracao() {
        return duracao;
    }
}
