package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.RentableService;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Mangas;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Manga;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Carro;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.service.RentalService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class RentableTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("BMW"));
        carrosDisponiveis.add(new Carro("Audi"));

        RentableService<Carro> carroService = new RentableService<>(carrosDisponiveis);

        Carro carroAlugado = carroService.alugar();
        carroService.devolver(carroAlugado);

    }
}
