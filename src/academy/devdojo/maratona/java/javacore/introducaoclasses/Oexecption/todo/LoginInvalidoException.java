package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
