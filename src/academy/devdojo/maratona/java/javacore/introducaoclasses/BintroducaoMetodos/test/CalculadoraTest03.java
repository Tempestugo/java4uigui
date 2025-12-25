package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,10);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20,10));
    }
}
