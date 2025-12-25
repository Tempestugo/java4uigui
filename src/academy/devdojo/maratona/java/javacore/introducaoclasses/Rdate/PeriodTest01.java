package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ldt1 = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(2);

        Period period = Period.between(ldt1, nowAfterTwoYears).plusDays(7);
        Period p3 = Period.ofWeeks(3);
        Period p4 = Period.ofMonths(4);
        Period p5 = Period.ofYears(5);

        System.out.println(period);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(1)));
        System.out.println(ldt1.until(ldt1.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}

