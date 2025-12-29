package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.serivce;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }


    public  int compareByepisodesNonstatic(Anime a1, Anime a2) {
        return Double.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
