package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Carro;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
