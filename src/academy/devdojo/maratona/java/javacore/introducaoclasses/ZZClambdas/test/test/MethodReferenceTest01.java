package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.dominio.Anime;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.serivce.AnimeComparators;

import java.util.*;

public class MethodReferenceTest01 {
    static void main(String[] args) {

        List<Anime> anime =new ArrayList<>( List.of(new Anime("Berserk", 43), new Anime("One Piece", 10), new Anime("Naruto", 3)));
//        Collections.sort(anime, (a1,a2) -> a1.getTitle().compareToIgnoreCase(a2.getTitle()));
        Collections.sort(anime, AnimeComparators::compareByTitle);
        System.out.println(anime);

    }
}
