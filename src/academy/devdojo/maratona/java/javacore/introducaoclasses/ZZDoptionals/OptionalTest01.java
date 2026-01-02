package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZDoptionals;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main(String[] args) {
        Optional<String> o1 = Optional.of("Ah uh u o");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();



        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("-----------");
        Optional<? extends Optional<?>> name = Optional.ofNullable(findName("william"));
        System.out.println(name);
        o1.ifPresent(s -> System.out.println(s.toUpperCase()));





    }

    private static Optional<? extends Object> findName(String name){
        List<String> lista = List.of("William", "DevDojo");
        int i = lista.indexOf(name);
        if(i != 1){
            return  Optional.of(lista.get(i));
        }
            return Optional.empty();
        }

    }


