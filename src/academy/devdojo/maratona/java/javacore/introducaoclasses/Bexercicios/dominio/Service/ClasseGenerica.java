package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.List;
import java.util.function.Predicate;

public class ClasseGenerica<T> {
    private List<T> itens;


    public ClasseGenerica(List<T> itens) {
        this.itens = itens;
    }



    public void filtrar(Predicate<T> predicate){
        for (T item : itens) {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        }

    }
}
