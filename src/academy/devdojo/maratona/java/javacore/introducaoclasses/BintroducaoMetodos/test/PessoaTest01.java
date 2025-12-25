package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Frango");
        System.out.println("-----------");
        pessoa.setIdade(18) ;
        System.out.println("-----------");

        pessoa.imprime();
        System.out.println("-----------");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
