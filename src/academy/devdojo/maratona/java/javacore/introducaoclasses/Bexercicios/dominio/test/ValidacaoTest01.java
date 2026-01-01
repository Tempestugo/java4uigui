package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service.GenericaFunctionePredicate;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ValidacaoTest01 {
    static void main(String[] args) {
        List<Produto> produtos2 = new ArrayList();
        produtos2.add(new Produto("b", 20.0,2));
        produtos2.add(new Produto("s",210,2));
        produtos2.add(new Produto("s",210,2));

        GenericaFunctionePredicate<Produto, String> function = new GenericaFunctionePredicate<>(produtos2);
        function.filtrar(produto -> produto.getPreco() < 210, System.out::println);

        List<Double> transformar = function.transformar(Produto::getPreco);
        System.out.println(transformar);


        function.transformar(Produto -> Produto.getNome());

    }
}
