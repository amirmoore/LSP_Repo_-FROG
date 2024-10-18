package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
	
	public static int commonKeyPairs(HashMap<String, String> map1, HashMap<String,String> map2) {
		if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
			return 0;
		}
		int Counter = 0;
		
		for (Map.Entry<String,String> entry : map1.entrySet()) {
			if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
				Counter++;
			}
		}
		return Counter;
	}

}
