package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();

        ImpressoraEstudante01 impressora = new ImpressoraEstudante01();

        estudante.nome = "Francielle";
        estudante.sexo = 'F';
        estudante.idade = 20;


        estudante2.nome = "Hugo";
        estudante2.sexo = 'M';
        estudante2.idade = 30;



        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        System.out.println("============/ / ==============");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
        System.out.println("============/ / ==============");

        impressora.imprime(estudante);
        System.out.println("============/ / ==============");

        impressora.imprime(estudante2);

    }
}
