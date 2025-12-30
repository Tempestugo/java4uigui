package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Mangas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparadorDeMangas implements Comparator<Mangas> {
    @Override
    public int compare(Mangas o1, Mangas o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}


public class MangaTest01 {
    static void main(String[] args) {
        List<Mangas> mangas = new ArrayList<>();
        mangas.add(new Mangas("Abalha",1L,200));
        mangas.add(new Mangas("s",2L,300));
        mangas.add(new Mangas("Aa",3L,400));
        mangas.add(new Mangas("sd",4L,500));

        Collections.sort(mangas);
        for(Mangas manga : mangas){
            System.out.println(manga.getNome()+" "+manga.getPreco());
        }
        System.out.println("======================");
        Collections.sort(mangas, new ComparadorDeMangas());
        for(Mangas manga : mangas){
            System.out.println(manga.getNome()+" "+manga.getPreco());
        }
    }
}
