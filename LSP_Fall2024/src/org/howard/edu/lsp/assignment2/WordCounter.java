/*
 * Amir Moore @03067634
 */

package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        // Assuming the file is in the same directory as the .java file
        String fileName = "src/org/howard/edu/lsp/assignment2/words.txt";
        
        // Call the word counting method
        countWords(fileName);
    }

    public static void countWords(String fileName) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        // File reading using BufferedReader
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();  // Convert to lowercase
                String[] words = line.split(" ");

                // Process each word
                for (String word : words) {
                    word = removeSpecialChars(word);  // Remove special characters
                    
                    if (!word.isEmpty()) {  // Ensure word isn't empty after cleaning
                        if (word.contains("'")) {
                            int apostropheIndex = word.indexOf("'");
                            word = word.substring(0, apostropheIndex);
                        }

                        if (word.length() > 3 && !isNumeric(word)) {
                            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Output the word count
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
    }

    // Remove special characters at the start and end of words
    public static String removeSpecialChars(String word) {
        // Remove characters at the start
        while (word.length() > 0 && !Character.isLetter(word.charAt(0))) {
            word = word.substring(1);
        }

        // Remove characters at the end
        while (word.length() > 0 && !Character.isLetter(word.charAt(word.length() - 1))) {
            word = word.substring(0, word.length() - 1);
        }

        return word;
    }

    // Helper method to check if a string is numeric
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
