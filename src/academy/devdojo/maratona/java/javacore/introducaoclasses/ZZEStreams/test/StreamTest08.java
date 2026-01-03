package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(ln ->ln > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
        //Strea<Double>

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum();


    }

}
