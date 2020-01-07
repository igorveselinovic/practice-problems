package s1_arrays_and_strings.q1_5;

public class OneAway {
    public static boolean oneAway(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (Math.abs(len1 - len2) > 1) {
            return false;
        } else if (len1 == len2) {
            boolean foundDiff = false;
            for (int i = 0; i < len1; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (foundDiff) return false;
                    foundDiff = true;
                }
            }
            return true;
        } else {
            String longStr, shortStr;
            if (len1 > len2) {
                longStr = s1;
                shortStr = s2;
            } else {
                longStr = s2;
                shortStr = s1;
            }
            boolean foundDiff = false;
            for (int i = 0, j = 0; i < Math.max(len1, len2); i++, j++) {
                if (i == Math.max(len1, len2) - 1 && i == j ||
                        longStr.charAt(i) != shortStr.charAt(j)) {
                    if (foundDiff) return false;
                    foundDiff = true;
                    j--;
                }
            }
            return true;
        }
    }
}