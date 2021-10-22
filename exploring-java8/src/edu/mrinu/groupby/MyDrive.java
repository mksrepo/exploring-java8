package edu.mrinu.groupby;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyDrive {
    public static void main(String[] args) {
        List<ElectricityReading> readings = Arrays.asList(new ElectricityReading(Instant.now(), new BigDecimal("0.01234")),
                new ElectricityReading(Instant.now(), new BigDecimal("0.01234")));

        Map<DayOfWeek, List<ElectricityReading>> readingsByDay = readings.stream()
                .collect(Collectors.groupingBy(r -> extractDayOfWeek(r.getTime())));

        readingsByDay.entrySet().stream().
                forEach(key -> {
                    System.out.println(key);
                    System.out.println(readingsByDay.get(key));
                });
    }

    private static DayOfWeek extractDayOfWeek(Instant time) {
        return LocalDateTime.ofInstant(time, ZoneOffset.UTC).getDayOfWeek();
    }
}
