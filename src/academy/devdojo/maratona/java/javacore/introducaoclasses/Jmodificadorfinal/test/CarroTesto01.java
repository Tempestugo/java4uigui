package academy.devdojo.maratona.java.javacore.introducaoclasses.Jmodificadorfinal.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Jmodificadorfinal.dominio.Ferrari;

public class CarroTesto01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("HUGAO");
        System.out.println(carro.COMPRADOR.getNome());

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("HUGAO");
        ferrari.imprime();

    }
}
