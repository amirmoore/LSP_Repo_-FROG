package org.howard.edu.lsp.finalexam.question2;
import java.util.Random;

public class RandomNumber implements RandomNumberStrategy {  // Basic Random import 
	public int generate() {
		return new Random().nextInt(1000) + 1;
	}

}
