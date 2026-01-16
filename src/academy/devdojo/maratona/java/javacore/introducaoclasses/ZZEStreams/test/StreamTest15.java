package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.Category;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.PROMOTION;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.PROMOTION.NORMAL_PRICE;
import static academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.PROMOTION.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);
        //Map<Category, List<Promotion>>
        Map<Category, List<PROMOTION>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toList())));
        System.out.println(collect1);
        Map<Category, Set<PROMOTION>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect2);

       Map<Category, LinkedHashSet<PROMOTION>> collect3 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
      System.out.println(collect3);



    }    private static PROMOTION getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.UNDER_PROMOTION;
    }

}
