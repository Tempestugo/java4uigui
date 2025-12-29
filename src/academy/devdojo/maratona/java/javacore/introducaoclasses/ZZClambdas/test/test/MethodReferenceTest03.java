package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.dominio.Anime;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.serivce.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

// Reference to a static method
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> rimuru = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        rimuru.sort(String::compareTo);
        System.out.println(rimuru);
        Function<String , Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.and(List::contains).or(List::contains));
    }
}
