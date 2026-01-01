package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.ClasseGenerica;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProdutoTest03 {
    static void main(String[] args) {

        List<Produto> produtos2 = new ArrayList();
        produtos2.add(new Produto("b", 20.0,2));
        produtos2.add(new Produto("s",210,2));
        produtos2.add(new Produto("s",210,2));

        Predicate<Produto> predicates = new Predicate<Produto>(){
            @Override
            public boolean test(Produto produto) {
                return produto.getEstoque()>10;
            }
        };

        ClasseGenerica<Produto> repo = new ClasseGenerica<>(produtos2);
        repo.filtrar(produto -> produto.getEstoque() > 10);

        repo.filtrar(ProdutoPredicates.estoqueMaiorQue(10));
        repo.filtrar(ProdutoPredicates.nomeComecaCom("A"));



    }





    public static class CarroAnoPredicate implements Predicate<Produto> {
        @Override
        public boolean test(Produto produto) {
            return produto.getEstoque()>10;
        }
    }
    public class ProdutoPredicates {
        public static Predicate<Produto> estoqueMaiorQue(int valor) {
            return produto -> produto.getEstoque() > valor;
        }

        public static Predicate<Produto> nomeComecaCom(String letra) {
            return produto -> produto.getNome().startsWith(letra);
        }
    }



}
