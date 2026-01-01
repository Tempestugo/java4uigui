package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.PipelineService;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.ArrayList;
import java.util.List;

public class TodosTest01 {
    static void main(String[] args) {
        List<Produto> produtos2 = new ArrayList();
        produtos2.add(new Produto("b", 20.0,2));
        produtos2.add(new Produto("s",210,2));
        produtos2.add(new Produto("s",210,2));

        PipelineService<Produto, String> pipe = new PipelineService<>(produtos2);
        pipe.filtrar(produto -> produto.getPreco() < 210);
        pipe.consumidor(System.out::println);
        System.out.println("======================");

        pipe.criadorDeObjeto(Produto::new);

        System.out.println("======================");

        List<String> transformar = pipe.transformar(Produto::getNome);
        System.out.println(transformar);

    }
}
