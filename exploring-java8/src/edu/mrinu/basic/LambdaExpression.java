package edu.mrinu.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Calculator {
    public void calculate(Integer no1, Integer no2);
}

public class LambdaExpression {

    public static void main(String[] args) {
        // User define Functional Interface
        Calculator add = (no1, no2) -> System.out.println(no1+no2);
        add.calculate(2,3);

        // In build Functional Interface
//        Runnable test = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("test")
//            }
//        };
        Runnable printer = () -> System.out.println("test");
        new Thread(printer).start();

        // Another example of in build Functional Interface
        List<Integer> numbers = Arrays.asList(100, 1, 2, 3, 4, 5);
        Comparator<Integer> comparator = (no1, no2) -> no1<no2?-1:no1>no2?+1:0;
        Collections.sort(numbers, comparator);
        System.out.println(numbers);
    }
}
