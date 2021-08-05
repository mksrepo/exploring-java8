package edu.mrinu.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoopTestDrive {

	public static void main(String[] args) {
		Stream.iterate(1, i -> i + 1).limit(100).peek(System.out::println).collect(Collectors.toList());
		System.out.println("End");
	}
}
