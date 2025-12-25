package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobrescritaComExcpetionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException  e) {
            e.printStackTrace();
        }

    }
}
