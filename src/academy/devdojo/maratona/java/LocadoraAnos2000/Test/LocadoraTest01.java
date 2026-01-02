package academy.devdojo.maratona.java.LocadoraAnos2000.Test;

import academy.devdojo.maratona.java.LocadoraAnos2000.Dominio.Filme;
import academy.devdojo.maratona.java.LocadoraAnos2000.Service.BancoDeDadosMemoria;
import academy.devdojo.maratona.java.LocadoraAnos2000.Service.Repositorio;

public class LocadoraTest01 {
    public static void main(String[] args) {
        // Criando o banco de dados para Filmes
        // Repositorio<Filme> (Interface) = new BancoDeDadosMemoria<> (Implementação)
        Repositorio<Filme> repoFilmes = new BancoDeDadosMemoria<>();


    }
}

