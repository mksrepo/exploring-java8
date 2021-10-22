package edu.mrinu.instant;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyDriver {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/2016";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate.toString());

        LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);

    }
}
