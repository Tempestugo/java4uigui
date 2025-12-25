package academy.devdojo.maratona.java.javacore.introducaoclasses.Lclassesabstratas.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Lclassesabstratas.dominio.dominio.Desenvolvedor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Lclassesabstratas.dominio.dominio.Funcionario;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Lclassesabstratas.dominio.dominio.Gerente;

public class FuncionarioTesto01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("nami",5000);

        Desenvolvedor desenvolvedor = new Desenvolvedor("maria",5100);
        System.out.println(desenvolvedor);

        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
