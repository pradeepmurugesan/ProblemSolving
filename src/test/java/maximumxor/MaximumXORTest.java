package maximumxor;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumXORTest {

    @Test
    public void testMaxXOR() {
        MaximumXOR maximumXOR = new MaximumXOR();

        String result = maximumXOR.maxXorValue("10010", 5);

        assertEquals("01101", result);
    }
}