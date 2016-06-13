package nondivisiblesubset;

import org.junit.Assert;
import org.junit.Test;

public class NonDivisibleSubsetTest {
    @Test
    public void simpleTest() {
        int k = 3;
        int [] array = {1, 7, 2, 4};
        int subsetLength = NonDivisibleSubset.getNonDivisibleSubset(array, k);
        Assert.assertEquals(3, subsetLength);
    }
}
