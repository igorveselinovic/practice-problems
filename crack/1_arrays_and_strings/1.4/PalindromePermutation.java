import java.util.HashMap;
import java.util.Map.Entry;

public class PalindromePermutation {
    public static boolean palindromePermutation(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        s = s.toLowerCase();

        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            // Ignore non-letter characters
            if (c < 'a' || c > 'z') continue;

            Integer charCount = charCounts.get(c);
            if (charCount == null) {
                charCounts.put(c, 1);
            } else {
                charCounts.put(c, charCount + 1);
            }
        }

        boolean oneOddCount = false;
        for (Entry<Character, Integer> entry: charCounts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (oneOddCount) return false;
                oneOddCount = true;
            }
        }
        return true;
    }
}