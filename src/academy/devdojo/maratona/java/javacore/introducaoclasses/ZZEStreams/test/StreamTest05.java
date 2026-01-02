package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Boku",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No Game No Life",2.99),
            new LightNovel("Fullmetal Alchemist",5.99),
            new LightNovel("Kumo Desuga",1.99),
            new LightNovel("Monogatari",4.00)

    ));
    static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln ->ln.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(ln ->ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln ->ln.getPrice() > 0));
        lightNovels.stream().filter(ln -> ln.getPrice() > 3)
                .findAny().ifPresent(System.out::println);
        lightNovels.stream().filter(ln -> ln.getPrice() > 3)
                .findFirst().ifPresent(System.out::println);

        lightNovels.stream().filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst().ifPresent(System.out::println);

        lightNovels.stream().filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);






    }
}
