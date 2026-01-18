package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.AirCraftSingletonEager;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.Aircraft;

public class AircraftTest01 {
    static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");

    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEager.getInstance());
        Aircraft aircraft = new Aircraft("787-900");

        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getInstance();

        System.out.println(aircraft.bookSeat(seat));
    }
}
