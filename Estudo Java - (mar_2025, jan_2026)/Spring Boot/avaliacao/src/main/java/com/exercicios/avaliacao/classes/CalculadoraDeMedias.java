package com.exercicios.avaliacao.classes;

import java.util.List;

public class CalculadoraDeMedias {
    public <T> double CalculaMedias(List<Avaliacao<T>> lista){
        if (lista.isEmpty()) { //evitando a fadiga caso a lista esteja vazia
            return 0;
        }

        double soma = 0;
        for (Avaliacao<T> a : lista) {
            soma += a.getNota();
        }

        return soma / lista.size();

    }

}
