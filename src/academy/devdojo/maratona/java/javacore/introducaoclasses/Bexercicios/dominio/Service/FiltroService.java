package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FiltroService<T> {

    private List<T> itens;

    public FiltroService(List<T> itens) {
        this.itens = itens;
    }

    public List<T> filtrar(Predicate<T> predicate) {
        List<T> resultado = new ArrayList<>();

        for (T item : itens) {
            if (predicate.test(item)) {
                resultado.add(item);
            }
        }
        return resultado;
    }
}
