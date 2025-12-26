package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        System.out.println(consumidor);

        Manga attackOnTitan = new Manga(5L, "Attack On Titan", 19.9);
        Manga berserk = new Manga(6L, "Berserk", 10);
        Manga hellsingUltimate = new Manga(8L, "Hellsing Ultimate", 20);
        Manga pokemon = new Manga(9L, "Pokemon", 10);
        Manga dragonBallZ = new Manga(1L, "Dragon Ball Z", 10);

        List<Manga> mangaConsumidorList = List.of(attackOnTitan,berserk,hellsingUltimate,pokemon);
        List<Manga>  mangaConsumidorList2 = List.of(dragonBallZ);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor, mangaConsumidorList);
        consumidorManga.put(consumidor2, mangaConsumidorList2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println("===========\n"+entry.getKey().getNome() );
            for(Manga manga : entry.getValue()){
                System.out.println(manga.getNome() );
            }
        }
    }
}
