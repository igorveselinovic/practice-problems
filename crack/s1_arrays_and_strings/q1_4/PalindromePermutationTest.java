package s1_arrays_and_strings.q1_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromePermutationTest {
    @Test
    public void positive() {
        assertEquals(true, PalindromePermutation.palindromePermutation("Tact Coa"));
        assertEquals(true, PalindromePermutation.palindromePermutation("racecar"));
        assertEquals(true, PalindromePermutation.palindromePermutation("carcar"));
        assertEquals(true, PalindromePermutation.palindromePermutation("abb"));
    }

    @Test
    public void negative() {
        assertEquals(false, PalindromePermutation.palindromePermutation("Tact Coaa"));
        assertEquals(false, PalindromePermutation.palindromePermutation("rracecar"));
        assertEquals(false, PalindromePermutation.palindromePermutation("cartcarl"));
        assertEquals(false, PalindromePermutation.palindromePermutation("abbc"));
    }

    @Test
    public void emptyString() {
        assertEquals(true, PalindromePermutation.palindromePermutation(""));
    }

    @Test
    public void singleChar() {
        assertEquals(true, PalindromePermutation.palindromePermutation("a"));
    }

    @Test
    public void specialCharacters() {
        assertEquals(true, PalindromePermutation.palindromePermutation("!.<"));
    }
}