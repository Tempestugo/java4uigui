package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Escola;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Professor 1");
        Professor professor2 = new Professor("Professor 2");

        Professor[] professores = {professor, professor2};

        Escola escola = new Escola("Konoha", professores);
        escola.imprime();
    }
}

