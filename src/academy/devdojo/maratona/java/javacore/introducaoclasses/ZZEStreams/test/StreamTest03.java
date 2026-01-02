package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    static void main(String[] args) {
      lightNovels.stream().forEach(System.out::println);
      lightNovels.forEach(System.out::println);

      Stream<LightNovel> stream = lightNovels.stream();
      lightNovels.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4)
                .count();

        long count1 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4)
                .count();


        System.out.println(count);
        System.out.println(count1);
    }
        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Boku",8.99),
                new LightNovel("Overlord",3.99),
                new LightNovel("Violet Evergarden",5.99),
                new LightNovel("No Game No Life",2.99),
                new LightNovel("Fullmetal Alchemist",5.99),
                new LightNovel("Kumo Desuga",1.99),
                new LightNovel("Monogatari",4.00)

                ));
    }


