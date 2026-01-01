package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PipelineService<T, R> {
    private List<T> itens;

    public PipelineService(List<T> itens) {
        this.itens = itens;
    }

    public void criadorDeObjeto(Supplier<T> supplier){
        T novoItem = supplier.get();
        itens.add(novoItem);
    }

    public List<T> getItens() {
        return itens;
    }

    public void filtrar(Predicate<T> predicate){
        for (T item : itens) {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        }
    }

    public  List<R> transformar(Function<T, R> function){
        List<R> resultado = new ArrayList<>();
        for (T item : itens) {
            resultado.add(function.apply(item));
        }

        return resultado;
    }

    public void consumidor(Consumer<T> consumer){
        for (T item : itens) {
            consumer.accept(item);
        }
    }



}
