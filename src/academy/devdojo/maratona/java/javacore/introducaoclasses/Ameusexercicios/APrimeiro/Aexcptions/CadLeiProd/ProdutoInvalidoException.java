package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.CadLeiProd;

public class ProdutoInvalidoException extends RuntimeException {
    public ProdutoInvalidoException(String mensage){
        super(mensage);
    }
}
