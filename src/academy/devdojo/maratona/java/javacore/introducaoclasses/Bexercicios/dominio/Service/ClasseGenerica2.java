package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ClasseGenerica2 <T>{
    private Collection<T> dados;

    public ClasseGenerica2(Collection<T> dados) {
        this.dados = dados;
    }


    public List<T> filtrar(Predicate<T> predicate){
        List<T> resultado = new ArrayList<T>();
        for (T item : dados) {
            if (predicate.test(item)) {
                resultado.add(item);
            }

        }
        return resultado;
    }


    public List<T> ordenador(Comparator<T> comparator){
        List<T> resultado = new ArrayList<>(dados);
        resultado.sort(comparator);
        return resultado;
    }

    public List<T> metodoComposto (Predicate<T> predicate, Comparator<T> comparator){
        List<T> resultado = new ArrayList<T>();
        for (T item : dados) {
            if (predicate.test(item)) {
                resultado.add(item);
            }

        }
        resultado.sort(comparator);
        return resultado;
    }

}
