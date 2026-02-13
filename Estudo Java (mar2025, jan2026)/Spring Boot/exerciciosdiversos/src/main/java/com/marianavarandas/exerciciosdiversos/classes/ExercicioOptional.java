package com.marianavarandas.exerciciosdiversos.classes;

public class ExercicioOptional {


    public static java.util.Optional<Integer> processaNumero(java.util.Optional<Integer> numero) {
        if (numero.isPresent() && numero.get() > 0) {
            var resultado = numero.get() * numero.get();
            return java.util.Optional.of(resultado);
        } else {
            return java.util.Optional.empty();
        }
    }
}
