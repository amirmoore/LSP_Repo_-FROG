package org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
	// map to store candidates and their votes
	private Map<String, Integer> candidates;
	// initialize map
	public VotingMachine() {
		candidates = new HashMap<>();
	}
	// to add candidate to list
	public void addCandidate(String name) {
		if (!candidates.containsKey(name)) {
			candidates.put(name,  0);
		} 
		else {
			System.out.println("candidate " + candidates + " already exists");
		}
	}
	// how to cast vote
	public void castVote(String name) {
		if (candidates.containsKey(name)) {
			candidates.put(name, candidates.get(name) + 1);
		}
		else {
			System.out.println("candidate " + name + " does not exist");
		}
	}
	
	// show candidate information
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
			result.append("candidate: ").append(entry.getKey()).append(", votes: ").append(entry.getValue());
		}
		return result.toString();
		}

}
