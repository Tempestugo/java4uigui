package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Catalogo<T> {
    private Collection<T> collection;

    public Catalogo(Collection<T> collection) {
        this.collection = collection;
    }

    public List<T> filtrar(Predicate<T> predicate){
        List<T> resultado = new ArrayList<>();
        for (T item : collection) {
            if (predicate.test(item)) {
                resultado.add(item);
            }
        }
        return resultado;
    }

    public List<T> ordenar(Comparator<T> comparator){
        List<T> resultado = new ArrayList<>(collection);
        resultado.sort(comparator);
        return resultado;
    }


}
