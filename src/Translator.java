import java.util.HashMap;

public class Translator {
    HashMap<Integer, String> numericAlpha = new HashMap<Integer, String>();

    public Translator(String[] alphabetic, Integer[] numeric) {
        // Check if both arrays have the same length to avoid IndexOutOfBoundsException
        if (alphabetic.length != numeric.length) {
            throw new IllegalArgumentException("alphabetic and numeric arrays should be of equal length.");
        }

        // Loop through one of the arrays length
        for (int i = 0; i < alphabetic.length; i++) {
            // Populate the HashMap with elements from both arrays
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
}

