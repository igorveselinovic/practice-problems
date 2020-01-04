import java.util.HashMap;

public class CheckPermutation {
    public static boolean checkPermutation(String s1, String s2) {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 != length2) {
            return false;
        }

        for (int i = 0; i < length1; i++) {
            char c = s1.charAt(i);
            Integer charCount = charCounts.get(c);
            if (charCount == null) {
                charCounts.put(c, 1);
            } else {
                charCounts.put(c, charCount + 1);
            }
        }

        for (int i = 0; i < length2; i++) {
            char c = s2.charAt(i);
            Integer charCount = charCounts.get(c);
            if (charCount == null || charCount == 0) {
                return false;
            } else {
                charCounts.put(c, charCount - 1);
            }
        }
        return true;
    }
}