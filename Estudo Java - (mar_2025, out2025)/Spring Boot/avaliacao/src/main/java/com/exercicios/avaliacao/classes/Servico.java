package com.exercicios.avaliacao.classes;

public class Servico {
    private String nome;

    public Servico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Servico{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
