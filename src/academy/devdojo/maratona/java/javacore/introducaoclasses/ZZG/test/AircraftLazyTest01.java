package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.AirCraftSingletonEager;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.AirCraftSingletonLazy;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.Aircraft;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftLazyTest01 {
    static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AirCraftSingletonLazy.getInstance());
        System.out.println(AirCraftSingletonLazy.getInstance());
        Constructor<AirCraftSingletonLazy> constructor = AirCraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AirCraftSingletonLazy airCraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(airCraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonLazy.getInstance());
        Aircraft aircraft = new Aircraft("787-900");


        System.out.println(aircraft.bookSeat(seat));
    }
}
