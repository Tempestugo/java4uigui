package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.repositorio.Repositorio;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
       Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");

    }
}
