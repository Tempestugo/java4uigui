package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZClambdas.test.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest03 {
    static void main(String[] args) {
        List<String> natsu = List.of("Natsu", "Allucard");
        List<Integer> integers = map(natsu, (string) -> string.length());
        List<Integer> integers1 = map(natsu, String::length);
        List<String> estringo = map(natsu,String::toUpperCase);


        List<String> map = map(natsu, (string) -> string.toUpperCase());

        System.out.println(integers);
        System.out.println(map);


    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T t : list){
           R r = function.apply(t);
           result.add(r);
        }
        return result;
    }

}
