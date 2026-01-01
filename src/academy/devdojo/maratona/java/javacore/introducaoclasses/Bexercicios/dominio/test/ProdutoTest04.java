package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.ClasseGenerica;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.ClasseGenerica2;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.*;
import java.util.function.Predicate;

public class ProdutoTest04 {
    static void main(String[] args) {
        List<Produto> produtos2 = new ArrayList();
        produtos2.add(new Produto("b", 20.0,2));
        produtos2.add(new Produto("s",210,2));
        produtos2.add(new Produto("s",210,2));

        Set<Produto> produtoSet = new HashSet<Produto>();
        produtoSet.add(produtos2.get(0));
        produtoSet.add(produtos2.get(1));
        produtoSet.add(produtos2.get(2));

        for (Produto produto : produtoSet) {
            System.out.println(produto.getNome());
        }

        System.out.println(produtos2);
        System.out.println(produtoSet);

        ClasseGenerica2<Produto> genericoNormal = new ClasseGenerica2<Produto>(produtoSet);
        genericoNormal.filtrar(Predicate -> Predicate.getPreco() > 100);




        ClasseGenerica2<Produto> generico = new ClasseGenerica2<Produto>(produtoSet);
        List<Produto> filtrarLambdaPreco = generico.filtrar(Predicate -> Predicate.getPreco() > 200);

        List<Produto> filtrarClasseAnonima = generico.filtrar(new Predicate<Produto>() {
            @Override
            public boolean test(Produto produto) {
                return produto.getPreco() > 200;
            }

        });

        generico.metodoComposto(new Predicate<Produto>(){
            @Override
            public boolean test(Produto produto) {
                return produto.getPreco() > 200;
            }
        }, new Comparator<Produto>() {
            @Override
            public int compare(Produto o1, Produto o2) {
                return 0;
            }
        });



    }


}
