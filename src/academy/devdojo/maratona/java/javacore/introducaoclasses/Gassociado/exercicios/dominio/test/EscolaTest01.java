package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio.Estudante;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio.Local;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio.Professor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio.Seminario;

public class EscolaTest01 {
    public static void main(String[] args) {
        Local local = new Local("Bela Vista");

        Estudante estudante = new Estudante("Hugo",20);
        Estudante estudante2 = new Estudante("João",30);
        Estudante estudante3 = new Estudante("Ricardo",50);
        Estudante[] estudantes = {estudante,estudante2,estudante3};

        Seminario sem = new Seminario("Segunda Guerra Mundial",estudantes,local);
        for(Estudante estudanteItem : estudantes){
            estudanteItem.setSeminario(sem); // Associa 'sem' a todos os estudantes
        }

        Seminario sem2 = new Seminario("Primeiro Reinado",estudantes,local);

        Seminario[] seminarios = {sem,sem2};



        Seminario[] seminariosProfJose = {sem};
        Professor prof = new Professor("Professor José","Matemático",seminariosProfJose);

        Seminario[] seminariosProfJoao = {sem, sem2};
        Professor prof2 = new Professor("Professor João","Cientista",seminariosProfJoao);

        Seminario[] seminariosProfEmmanuel = {sem2};
        Professor prof3 = new Professor("Professor Emmanuel","Doutor",seminariosProfEmmanuel);
        Professor[] professores = {prof,prof2,prof3};







        System.out.println("----------------");
        estudante.imprimir();
        estudante2.imprimir();
        estudante3.imprimir();
        System.out.println("----------------");
        prof.imprimir();
        prof2.imprimir();
        prof3.imprimir();
        System.out.println("----------------");
        sem.imprimir();
    }
}
