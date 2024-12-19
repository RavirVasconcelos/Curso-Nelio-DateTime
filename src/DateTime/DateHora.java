package DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        System.out.println("Local Date");
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);
        System.out.println();

        System.out.println("Local Date Time");
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);
        System.out.println();

        System.out.println("Instant");
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);
        System.out.println();

        System.out.println("Duration");
        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        //Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println(t1.toDays() + " Dias");
        System.out.println(t2.toDays() + " Dias");
        System.out.println(t3.toDays() + " Dias");
        System.out.println(t4.toDays() + " Dias");

        //test;
        System.out.println();
        System.out.println("Teste");
        LocalDate today = LocalDate.now();
        LocalDate semanaPassada = today.minusDays(7);
        LocalDate semanaQueVem = today.plusDays(7);
        LocalDate anoPassado = today.minusYears(1);
        LocalDate decadaPassada = today.minusYears(10);
        LocalDate anoQueVem = today.plusYears(1);
        LocalDate decadaQueVem = today.plusYears(10);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Hoje: " + today.format(fmt1));
        System.out.println("Semana Passada: " + semanaPassada.format(fmt1));
        System.out.println("Semana que vem: " + semanaQueVem.format(fmt1));
        System.out.println("Ano que vem: " + anoQueVem.format(fmt1));
        System.out.println("Decada que vem: " + decadaQueVem.format(fmt1));
        System.out.println("Ano Passado: " + anoPassado.format(fmt1));
        System.out.println("Decada Passada: " + decadaPassada.format(fmt1));

        /* Saída
        Local Date
        2022-07-13
        2022-07-27

        Local Date Time
        2022-07-13T01:30:26
        2022-07-27T01:30:26

        Instant
        2022-07-13T01:30:26Z
        2022-07-27T01:30:26Z

        Duration
        7 Dias
        7 Dias
        7 Dias
        -7 Dias

        Teste
        Hoje: 18/12/2024
        Semana Passada: 11/12/2024
        Semana que vem: 25/12/2024
        Ano que vem: 18/12/2025
        Decada que vem: 18/12/2034
        Ano Passado: 18/12/2023
        Decada Passada: 18/12/2014
                 */
    }
}
