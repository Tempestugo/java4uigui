package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(2);

        LocalDateTime timeMinus7hours  = LocalDateTime.now().minusHours(7);
        Duration duration = Duration.between(ldt1, nowAfterTwoYears);
        Duration duration2 = Duration.between(Instant.now(), Instant.now().plusSeconds(71000));
        System.out.println(duration);
        System.out.println(duration2);
        Duration duration1 = Duration.ofDays(20);
        Duration duration3 = Duration.ofHours(100);
        Duration duration4 = Duration.ofMinutes(100);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }
}
