package s1_arrays_and_strings.q1_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckPermutationTest {
    @Test
    public void positive() {
        assertEquals(true, CheckPermutation.checkPermutation("", ""));
        assertEquals(true, CheckPermutation.checkPermutation("a", "a"));
        assertEquals(true, CheckPermutation.checkPermutation("abc", "abc"));
        assertEquals(true, CheckPermutation.checkPermutation("aabbcc", "cbaabc"));
        assertEquals(true, CheckPermutation.checkPermutation("abcdefg", "gfedcba"));
    }

    @Test
    public void negative() {
        assertEquals(false, CheckPermutation.checkPermutation("a", ""));
        assertEquals(false, CheckPermutation.checkPermutation("", "a"));
        assertEquals(false, CheckPermutation.checkPermutation("aaa", "aa"));
        assertEquals(false, CheckPermutation.checkPermutation("aaabbb", "aaabba"));
        assertEquals(false, CheckPermutation.checkPermutation("abcdefg", "gfedcbg"));
    }
}
