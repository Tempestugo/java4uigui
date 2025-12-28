package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static  List<Car> listaCar = List.of(new Car("green",2011),new Car("black",1988),new Car("red",2019));


    public static void main(String[] args) {
        System.out.println(filterGreenCar(listaCar));
        System.out.println(filterByColor(listaCar,"green"));
        System.out.println(filterAge(listaCar,2015));
    }


    public static  List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }

        return greenCars;

    }
    public static  List<Car> filterByColor(List<Car> cars,String color){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }

        return greenCars;

    }
    public static  List<Car> filterAge(List<Car> cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getYear()< year){
                oldCars.add(car);
            }
        }

        return oldCars;

    }

}
