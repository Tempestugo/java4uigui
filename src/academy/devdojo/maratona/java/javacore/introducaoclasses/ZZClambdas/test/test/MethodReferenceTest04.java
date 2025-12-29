package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.dominio.Anime;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.serivce.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

// Reference to a static method
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeAcomparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeAcomparators2 = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeAcomparators.get();
        List<Anime> anime =new ArrayList<>( List.of(new Anime("Berserk", 43), new Anime("One Piece", 10), new Anime("Naruto", 3)));
        anime.sort(animeComparators::compareByepisodesNonstatic);
        BiFunction<String, Integer, Anime> animeBiFunction = (s,i) -> new Anime(s,i);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Berserk", 43));
    }

}
