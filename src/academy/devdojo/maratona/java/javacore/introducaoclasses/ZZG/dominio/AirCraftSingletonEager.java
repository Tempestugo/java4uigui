package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonEager {
    //Eager initialization
    private static final AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AirCraftSingletonEager(String name) {
        this.name = name;
    }

    public static AirCraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}