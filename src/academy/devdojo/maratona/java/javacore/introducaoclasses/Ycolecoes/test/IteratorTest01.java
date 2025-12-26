package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        List<Manga> mangas2 = new LinkedList<>();

        mangas.add(new Manga (5L,"Attack On Titan",19.0,0));
        mangas.add(new Manga (6L, "Berserk",10 ,5));
        mangas.add(new Manga (8L, "Hellsing Ultimate", 20,0));
        mangas.add(new Manga (9L, "Pokemon",10,2 ));
        mangas.add(new Manga (1L, "Dragon Ball Z",10,0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            Manga next = mangaIterator.next();
            if(next.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
//        for (int i = 0; i < mangas.size(); i++) {
//            if (mangas.get(i).getQuantidade() == 0) {
//                mangas.remove(i);
//                i--; // gambiarra
//            }
//        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

    }
}
