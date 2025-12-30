package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Locale.filter;




public class CarroTest01 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Carro("Borguini", 10, 2));
        carros.add(new Carro("Benzini", 10, 2));
        carros.add(new Carro("Ant", 120, 200));
        List<Carro> listaCar = filter(carros, carro -> carro.getAno() > 50);


        carros.removeIf(filteredCarro -> filteredCarro.getNome().equals("Benzini"));


        // 2️⃣ Usando removeIf (altera a lista original)
        carros.removeIf(carro -> carro.getNome().equals("Benzini"));
        System.out.println(carros);

    }
    public static List<Carro> filter(List<Carro> carros, Predicate<Carro> predicate) {
        List<Carro> resultado = new ArrayList<>();
        if (carros != null) {
            for (Carro carro : carros) {
                if (predicate.test(carro)) {
                    resultado.add(carro);
                }
            }
        }
        return resultado;
    }
}



