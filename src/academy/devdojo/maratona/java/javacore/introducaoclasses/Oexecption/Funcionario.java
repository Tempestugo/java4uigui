package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;


// Quando sobreescreve, não é possível throws uma exceção mais genérica dos que as que estão na classe pai
// Sem checked se não foi delcarada no metodo original
public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException{

    }
}

