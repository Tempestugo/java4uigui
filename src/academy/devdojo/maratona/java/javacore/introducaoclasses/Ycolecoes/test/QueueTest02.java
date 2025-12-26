package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaComparator().reversed());

        mangas.add(new Manga(5L, "Attack On Titan", 19.9));
        mangas.add(new Manga(6L, "Berserk", 10));
        mangas.add(new Manga(8L, "Hellsing Ultimate", 20));
        mangas.add(new Manga(9L, "Pokemon", 10));
        mangas.add(new Manga(1L, "Dragon Ball Z", 10));

        while(!mangas.isEmpty()){

            System.out.println(mangas.poll());

        }
        System.out.println(mangas);
    }
}

