package s1_arrays_and_strings.q1_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OneAwayTest {
    @Test
    public void positive() {
        assertEquals(true, OneAway.oneAway("pale", "ple"));
        assertEquals(true, OneAway.oneAway("pales", "pale"));
        assertEquals(true, OneAway.oneAway("pale", "bale"));
        assertEquals(true, OneAway.oneAway("ple", "pale"));
        assertEquals(true, OneAway.oneAway("pale", "pales"));
    }

    @Test
    public void negative() {
        assertEquals(false, OneAway.oneAway("pale", "ples"));
        assertEquals(false, OneAway.oneAway("pale", "plles"));
    }

    @Test
    public void tooLong() {
        assertEquals(false, OneAway.oneAway("pale", "paleee"));
    }

    @Test
    public void emptyString() {
        assertEquals(true, OneAway.oneAway("", ""));
        assertEquals(true, OneAway.oneAway("", "1"));
    }

    @Test
    public void sameString() {
        assertEquals(true, OneAway.oneAway("asdf", "asdf"));
    }
}