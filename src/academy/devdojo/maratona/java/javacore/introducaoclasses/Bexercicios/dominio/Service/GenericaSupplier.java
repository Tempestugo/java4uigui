package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;

import java.util.List;
import java.util.function.Supplier;

public class GenericaSupplier<T> {
    private List<T> itens;

    public void adicionar(Supplier<T> supplier) {
        T novoItem = supplier.get();
        itens.add(novoItem);
    }

    public List<T> getItens() {

        return itens;
    }
}
