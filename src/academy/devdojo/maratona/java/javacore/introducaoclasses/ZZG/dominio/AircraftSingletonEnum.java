package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
   private final Set<String> availabeSeats;

    AircraftSingletonEnum(){
        this.availabeSeats = new HashSet<>();
        this.availabeSeats.add("1A");
        this.availabeSeats.add("1B");
    }
    public boolean bookSeat(String seat) {
        return availabeSeats.remove(seat);
    }

}
