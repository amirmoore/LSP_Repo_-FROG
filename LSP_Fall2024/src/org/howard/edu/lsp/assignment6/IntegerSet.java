package org.howard.edu.lsp.assignment6;
import java.util.ArrayList;
import java.util.List;

/** Create the Integerset class to hold all class methods */
public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/** Java default Constructor */
	public IntegerSet() {		
	}
	/** contructor to initialize the set */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
		}
	
	/** clear set */
	public void clear() {
		set.clear();
	}
	/** return length of set */
	public int length() {
		return set.size();
	}
	/** equals boolean to check if sets are equal
	 *  If sets no equal return false */
	@Override
	public boolean equals(Object o) {
		if (o instanceof IntegerSet) {
			IntegerSet newSet = (IntegerSet) o;
			return set.size() == newSet.set.size() && set.containsAll(newSet.set);
		}
		return false;
	}
	/** does the set contain a specific value*/
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	
	/** check if the set is empty, if not check for the largest number */
	public int largest() {
		if (set.isEmpty())
			throw new IllegalStateException("Set is Empty"); // throw error instead of telling them there is error
		int largest = set.get(0);
		for (int num : set) {
			if (num > largest) {
				largest = num;
			}
		}
		return largest;
	}
	/** check if set empty, if not check for smallest value */
	public int smallest() {
		if (set.isEmpty())
			throw new IllegalStateException("Set is Empty"); // throw error instead of telling them there is error
		int smallest = set.get(0);
		for (int num : set) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}
	
	/** make sure item isnt already in set, and if not, adds to set */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	/** remove value from set */
	public void remove (int item) {
		set.remove((Integer) item);
	}
	/** combines two sets together */
	public void union(IntegerSet intSetb) {
		for (int item : intSetb.set) {
			if (!set.contains(item)) {
				set.add(item);
			}
		}
	}
	/** Only keep values that are shared in both sets */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	/** remove values that are in one set from another */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<>();
		for (int num : set) {
			if (!intSetb.set.contains(num)) {
				complementSet.add(num);
			}
		}
		set = complementSet;
		
	}
	
	/** Is the set empty? */
	public boolean isEmpty() {
		return set.isEmpty();
	}
	/** return the set as a string  */
	@Override
	public String toString() {
		return set.toString();
		}
	
	
	
}
