package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.CadLeiProd;

public class ErroAoAcessarProdutoException extends Exception{
    public ErroAoAcessarProdutoException(String mensagem){
        super(mensagem);
    }
    public ErroAoAcessarProdutoException(String mensagem, Throwable causa){
        super(mensagem,causa);
    }
}
