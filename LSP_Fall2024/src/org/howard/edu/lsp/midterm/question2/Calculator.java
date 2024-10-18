package org.howard.edu.lsp.midterm.question2;

public class Calculator {
	
	public static int sum(int a, int b) { // sum 2 ints
		return a + b;
	}
	
	public static double sum(double a, double b) { // sum two double values ints
		return a + b;
	}
	
	public static int sum(int[] numbers) { // sum all in an array of ints
		int total = 0;
		for (int number : numbers) {
			total += number;
				}
		return total;
				
	}

}

