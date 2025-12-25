package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Calculadora;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Computador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Produto;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Tomate;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen",4000);

        Tomate tomate = new Tomate("Tomate",10);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
