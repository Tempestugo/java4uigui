package academy.devdojo.maratona.java.LocadoraAnos2000.Service;

import java.util.ArrayList;
import java.util.List;

// <T extends ItemAlugavel> garante que o T tenha o método getId()
public class RepositorioService<T extends ItemAlugavel> {

    // AQUI é onde você "salva". É o seu banco de dados em memória.
    // Precisa inicializar com new ArrayList<>()
    private List<T> lista = new ArrayList<>();

    // O método salvar apenas adiciona na lista interna
    public void salvar(T t) {
        this.lista.add(t);
        System.out.println("Item salvo: " + t.getTitulo());
    }

    // Busca na lista interna varrendo um por um
    public T buscarPorId(Long id) {
        for (T item : this.lista) {
            if (item.getId().equals(id)) { // Usa equals para Long
                return item;
            }
        }
        return null; // Retorna nulo se não achar
    }

    // Não recebe nada, apenas DEVOLVE a lista que está guardada na classe
    public List<T> listarTodos() {
        return this.lista;
    }
}