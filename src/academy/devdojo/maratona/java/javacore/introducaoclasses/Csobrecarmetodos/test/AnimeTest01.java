package academy.devdojo.maratona.java.javacore.introducaoclasses.Csobrecarmetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Csobrecarmetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("hugo", 12,"TV", "Ação");

        anime.init2("hugo",12,"TV","Batata");


        anime.init("hugo",12,"TV","ação");



        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.setNome("Akudama Drive");
        anime.setGenero("Shounen");

        anime.imprime();

    }
}
