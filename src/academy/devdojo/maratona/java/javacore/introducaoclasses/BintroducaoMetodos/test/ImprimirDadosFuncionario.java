package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Funcionario;

public class ImprimirDadosFuncionario {
    public static void  imprime(Funcionario funcionario){
        System.out.println("O nome dele é: "+ funcionario.nome);
        System.out.println("A idade dele é: "+ funcionario.idade);
        System.out.println("O salário dele é: "+ funcionario.salario);
    }
}
