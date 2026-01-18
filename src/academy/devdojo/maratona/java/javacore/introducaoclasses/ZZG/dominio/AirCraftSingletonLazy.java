package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonLazy {
    //Eager initialization
    private static AirCraftSingletonLazy INSTANCE = new AirCraftSingletonLazy("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    public static AirCraftSingletonLazy getInstance() {
    if(INSTANCE == null){
        synchronized (AirCraftSingletonLazy.class){
            if(INSTANCE == null){
                INSTANCE = new AirCraftSingletonLazy("787-900");

            }
        }
    }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}