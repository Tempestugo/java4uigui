package academy.devdojo.maratona.java.LocadoraAnos2000.Service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// <T extends ItemAlugavel> garante que o T tenha o método getId()
public class BancoDeDadosMemoria<T extends ItemAlugavel> implements Repositorio<T> {

    // A lista que simula o banco de dados
    private Set<T> dados = new HashSet<>();


    public void salvar(T t) {
        this.dados.add(t);
        System.out.println("Salvando no banco de memória: " + t.getTitulo());
    }

    public T buscarPorId(Long id) {
        for (T item : dados) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public Set<T> listarTodos() {
        return this.dados;
    }
}