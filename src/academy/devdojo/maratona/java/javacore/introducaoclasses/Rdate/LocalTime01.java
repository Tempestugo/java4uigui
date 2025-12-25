package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTime01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(2,1,2);
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.MIN);
        System.out.println(localTime.MAX);
        System.out.println(localTime.MIN.plusHours(1));
        System.out.println(localTime.MIN.plusMinutes(1));

    }
}
