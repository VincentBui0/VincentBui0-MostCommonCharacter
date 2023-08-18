import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequencies = new HashMap<>();

        // Iterate through the characters in the input string
        for (char c : str.toCharArray()) {
            // If the character is already in the map, update its frequency
            if (charFrequencies.containsKey(c)) {
                charFrequencies.put(c, charFrequencies.get(c) + 1);
            } else {
                charFrequencies.put(c, 1); // Otherwise, add the character to the map with frequency 1
            }
        }

        char mostCommonChar = ' ';
        int maxFrequency = 0;

        // Find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommonChar = entry.getKey();
            }
        }

        return mostCommonChar;
    }
}