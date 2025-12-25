package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.CadLeiProd;

import java.util.List;

public class leitor {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();

        try {
            List<String> produtos = service.listarProdutos();

            for (String produto : produtos) {
                System.out.println(produto);
            }

        } catch (ErroAoAcessarProdutoException e) {
            System.out.println("Não foi possível listar os produtos.");
            e.printStackTrace(); // log técnico
        }
    }


}
