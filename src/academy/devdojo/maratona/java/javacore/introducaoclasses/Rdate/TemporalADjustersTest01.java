package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;

public class TemporalADjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        now = now.withDayOfYear(20);
        now = now.withYear(2020);
        now = now.with(ChronoField.DAY_OF_MONTH,20);
        now = now.plusDays(1);
        System.out.println(now);

        now = LocalDate.now().with(DayOfWeek.THURSDAY);
        System.out.println(now);




    }
}
