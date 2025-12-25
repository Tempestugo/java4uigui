package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getId().compareTo(m2.getId());
    }
}

public class MangaTest01 {
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
        System.out.println("=====================");
        Collections.sort(mangas);
        for(Manga manga : mangas) {
            System.out.println(manga.toString());
        }

                System.out.println("=====================");
        Collections.sort(mangas, new  MangaByIdComparator());
        //ou
        mangas.sort(new MangaByIdComparator());
        for(Manga manga : mangas) {
            System.out.println(manga.toString());
        }


    }
}
