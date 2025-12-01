package io.github.marianavarandas.minhasmusicas.modelos;

public class MinhasPreferidas { //classe de serviço
    public void inclui(Audio audio){
        int classificacaoDoAudio = audio.getClassificacao();

        if(classificacaoDoAudio == 10){
            System.out.println(audio.getTitulo() + " é sucesso absoluto e preferido por todos!");
        } else if (classificacaoDoAudio >= 8){
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo.");
        } else {
            System.out.println(audio.getTitulo() + " é uma ótima opção para ouvir mais tarde.");
        }
    }
}
