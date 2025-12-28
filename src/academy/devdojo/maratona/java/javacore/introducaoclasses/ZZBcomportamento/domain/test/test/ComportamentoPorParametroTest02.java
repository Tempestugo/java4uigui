package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.Car;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
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

    }
    public static  List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filtered = new ArrayList<>();
        for (Car car : cars){
            if(carPredicate.test(car)){
                filtered.add(car);
            }
        }

        return filtered;

    }


}
