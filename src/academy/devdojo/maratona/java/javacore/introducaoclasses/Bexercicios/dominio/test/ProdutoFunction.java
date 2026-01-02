package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.GenericaFunction;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ProdutoFunction {
    static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500,1l));
        produtos.add(new Produto("Mouse", 80,2l));
        produtos.add(new Produto("Monitor", 1200,3l));


        GenericaFunction<Produto, String> repo = new GenericaFunction<>(produtos);

        List<String> nomes = repo.transformar(produto ->  produto.getNome());

        List<Produto> facos = new ArrayList<>();

        GenericaFunction<Produto, Collection<Produto>> repolho = new GenericaFunction<>(produtos);




        nomes.forEach(System.out::println);
    }
}
