package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Barco;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
