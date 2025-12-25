package academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio.Endereco;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio.Funcionario;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345");
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("----------------------");
        Funcionario funcionario = new Funcionario("Funcionario 1","20000");

        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000f);

        funcionario.imprime();

    }
}
