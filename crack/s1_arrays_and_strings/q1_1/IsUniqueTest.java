package s1_arrays_and_strings.q1_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsUniqueTest {
    @Test
    public void unique() {
        assertEquals(true, IsUnique.isUnique("abc"));
        assertEquals(true, IsUnique.isUnique("cba"));
        assertEquals(true, IsUnique.isUnique("123abc"));
        assertEquals(true, IsUnique.isUnique(""));
        assertEquals(true, IsUnique.isUnique("a"));
    }

    @Test
    public void notUnique() {
        assertEquals(false, IsUnique.isUnique("aa"));
        assertEquals(false, IsUnique.isUnique("aba"));
        assertEquals(false, IsUnique.isUnique("1abcdef1"));
    }
}