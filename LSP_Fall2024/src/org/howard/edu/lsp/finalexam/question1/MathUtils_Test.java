package org.howard.edu.lsp.finalexam.question1;

import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class MathUtils_Test {
	
	// Test Factorial Method
	@Test
	public void testFactorialPositiveNum() {
		MathUtils utils = new MathUtils();
		assertEquals(1, utils.factorial(3));
		
	}
	
	@Test
	public void testFactorialNegativeNum() {
		MathUtils utils = new MathUtils();
		assertThrows(IllegalArgumentException.class, () -> {
			utils.factorial(-1);
		});
		
	}
	
	@Test
	public void testFactorialZero() {
		MathUtils utils = new MathUtils();
		assertEquals(1, utils.factorial(0));
	}
	
	// Test isPrime Method
	@Test
	public void testIsPrime_Prime() {
		MathUtils utils = new MathUtils();
		assertTrue(utils.isPrime(53));
	}
	
	@Test
	public void testIsPrime_NonPrime() {
		MathUtils utils = new MathUtils();
		assertFalse(utils.isPrime(81));
		
	}
	
	@Test
	public void testIsPrime_Special() {
		MathUtils utils = new MathUtils();
		assertFalse(utils.isPrime(1));
	}

	// Test GCD Method
	@Test
	public void testGCD_oneZero() {
		MathUtils utils = new MathUtils();
		assertEquals(10, utils.gcd(0,10));
	}
	
	@Test
	public void testGCD_twoZero() {
		MathUtils utils = new MathUtils();
		assertThrows(IllegalArgumentException.class, () -> {
			utils.gcd(0,0);
		});
	}
	
	@Test
	public void testGCD_noZero() {
		MathUtils utils = new MathUtils();
		assertEquals(3, utils.gcd(3,12));
	}
	
}
