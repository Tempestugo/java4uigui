package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.servico;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Computador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Produto;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de  Imposto do: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Imposto do Produto: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
//            ((Tomate) produto).getDataValidade();
//            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade do Tomate: " + tomate.getDataValidade());
            System.out.println(((Tomate) produto).getDataValidade());

        }

    }





//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório de Imposto do Computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Imposto do Computador: " + computador.getNome());
//        System.out.println("valor do Computador: " + computador.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//
//    }
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatório de Imposto do Computador");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Imposto do Computador: " + tomate.getNome());
//        System.out.println("valor do Computador: " + tomate.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//
//    }


}
