package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest07 {

    static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        integers.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("===================");
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));
        System.out.println(integers.stream().reduce((x, y) -> x > y ? x : y));

//        System.out.println(integers.stream().reduce(0,integers::max));


    }
}
