package edu.j8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadTestDrive {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		IntStream.range(0, 10)
				.forEach(index -> executorService.submit(() -> System.out.println("Running task " + index)));
		System.out.println("Task started...");

		executorService.shutdown();

	}
}
