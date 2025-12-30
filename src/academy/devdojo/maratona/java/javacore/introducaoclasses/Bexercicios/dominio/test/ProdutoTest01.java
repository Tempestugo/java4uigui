package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ProdutoTest01 {
    static void main(String[] args) {
        HashSet<Produto> hashSet = new HashSet<>();
        List <Produto> produtos = new ArrayList();
        produtos.add(new Produto("Macarrõa",20,12345L));
        produtos.add(new Produto("Batata",210,12345L));
        hashSet.add(produtos.get(0));
        hashSet.add(produtos.get(1));

        for (Produto produto : hashSet) {
            System.out.println(produto.getNome());
        }

        System.out.println(produtos);
        System.out.println(hashSet);

        System.out.println(produtos.contains(new Produto("batata", 20, 12345L)));

    }
}
