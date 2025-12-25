package academy.devdojo.maratona.java.javacore.introducaoclasses.Eblocosinicializacao.domain.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Eblocosinicializacao.domain.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Shounen");
        System.out.print(anime.getEpisodios());
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

    }
}
