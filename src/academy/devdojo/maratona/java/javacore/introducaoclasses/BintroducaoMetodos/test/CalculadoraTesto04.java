package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTesto04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 =1;
        int num2 = 2;
        calculadora.alteraDoisNUmeros(num1, num2);
        System.out.println("Dentro da CALCULADORATest04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
