package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sétimo.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sétimo.dominio.Loja;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sétimo.dominio.Produto;

public class TestLoja01 {
    public static void main(String[] args) {
        Produto produto = new Produto("Macarrão",40);

        Loja loja = new Loja(new Produto[]{produto});


        produto.imprimir();
        produto.alterarPreco(produto.getPreco());

        loja.meusProdutos();
        loja.aplicarProdutos();

    }
}
