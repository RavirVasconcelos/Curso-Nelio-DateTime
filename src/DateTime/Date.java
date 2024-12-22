package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt3));

        System.out.println("d06 = " + fmt4.format(d06));

        System.out.println("d05 = " + d05.format(fmt5));
        System.out.println("d06 = " + fmt6.format(d06));

        System.out.println("d06 = " + d06.toString());


        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        /* Saída
        d04 = 20/07/2022
        d04 = 20/07/2022
        d04 = 20/07/2022
        d05 = 20/07/2022
        d05 = 20/07/2022 01:30
        d05 = 20/07/2022 01:30:26
        d06 = 19/07/2022 22:30
        d05 = 2022-07-20T01:30:26
        d06 = 2022-07-20T01:30:26Z
        d06 = 2022-07-20T01:30:26Z
         */
    }
}
