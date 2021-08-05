package edu.mrinu.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		// example 1
		// Optional<String> gender = Optional.of("MALE");
		//
		// System.out.println("gender => " + gender);
		// System.out.println("gender.get() => " + gender.get());
		//
		// System.out.println("Optional.empty() => " + Optional.empty());
		// System.out.println("gender.get() => " + Optional.ofNullable("YES"));
		// System.out.println("gender.get() => " + Optional.ofNullable(null));
		// // System.out.println("gender.get() => " + Optional.of(null));
		//
		// if (gender.isPresent())
		// System.out.println("gender.get() => " + gender.get());

		// example 2
		// Optional<String> nonEmptyGender = Optional.of("male");
		// Optional<String> emptyGender = Optional.empty();

		// System.out.println("nonEmptyGender.map(String::toUpperCase) => " +
		// nonEmptyGender.map(String::toUpperCase));
		// System.out.println("emptyGender.map(String::toUpperCase) => " +
		// emptyGender.map(String::toUpperCase));

		// Optional<Optional<String>> nonEmptyOptionalGender =
		// Optional.of(Optional.of("male"));
		// System.out.println("nonEmptyOptionalGender => " + nonEmptyOptionalGender);
		// System.out.println("nonEmptyOptionalGender.map(gender ->
		// gender.map(String::toUpperCase)) => " + nonEmptyOptionalGender.map(gender ->
		// gender.map(String::toUpperCase)));
		// System.out.println("nonEmptyOptionalGender.flatMap(gender ->
		// gender.map(String::toUpperCase)) => " + nonEmptyOptionalGender.flatMap(gender
		// -> gender.map(String::toUpperCase)));

		List<String> names = Arrays.asList("Virat", "Rohit", "Shikhar", "Dhoni", "Panth", "Pandiya");

		Optional<String> big_name = 
				names.stream()
					 .filter(name -> name.length() > 50)
					 .findFirst();

		big_name.ifPresent(System.out::println);
		big_name.ifPresent(name -> System.out.println(name));
		
		System.out.println(big_name.isPresent());
		
		System.out.println(big_name.orElse("No name"));
		
		//System.out.println(big_name.get());
		

	}

}
