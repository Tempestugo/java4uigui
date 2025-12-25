package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Computador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Produto;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Tomate;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.servico.CalculadoraImposto;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto computador = new Computador("Ryzen",4000);
        System.out.println("Nome: " + computador.getNome());
        System.out.println("valor: " + computador.getValor());
        System.out.println("Imposto do computador: " + computador.calcularImposto());
        CalculadoraImposto.calcularImposto(computador);



        System.out.println("+++++++++++++++++++++");
        Produto Tomate = new Tomate("Tomate",10);
        System.out.println("Nome: " + Tomate.getNome());
        System.out.println("valor: " + Tomate.getValor());
        System.out.println("Imposto do Tomate: " + Tomate.calcularImposto());

        CalculadoraImposto.calcularImposto(Tomate);
    }
}
