package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Salvarusuario;

public class ErroAoSalvarUsuarioException extends Exception {
    public ErroAoSalvarUsuarioException(String mensagem) {
        super(mensagem);
    }
    public ErroAoSalvarUsuarioException(String mensage, Throwable causa) {
        super(causa);
    }
}
