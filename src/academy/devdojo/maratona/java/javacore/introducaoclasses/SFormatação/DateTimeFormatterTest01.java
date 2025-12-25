package academy.devdojo.maratona.java.javacore.introducaoclasses.SFormatação;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date =  LocalDate.now();;
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse = LocalDate.parse("20211019", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse1 = LocalDate.parse("2025-12-22+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-12-22", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-12-22T18:46:04.1121294", DateTimeFormatter.ISO_DATE_TIME);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s5 = LocalDate.now().format(formatter);
        System.out.println(s5);
        LocalDate localBR = LocalDate.parse("19/02/2025", formatter);
        System.out.println(localBR);


        DateTimeFormatter dateTimeFormatterGR = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(dateTimeFormatterGR);
        System.out.println(formatGR);




    }
}
