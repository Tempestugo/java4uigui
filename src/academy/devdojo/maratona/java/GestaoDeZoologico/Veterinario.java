package academy.devdojo.maratona.java.GestaoDeZoologico;

import java.util.Map;

public class Veterinario<T> {


    public static <T extends Animal> void examinarJaula(Jaula<T> tJaula) {
        System.out.println();
        for(Map.Entry<String, T> entry : tJaula.animalMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
