package com.exercicios.avaliacao.classes;

public class Avaliacao <T>{
    private T item; // pode ser assinatura, produto ou serviço
    private double nota;
    private String comentario;


    public Avaliacao(T item, double nota, String comentario) {
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getItem() {
        return item;
    }

    public double getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
