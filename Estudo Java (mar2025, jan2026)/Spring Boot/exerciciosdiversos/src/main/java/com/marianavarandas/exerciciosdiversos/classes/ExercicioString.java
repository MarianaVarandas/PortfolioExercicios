package com.marianavarandas.exerciciosdiversos.classes;

public class ExercicioString {

    public static String obterPrimeiroEUltimoNome(String nome) {
        String[] nomeLimpo = nome.trim().split("\\s+"); // aqui eu peço pra ele limpar todos os espaços que tem e aí com o split ele faz cada nome ser um item com índice. Esse regex "\\s+" quer dizer "remova todos os espaços mesmo que tenha vários seguidos
        if (nomeLimpo.length == 1) {//se só tiver um nome, retorna só esse mesmo
            return nomeLimpo[0];
        } else {
            return nomeLimpo[0] + " " + nomeLimpo[nomeLimpo.length - 1]; //aqui eu peço pra ele retornar o primeiro índice, colocar um espaço e depois o último da lista
            //obs para lembrar: o último ítem é lenght -1 porque índice começa em 0, mas a contagem em 1, então o índice do ultimo nome é a contagem de itens -1.

        }
    }
}

