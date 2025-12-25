package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.minhasexecoes;

public class ErroAoLerConfiguracaoException extends Exception {
    public ErroAoLerConfiguracaoException(String mensagem) {
        super(mensagem);
    }
    public ErroAoLerConfiguracaoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}
