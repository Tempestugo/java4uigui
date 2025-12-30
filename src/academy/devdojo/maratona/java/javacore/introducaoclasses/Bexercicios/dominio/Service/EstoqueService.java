package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.List;

public class EstoqueService<T extends Identificavel>  {
    private List<T> itens;




    public EstoqueService(List<T> itens) {
        this.itens = itens;

    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("Estoque vazio");
            return;
        }
        for (T item : itens) {
            System.out.println(item);
        }
    }

    public T buscarPorId(Long id) {
        for (T item : itens) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        throw new RuntimeException("Item não encontrado");
    }


}
