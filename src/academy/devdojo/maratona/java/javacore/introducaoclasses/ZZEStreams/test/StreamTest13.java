package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.Category;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.PROMOTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<PROMOTION, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln ->

                ln.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.UNDER_PROMOTION));
        System.out.println(collect);
        //Map<Category>, Map<Promotion>, List<LightNovel>>>

        Map<Category, Map<PROMOTION, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln ->

                ln.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.UNDER_PROMOTION)));

        System.out.println(collect1);
    }
}
