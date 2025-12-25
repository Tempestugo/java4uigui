package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Jogador;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {

        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Hugão");
        Jogador[] jogadores = {jogador,jogador2};

        Time time = new Time("Seleção Brasileira",jogadores);



        jogador.setTime(time);


        jogador2.setTime(time);


        time.setJogadores(jogadores);

        System.out.println("--------------------------");

        jogador.imprime();

        System.out.println("--------------------------");

        time.imprime();

        System.out.println("------------- Time -------------");



    }
}
