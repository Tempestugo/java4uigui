package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    public static void  bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }

}
