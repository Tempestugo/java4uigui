package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest01 {
    static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getNome));
        System.out.println(lightNovels);
        List<String> lista3primeiros = new ArrayList<>();

        for(LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <= 4){
                lista3primeiros.add(lightNovel.getNome());
                if(lista3primeiros.size()==3){
                    break;
                }

            }
        }
        System.out.println(lista3primeiros);



    }
        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Boku",8.99),
                new LightNovel("Overlord",3.99),
                new LightNovel("Violet Evergarden",5.99),
                new LightNovel("Noi Game No Life",2.99),
                new LightNovel("Fullmetal Alchemist",5.99),
                new LightNovel("Kumo Desuga",1.99),
                new LightNovel("Monogatari",4.00)

                ));
    }


