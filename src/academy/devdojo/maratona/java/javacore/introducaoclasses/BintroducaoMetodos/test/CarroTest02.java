package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.name = "Fusca bala";
        carro.modelo = "Sport";
        carro.ano = 2000;

        carro1.name = "Fusca";
        carro1.modelo = "Barco";
        carro1.ano = 2020;

        System.out.println(carro.name + " "+ carro1.name);
    }

}
