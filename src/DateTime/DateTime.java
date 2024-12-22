package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //usando Instant.now;
        Instant d07 = Instant.now();

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        //Converter o now para global e local
        LocalDateTime r5 = LocalDateTime.ofInstant(d07, ZoneId.systemDefault());
        LocalDateTime r6 = LocalDateTime.ofInstant(d07, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);


        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia = " + d04.getMonthValue());
        System.out.println("d04 dia = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());

        /* Saída
        r1 = 2022-07-19
        r2 = 2022-07-20
        r3 = 2022-07-19T22:30:26
        r4 = 2022-07-20T02:30:26
        r5 = 2024-12-22T17:18:19.324460400
        r6 = 2024-12-22T20:18:19.324460400
        d04 dia = 20
        d04 dia = 7
        d04 dia = 2022
        d05 hora = 1
        d05 minuto = 30
         */
    }
}
