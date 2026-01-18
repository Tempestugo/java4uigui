package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("2A");
    }
    public boolean bookSeat(String seat){
        return  availableSeats.remove(seat);
    }
}
