package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST,6,6,1,1);
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, ld));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, ld));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, ld));
        System.out.println(ChronoUnit.YEARS.between(aniversario, ld));

    }
}
