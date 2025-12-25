package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Salvarusuario;

public class UsuarioInvalidoException extends RuntimeException {
    public UsuarioInvalidoException(String mensage) {
        super(mensage);
    }
}
