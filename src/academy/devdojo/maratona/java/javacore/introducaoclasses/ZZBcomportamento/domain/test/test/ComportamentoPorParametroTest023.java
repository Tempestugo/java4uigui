package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest023 {
    private static  List<Car> listaCar = List.of(new Car("green",2011),new Car("black",1988),new Car("red",2019));


    public static void main(String[] args) {
//        List<Car> greenCars2 = filter(listaCar, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });


        List<Car> greenCars = filter(listaCar, car-> car.getColor().equals("green"));
        List<Car> redCars = filter(listaCar, car-> car.getColor().equals("red"));
        List<Car> AgeCars = filter(listaCar, car-> car.getYear()<2015);

        System.out.println(greenCars);
        System.out.println(AgeCars);
        System.out.println(redCars);
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(filter(nums, num -> num %2 ==0));
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtered.add(e);
            }
        }
        return filtered;
    }





}
