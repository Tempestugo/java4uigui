package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    static void main(String[] args) {
        List<String> stream = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getNome))
                .filter(p -> p.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getNome)
                .collect(Collectors.toList());
        System.out.println(stream);
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


