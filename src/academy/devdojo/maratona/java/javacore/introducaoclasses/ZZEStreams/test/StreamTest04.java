package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigner = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> devlopers = List.of("William", "Davi", "Harrison");
        List<String> students = List.of("Édipo", "Gustavo", "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigner);
        devdojo.add(devlopers);
        devdojo.add(students);
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        for (int i = 0; i < devdojo.size(); i++) {
            List<String> people = devdojo.get(i);
            for (int j = 0; j < people.size(); j++) {
                System.out.println(people.get(j));
            }
        }

        System.out.println("========");
        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}
