package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println((Calendar.getInstance()));
        LocalDate localDate = LocalDate.now();
        LocalDate date = LocalDate.of(1990, Month.JANUARY, 1);
        System.out.println(Month.JANUARY.getValue() == localDate.getMonthValue());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));

        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        LocalDate novo = agora.plusWeeks(1);
        //IMUTÁVEL é criado nnovo objeto
    }
}
