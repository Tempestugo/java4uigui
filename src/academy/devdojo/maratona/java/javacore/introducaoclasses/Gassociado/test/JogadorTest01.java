package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Jogador");
        Jogador jogador2 = new Jogador("Car");
        Jogador jogador3 = new Jogador("Pepe");
        Jogador[] jogadores = new Jogador[]{jogador3,jogador,jogador2};
        // Array de objetos. Duas referências. Posição do Array e também do objeto
        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
            
        }

    }
}
