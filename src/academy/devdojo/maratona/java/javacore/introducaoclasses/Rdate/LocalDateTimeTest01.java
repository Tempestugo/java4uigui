package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime);
        LocalDate date = LocalDate.of(1970, 1, 1);
        LocalDate teste = LocalDate.parse("2022-08-06");

        LocalTime time = LocalTime.of(1,1,1,1);
        LocalTime teste2 = LocalTime.parse("09:45:00");
        System.out.println(date);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);

    }
}
