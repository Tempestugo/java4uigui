package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.CadLeiProd;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();


        try{
            produtoService.cadastrarProduto("Açúcar",90,39);
            produtoService.cadastrarProduto("Macarrão",10,50);
            System.out.println("Produto Cadastrado com sucesso");



            System.out.println("Produto Listado com sucesso");
        }catch(ProdutoInvalidoException ex){
            System.out.println("Erro de produto: "+ ex.getMessage());


        }catch(ErroAoAcessarProdutoException e){
            System.out.println("Erro de ambiente: "+ e.getMessage());
        }
    }


}
