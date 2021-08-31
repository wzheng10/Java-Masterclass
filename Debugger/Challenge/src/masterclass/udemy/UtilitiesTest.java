package masterclass.udemy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    @Test
    public void everyNthChar() throws Exception {
        fail("has not been tested yet");
    }

    @Test
    public void removePairs()  throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void converter()  throws Exception {
        fail("has not been tested yet");
    }

    @Test
    public void nullIfOddLength()  throws Exception {
        fail("has not been tested yet");
    }
}