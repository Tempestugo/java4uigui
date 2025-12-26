package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga (5L,"Attack On Titan",19.9));
        mangas.add(new Manga (6L, "Berserk",10 ));
        mangas.add(new Manga (8L, "Hellsing Ultimate", 20));
        mangas.add(new Manga (9L, "Pokemon",10));
        mangas.add(new Manga (1L, "Dragon Ball Z",10));

        for(Manga manga : mangas) {
            System.out.println(manga.toString());
        }
//        Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());
        for(Manga manga : mangas) {
            System.out.println(manga.toString());
        }
        Manga mangaToSearch = new Manga(5L, "Dragon Ball Z", 10);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch,  new MangaByIdComparator()));
    }
}
