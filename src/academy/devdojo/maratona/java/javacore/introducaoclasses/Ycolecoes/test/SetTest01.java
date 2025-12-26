package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new HashSet<>();
        Set<Manga> mangas2 = new LinkedHashSet<>();


        mangas.add(new Manga(5L,"Attack On Titan",19.0,0));
        mangas.add(new Manga (6L, "Berserk",10 ,5));
        mangas.add(new Manga (8L, "Hellsing Ultimate", 20,0));
        mangas.add(new Manga (9L, "Pokemon",10,2 ));
        mangas.add(new Manga (1L, "Dragon Ball Z",10,0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
