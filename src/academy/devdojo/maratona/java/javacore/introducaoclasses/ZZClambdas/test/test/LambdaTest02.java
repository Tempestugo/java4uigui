package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest02 {
    static void main(String[] args) {
        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of(1,2,3,4,5,6);

        forEach(strings,(string) -> System.out.println(string));
        forEach(integers,(integer) -> System.out.println(integer));

    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);

        }
    }
}
