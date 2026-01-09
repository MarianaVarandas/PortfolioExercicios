package com.exercicios.avaliacao.classes;

public class Assinatura {
    private String nome;

    public Assinatura(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
