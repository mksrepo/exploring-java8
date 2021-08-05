package edu.mrinu.basic;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterface {

    public static void main(String[] args) {
        // Use of Function
        Function<Integer, Integer> squareIt = integer -> integer*integer;
	    System.out.println("The square of 5 is " + squareIt.apply(5));

	    // Use of Predicate
        Predicate<Integer> eventTest = integer -> integer%2==0;
        System.out.println("Event test result of 6 is " + eventTest.test(6));

        // Use of Consumer
        Consumer<String> logger = log->System.out.println(log);
        logger.accept("Log me");

        // Use of Supplier
        Supplier<String> nameCache = ()->"My name is Khan";
        System.out.println(nameCache.get());
    }
}
