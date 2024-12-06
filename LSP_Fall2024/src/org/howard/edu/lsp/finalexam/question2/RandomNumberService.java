package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
	private static RandomNumberService instance = null; // Make the Service an instance
	private RandomNumberStrategy strategy;
	
	private RandomNumberService() {}
	
	public static RandomNumberService getInstance() { // No empty instances
		if (instance == null) {
			instance = new RandomNumberService();
		}
		return instance;
	}
	
	public void setStrategy(RandomNumberStrategy strategy) {  // instantiate strategy
		this.strategy = strategy;
	}
	
	public int getRandomNumber() { // instantiate random getter
		return strategy.generate();
	}

}
