package org.howard.edu.lsp.finalexam.question2;
// gpt generated algorithm
public class CustomRandomNumber implements RandomNumberStrategy { // construct the class implementing the strategy
	private int seed = 12345;
	
	// generate the num
	public int generate() {
		seed = (seed * 1103515245 + 12345) & Integer.MAX_VALUE; /// generate range of values
		return (seed % 1000) + 1; //return random number between the values
	}

}
