package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
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

        estudante.imprime();
        estudante2.imprime();


    }





}
