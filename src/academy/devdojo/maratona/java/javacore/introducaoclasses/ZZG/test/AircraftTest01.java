package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.Aircraft;

public class AircraftTest01 {
    static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft();
        System.out.println(aircraft.bookSeat(seat));
    }
}
