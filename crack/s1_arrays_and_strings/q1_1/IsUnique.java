package s1_arrays_and_strings.q1_1;

import java.util.HashSet;

public class IsUnique {
    public static boolean isUnique(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0, n = s.length(); i < n; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }
        return true;
    }
}