package s1_arrays_and_strings.q1_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class URLifyTest {
    @Test
    public void basic() {
        char[] url = "Mr John Smith    ".toCharArray();
        URLify.urlify(url, 13);
        assertEquals("Mr%20John%20Smith", new String(url));
    }

    @Test
    public void doubleSpaces() {
        char[] url = "Mr  John  Smith        ".toCharArray();
        URLify.urlify(url, 15);
        assertEquals("Mr%20%20John%20%20Smith", new String(url));
    }

    @Test
    public void leadingSpaces() {
        char[] url = "  Mr John Smith        ".toCharArray();
        URLify.urlify(url, 15);
        assertEquals("%20%20Mr%20John%20Smith", new String(url));
    }

    @Test
    public void trailingSpaces() {
        char[] url = "Mr John Smith          ".toCharArray();
        URLify.urlify(url, 15);
        assertEquals("Mr%20John%20Smith%20%20", new String(url));
    }

    @Test
    public void emptyString() {
        char[] url = "".toCharArray();
        URLify.urlify(url, 0);
        assertEquals("", new String(url));
    }

    @Test
    public void noSpaces() {
        char[] url = "NoSpaces".toCharArray();
        URLify.urlify(url, 8);
        assertEquals("NoSpaces", new String(url));
    }

    @Test
    public void nullChar() {
        char[] url = "One Space   ".toCharArray();
        URLify.urlify(url, 9);
        assertEquals("One%20Space\0", new String(url));
    }

    @Test
    public void nullCharNoSpaces() {
        char[] url = "NoSpaces ".toCharArray();
        URLify.urlify(url, 8);
        assertEquals("NoSpaces\0", new String(url));
    }
}