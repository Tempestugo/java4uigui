package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.Service;
import java.util.Collection;
import java.util.function.Consumer;
public class ClasseGenericaConsumer <T>{



        private Collection<T> dados;

        public ClasseGenericaConsumer(Collection<T> dados) {
            this.dados = dados;
        }

        public void executar(Consumer<T> consumer) {
            for (T item : dados) {
                consumer.accept(item);
            }
        }


}
