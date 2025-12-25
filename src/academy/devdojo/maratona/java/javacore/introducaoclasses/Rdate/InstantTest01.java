package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());//999.999.999
        System.out.println();
    }
}
// ZULU TIME, tempo padrão, instant trabalha com nano segundos
//