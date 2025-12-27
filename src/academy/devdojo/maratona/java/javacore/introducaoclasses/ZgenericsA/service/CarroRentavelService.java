package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.service;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<Carro>(List.of(new Carro("BMW"),
            new Carro("Mercedes")));
    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.printf("Carro disponivel: %s\n", carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);

    }
}
