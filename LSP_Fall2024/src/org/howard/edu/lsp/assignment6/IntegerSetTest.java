/**
 * 
 */
package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*; // For JUnit 5 assertions

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; // For JUnit 5 test annotation
import java.util.ArrayList;

/**
 * 
 */
public class IntegerSetTest {
	
	@Test
	@DisplayName("TestCase for Clear")
	public void testClear() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(1);
		set1.add(2);
		IntegerSet intSetA = new IntegerSet(set1);
		intSetA.clear();
		assertTrue(intSetA.isEmpty(), "Set Empty");
	}
    
	public void testLength() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(111);
		set1.add(222);
		IntegerSet intSetA = new IntegerSet(set1);
		
		assertEquals(2,intSetA.length(),"Length = 2");
		
	}

	@Test
	@DisplayName("TestCase for Equals")
	public void testEquals() {

		ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        IntegerSet intSetA = new IntegerSet(set1);
                
        ArrayList<Integer> set2 = new ArrayList<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        IntegerSet intSetB = new IntegerSet(set2);

        // Assert that intSetA equals intSetB
        assertTrue(intSetA.equals(intSetB), "Sets should be equal");

        // Create two different sets
        ArrayList<Integer> set3 = new ArrayList<>();
        set3.add(1);
        set3.add(2);
        IntegerSet intSetC = new IntegerSet(set3);
        
        assertFalse(intSetA.equals(intSetC), "Sets should not be equal");
}
	
	@Test
	@DisplayName("TestCase for Contain")
	public void testContain() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(1);
		set1.add(4141);
		IntegerSet intSetA = new IntegerSet(set1);
		assertTrue(intSetA.contains(4141), "Set contains 4141");
		assertFalse(intSetA.contains(2), "Set not contain 3");
		
	}
	
	@Test
	@DisplayName("TestCase for Largest")
	public void testLargest() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(1);
		set1.add(5);
		set1.add(100);
		IntegerSet intSetA = new IntegerSet(set1);
		
		assertEquals(100, intSetA.largest(), "largest num is 100");
	}
	
	@Test
	@DisplayName("TestCase for Largest (Exception")
	public void testLargestException() {
		IntegerSet intSetA = new IntegerSet(new ArrayList<>());
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			intSetA.largest();
		});
		assertEquals("Set is Empty", exception.getMessage(),"Expected IllegalStateException for empty set");
	}
	
	@Test
	@DisplayName("TestCase for Smallest")
	public void testSmallest() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(1);
		set1.add(5);
		set1.add(-2);
		IntegerSet intSetA = new IntegerSet(set1);
		
		assertEquals(-2, intSetA.smallest(), "smallest num is -2");
	}
	
	@Test
	@DisplayName("TestCase for Smallest (Exception)")
	public void testSmallestException() {
		IntegerSet intSetA = new IntegerSet(new ArrayList<>());
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			intSetA.smallest();
		});
		assertEquals("Set is Empty", exception.getMessage(),"Expected IllegalStateException for empty set");

}

	@Test
	@DisplayName("TestCase for Add")
	public void testAdd() {
		ArrayList<Integer> set1 = new ArrayList<>();
		IntegerSet intSetA = new IntegerSet(set1);
		intSetA.add(1);
		intSetA.add(-100);
		assertTrue(intSetA.contains(1), "Set should contain 1 after adding it");
		assertTrue(intSetA.contains(-100), "Set should contain -100 after adding it");
}

	@Test
	@DisplayName("TestCase for Remove")
	public void testRemove() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(1);
        IntegerSet intSetA = new IntegerSet(set1);
        intSetA.remove(1);
        assertFalse(intSetA.contains(1), "Set doesnt have 1 becuase of remove");
    }

	@Test
	@DisplayName("TestCase for Union")
	public void testUnion() {
		ArrayList<Integer> set1 = new ArrayList<>();
		set1.add(1);
        ArrayList<Integer> set2 = new ArrayList<>();
        set2.add(2);
        IntegerSet intSetA = new IntegerSet(set1);
        IntegerSet intSetB = new IntegerSet(set2);

        intSetA.union(intSetB);
        assertTrue(intSetA.contains(1) && intSetA.contains(2), "Set has 1 and 2 after union");
    }

	@Test
	@DisplayName("TestCase for Intesection")
	public void testIntersection() {
		ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(1);
        set1.add(2);
        ArrayList<Integer> set2 = new ArrayList<>();
        set2.add(2);
        set2.add(3);
        IntegerSet intSetA = new IntegerSet(set1);
        IntegerSet intSetB = new IntegerSet(set2);

        intSetA.intersect(intSetB);
        assertTrue(intSetA.contains(2) && intSetA.length() == 1, "Set should only have 2 after intersection");
    }
	
	@Test
	@DisplayName("TestCase for Complement")
	public void testComplement() {
		ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        ArrayList<Integer> set2 = new ArrayList<>();
        set2.add(2);
        set2.add(4);
        IntegerSet intSetA = new IntegerSet(set1);
        IntegerSet intSetB = new IntegerSet(set2);

        intSetA.complement(intSetB);
        assertTrue(intSetA.contains(1) && intSetA.contains(3) && !intSetA.contains(2), "Set should contain 1 and 3 but not 2 after complement");
    }
	
	@Test
	@DisplayName("TestCase for Difference")
	public void testDiff() {
		ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(1);
        set1.add(2);
        ArrayList<Integer> set2 = new ArrayList<>();
        set2.add(2);
        IntegerSet intSetA = new IntegerSet(set1);
        IntegerSet intSetB = new IntegerSet(set2);

        intSetA.diff(intSetB);
        assertTrue(intSetA.contains(1) && !intSetA.contains(2), "Set should only have 1 after difference");
    }
	
	@Test
	@DisplayName("TestCase for isEmpty")
	public void testisEmpty() {
		ArrayList<Integer> set1 = new ArrayList<>();
        IntegerSet intSetA = new IntegerSet(set1);

        assertTrue(intSetA.isEmpty(), "Set initallty empty");

        intSetA.add(1);
        assertFalse(intSetA.isEmpty(), "Set should not be empty after adding an element");
    }
	
	@Test
	@DisplayName("TestCase for toString")
	public void testToString() {
		ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(9);
        set1.add(10);
        IntegerSet intSetA = new IntegerSet(set1);

        assertEquals("[9, 10]", intSetA.toString(), "String representation should be [9, 10]");
    }
}	

