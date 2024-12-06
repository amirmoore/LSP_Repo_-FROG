package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
	public static void main(String[] args) { // instantiate main 
		RandomNumberService service = RandomNumberService.getInstance();
		
		service.setStrategy(new RandomNumber()); // Basic Random
		System.out.println("Java Random: " + service.getRandomNumber());
		
		service.setStrategy(new CustomRandomNumber()); // Custom Random
		System.out.println("Custom Random: " + service.getRandomNumber());
	}

}
