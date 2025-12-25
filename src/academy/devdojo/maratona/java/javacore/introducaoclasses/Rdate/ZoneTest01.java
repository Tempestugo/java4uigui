package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("America/Sao_Paulo"));

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tokyo);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyo);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offset);
        System.out.println(offsetDateTime);


        OffsetDateTime offsetDateTime1 = now.atOffset(offset);
        System.out.println(offsetDateTime1);
        // com Instant também funciona


        JapaneseDate from = JapaneseDate.from(LocalDate.from(now));
        System.out.println(from);

        LocalDate ab = LocalDate.of(1900,2,1);
        JapaneseDate meiji = JapaneseDate.from(ab);
        System.out.println(meiji);

    }
}
//- ZoneDatedTime - Classe para manipular fusos horários com as classes de tempo que estudamos, como Instant e LocalDate;
//- ZoneId - Classe que nos retorna lista de Map dos Zone IDs e suas siglas;
//- ZoneOffset - Guardar o deslocamento UTC (UTC offset);
//- OffSetDateTime - Classe que utilizamos o UTC offset para nos retornar o horário equivalente no fuso horário de referência;
//- JapaneseDate - Converter calendário gregoriano para japonês;
