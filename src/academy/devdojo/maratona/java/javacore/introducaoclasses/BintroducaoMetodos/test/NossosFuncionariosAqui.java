package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Funcionario;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.mediaSalarioFuncionarios;


public class NossosFuncionariosAqui {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        ImprimirDadosFuncionario imprimirDadosFuncionario = new ImprimirDadosFuncionario();

        funcionario.nome = "Joao";
        funcionario.idade = 30;
        funcionario.salario = 1200.00;

        funcionario2.idade = 20;
        funcionario2.nome = "Maria";
        funcionario2.salario = 400.00;

        funcionario3.nome = "Pedro";
        funcionario3.idade = 80;
        funcionario3.salario = 1800.00;

        System.out.println("---------------------------");

        ImprimirDadosFuncionario.imprime(funcionario);
        System.out.println("---------------------------");
        imprimirDadosFuncionario.imprime(funcionario2);
        System.out.println("---------------------------");

        imprimirDadosFuncionario.imprime(funcionario3);
        System.out.println("---------------------------");
        System.out.println("            -              ");
        System.out.println("---------------------------");

        double[] numeros = {funcionario.salario,funcionario2.salario,funcionario3.salario};


        mediaSalarioFuncionarios.somaVarArgs(numeros);





    }
}
