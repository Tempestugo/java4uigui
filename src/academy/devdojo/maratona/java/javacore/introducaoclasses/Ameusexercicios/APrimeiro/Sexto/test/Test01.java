package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.dominio.Funcionario;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.dominio.Gerente;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.dominio.ReajusteService;

public class Test01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(5000,"pedrao");

        ReajusteService service = new ReajusteService();
        service.reajustarSalarioPrimitivo(gerente.getSalario());
        service.reajustarSalarioObjeto(gerente);
        gerente.imprimir();


    }
}
