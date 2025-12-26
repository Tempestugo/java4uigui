package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;

public class MapTest02 {
    static void main(String[] args) {
        Consumidor consumidor = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        System.out.println(consumidor);

        Manga attackOnTitan = new Manga(5L, "Attack On Titan", 19.9);
        Manga berserk = new Manga(6L, "Berserk", 10);
        Manga hellsingUltimate = new Manga(8L, "Hellsing Ultimate", 20);
        Manga pokemon = new Manga(9L, "Pokemon", 10);
        Manga dragonBallZ = new Manga(1L, "Dragon Ball Z", 10);
    }
}
