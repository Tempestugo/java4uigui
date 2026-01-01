package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Consumidor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio.Produto;

import java.util.*;

public class ProdutoTest02 {
    static void main(String[] args) {
        List <Produto> produtos = new ArrayList();
        produtos.add(new Produto("Macarrõa",20,12345));
        produtos.add(new Produto("Batata",210,12345));

        List <Produto> produtos2 = new ArrayList();
        produtos2.add(new Produto("b", 20.0,2));
        produtos2.add(new Produto("s",210,2));
        produtos2.add(new Produto("s",210,2));



        Map<Consumidor, List<Produto>>  consumidores = new HashMap();
        consumidores.put(new Consumidor("Pedro"),produtos);
        consumidores.put(new Consumidor("Maria"),produtos2);

        for(Map.Entry<Consumidor, List<Produto>> entry : consumidores.entrySet()){
            System.out.println(entry.getKey().getNome());
                    for(Produto produto : entry.getValue()){
                        System.out.println(produto.getNome());
                    }
        }
    }
}
