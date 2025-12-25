package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.dominio;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "1234";
        System.out.println("Usuário");
        String usernameDigitado = teclado.next();
        System.out.println("Senha");
        String senhaDigitado = teclado.next();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");

        }

        System.out.println("Login realizado com sucesso");
    }
}
