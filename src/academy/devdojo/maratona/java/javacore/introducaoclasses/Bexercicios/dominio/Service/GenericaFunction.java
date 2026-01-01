package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class GenericaFunction<T, R> {

    private Collection<T> collection;

    public GenericaFunction(Collection<T> collection) {
        this.collection = collection;
    }

    public List<R> transformar(Function<T, R> function) {
        List<R> resultado = new ArrayList<>();

        for (T item : collection) {
            resultado.add(function.apply(item));
        }

        return resultado;
    }
}
