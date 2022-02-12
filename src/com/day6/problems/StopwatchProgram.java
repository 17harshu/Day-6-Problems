package com.day6.problems;

import java.util.Scanner;

public class StopwatchProgram {
	public static void elapsedTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 's' to start the stopwatch");
		char start = sc.next().charAt(0);

		System.out.println("Enter 'e' to end the stopwatch");
		char end = sc.next().charAt(0);

		double time = (double) (end - start) / 1000;
		System.out.println("Time Elapsed: " + time + " seconds");
	}

	public static void main(String[] args) {
		elapsedTime();
	}
}
