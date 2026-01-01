package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.ClasseGenericaConsumer;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.GenericaSupplier;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProdutoTestConsumer {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500,1));
        produtos.add(new Produto("Mouse", 80,2));
        produtos.add(new Produto("Monitor", 1200,3));

        ClasseGenericaConsumer<Produto> generica = new ClasseGenericaConsumer<>(produtos);

        generica.executar(new Consumer<Produto>() {
            @Override
            public void accept(Produto produto) {
                System.out.println(produto.getNome());
            }
        });
        generica.executar(Produto -> System.out.println(Produto.getNome()));


        generica.executar(Produto::imprimir);
        generica.executar(Produto::caro);


        GenericaSupplier<Produto> genericaSupplier = new GenericaSupplier<>();
        genericaSupplier.adicionar(Produto::new);
        genericaSupplier.getItens().forEach(System.out::println);




    }


}