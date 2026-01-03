package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.Category;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Boku", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)

    ));

    static void main(String[] args) {
        Map<Category, List<LightNovel>> map = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        List<LightNovel> lightNovels1 = new ArrayList<>();
        for (LightNovel ln : lightNovels) {
            switch (ln.getCategory()) {
                case FANTASY:
                    fantasy.add(ln);
                    break;
                case DRAMA:
                    drama.add(ln);
                    break;
                case ROMANCE:
                    romance.add(ln);
                    break;
            }
        }
        map.put(Category.DRAMA,drama);
        map.put(Category.FANTASY,fantasy);
        map.put(Category.ROMANCE,romance);
        System.out.println(map);


        System.out.println(lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory)));

    }
}
