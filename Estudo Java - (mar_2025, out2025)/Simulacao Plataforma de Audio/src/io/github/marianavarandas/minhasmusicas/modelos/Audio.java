package io.github.marianavarandas.minhasmusicas.modelos;

public class Audio {
        private String titulo;
        private int duracao;
        private int totalDeReproducoes;
        private int totalCurtidas;


    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return 0;
    }

}


