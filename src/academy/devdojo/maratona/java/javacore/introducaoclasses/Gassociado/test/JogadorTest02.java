package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Jogador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jogador 1");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
