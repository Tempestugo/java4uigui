package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.dominio.Anime;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.serivce.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators anime = new AnimeComparators();
        List<Anime> animeList =new ArrayList<>( List.of(new Anime("Berserk", 43), new Anime("One Piece", 10), new Anime("Naruto", 3)));
        animeList.sort(anime::compareByepisodesNonstatic);
        animeList.sort((a1,a2) -> Double.compare(a1.getEpisodes(), a2.getEpisodes()));

        System.out.println(animeList);

    }
}
