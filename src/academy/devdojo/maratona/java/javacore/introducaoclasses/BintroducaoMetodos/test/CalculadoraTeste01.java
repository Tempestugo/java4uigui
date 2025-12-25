package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora");

        calculadora.multiplaDoisNumeros(10,20); // 2 argumentos
        // mas quando define, 2 parâmetros

    }
}
