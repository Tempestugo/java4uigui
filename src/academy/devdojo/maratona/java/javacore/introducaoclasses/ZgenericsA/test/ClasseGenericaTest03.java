package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Barco;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Carro;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<Carro>(List.of(new Carro("BMW"),
                new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<Barco>(List.of(new Barco("Lancha"),
                new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        RentalService<Barco>  rentalService2 = new RentalService<>(barcosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();

        rentalService.retornarObjetoAlugado(carro);

        Barco barco = rentalService2.buscarObjetoDisponivel();
        System.out.println("Usando");
        rentalService2.retornarObjetoAlugado(barco);
    }
}
