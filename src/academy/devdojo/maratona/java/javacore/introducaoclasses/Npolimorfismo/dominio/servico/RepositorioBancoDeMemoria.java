package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.servico;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoDeMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}
