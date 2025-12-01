package io.github.marianavarandas.minhasmusicas.principal;

import io.github.marianavarandas.minhasmusicas.modelos.MinhasPreferidas;
import io.github.marianavarandas.minhasmusicas.modelos.Musica;
import io.github.marianavarandas.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Wish you were here");
        musica1.setAlbum("Wish you were here");
        musica1.setArtista("Pink Floyd");
        musica1.setGenero("Rock progressivo");
        musica1.setDuracao(3);

        for(int i=0; i < 3000; i++){
            musica1.reproduzir();
        }

        for (int i=0; i < 1000; i++){
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Não inviabilize");
        podcast1.setApresentador("Déia Freitas");
        podcast1.setDuracao(50);

        for(int i=0; i < 800; i++){
            podcast1.reproduzir();
        }

        for (int i=0; i < 600; i++){
            podcast1.curtir();
        }

        MinhasPreferidas preferida1 = new MinhasPreferidas();
        preferida1.inclui(musica1);
        preferida1.inclui(podcast1);
    }
}
