package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.List;

import java.util.List;

public class RentableService<T> {
    private List<T> objetosDisponiveis;

    public RentableService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T alugar() {
        if (objetosDisponiveis.isEmpty()) {
            throw new RuntimeException("Nenhum objeto disponível para alugar");
        }
        T objeto = objetosDisponiveis.remove(0);
        System.out.println("Alugando: " + objeto);
        return objeto;
    }

    public void devolver(T objeto) {
        System.out.println("Devolvendo: " + objeto);
        objetosDisponiveis.add(objeto);
    }
}

