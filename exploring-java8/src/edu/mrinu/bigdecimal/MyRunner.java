package edu.mrinu.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Student<T> {
    T[] rolls;
}

public class MyRunner {
    public static void main(String[] args) {
        System.out.println("Empty value => " + new BigDecimal(""));
        List<ElectricityReading> readings = generate(20);
        readings.stream()
                .forEach(reading -> {
                    //System.out.println(reading.getTime() + " " + reading.getReading());
                });
    }
    public static List<ElectricityReading> generate(int number) {

        List<ElectricityReading> readings = new ArrayList<>();
        Instant now = Instant.now();
        Random readingRandomiser = new Random();

        for (int i = 0; i < number; i++) {
            double positiveRandomValue = Math.abs(readingRandomiser.nextGaussian());
            //System.out.println(positiveRandomValue);
            BigDecimal randomReading = BigDecimal.valueOf(positiveRandomValue).setScale(4, RoundingMode.CEILING);
            //System.out.println(randomReading);
            ElectricityReading electricityReading = new ElectricityReading(now.minusSeconds(i * 60), randomReading);
            System.out.println(now);
            System.out.println(now.minusSeconds(i * 60) + "-");
            readings.add(electricityReading);
        }

        readings.sort(Comparator.comparing(ElectricityReading::getTime));
        return readings;
    }
}
