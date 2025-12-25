package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.dominio.Pedido;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.dominio.Produto;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.dominio.ProdutoImportado;

public class PedidoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("PS",2000,"Eletrônico");
        Produto produto2 = new Produto("Computador",3000,"Eletrônico");
        Produto p = new ProdutoImportado("Pacote de Macarrão",200,"Alimentos");


        Produto[] produtos = new Produto[]{produto,produto2,p};
        Pedido pedido = new Pedido(produtos);
        System.out.println("============================");

        pedido.listarProdutos();

//        p.aplicarDesconto(0.2);
        System.out.println("============================");
        pedido.aplicarDescontoPedido(0.05);
        pedido.listarProdutos();
        System.out.println("============================");


        pedido.calcularTotal();
        pedido.listarProdutos();
        System.out.println("============================");



    }
}
