package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
