package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Computador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Televisao;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Tomate;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Pomodoro",10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tomate);
        Televisao televisao = new Televisao("Samsumg 50\" ",2000);
        CalculadoraImposto.calcularImposto(televisao);


    }
}
