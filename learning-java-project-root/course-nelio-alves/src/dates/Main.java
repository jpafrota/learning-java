package dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Note: All the date objects are immutable. Whenever you want to add / remove a given amount of time from them,
        // you are in fact creating another object.

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();

        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2022-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2024-03-23T12:00");

        Instant d6 = Instant.parse("2022-02-20T01:00:00-04:00");

        LocalDateTime instantToLocal = LocalDateTime.from(d6.atZone(ZoneId.systemDefault()));
        System.out.println(instantToLocal);

        LocalDate d7 = LocalDate.parse("20/04/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d8 = LocalDateTime.parse("20/04/2022 14:03", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d9 = LocalDate.of(1999, Month.JANUARY, 24);
        LocalTime d10 = LocalTime.of(12,12);
        LocalDateTime d11 = LocalDateTime.of(d9, d10);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println("d5 = " + d5);
        System.out.println("d6 = " + d6);
        System.out.println("d6 = " + d6.atZone(ZoneId.systemDefault()).minusWeeks(7));
        System.out.println("d7 = " + d7);
        System.out.println("d8 = " + d8);
        System.out.println("d9 = " + d9);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println("d11 formatted = " + d11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("d11 formatted = " + d11.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("d11 formatted = " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(d11));
        System.out.println("d6 formatted = " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(d6));

        System.out.println("past week = " + LocalDate.now().minusWeeks(1));
        System.out.println("past week = " + LocalDate.now().plusWeeks(1));

        System.out.println(System.currentTimeMillis());

    }
}
