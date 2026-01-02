package academy.devdojo.maratona.java.GestaoDeZoologico;
import java.util.*;

public class Jaula<T extends Animal> { // T é o tipo específico (Leao, Macaco, etc)
    // O Map guarda T, não Animal genérico
    public Map<String, T> animalMap = new HashMap<>();

    // CORREÇÃO 1: O método recebe T, garantindo que só entra o animal correto
    public void colocar(String nome, T animal) {
        // CORREÇÃO 2: Verificação de nulo segura
        if (nome != null && animal != null) {
            animalMap.put(nome, animal);
            // Não precisa de cast (T), pois o parâmetro já é T
        }
    }

    public void retornar() {
        // Iteração correta usando entrySet
        for (Map.Entry<String, T> entry : animalMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}