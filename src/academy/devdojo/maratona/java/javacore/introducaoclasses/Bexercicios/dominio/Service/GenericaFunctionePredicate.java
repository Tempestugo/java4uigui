package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GenericaFunctionePredicate <T,R>{
    private List<T> itens;

    public GenericaFunctionePredicate(List<T> itens) {
        this.itens = itens;
    }

    public void filtrar(Predicate<T> predicate, Consumer<T> consumer) {
        for (T item : itens) {
            if (predicate.test(item)) {
                consumer.accept(item);
            }
        }
    }


    public <R> List<R> transformar(Function<T, R> function) {
        List<R> resultado = new ArrayList<>();
        for (T item : itens) {
            resultado.add(function.apply(item));
        }
        return resultado;
    }



}
