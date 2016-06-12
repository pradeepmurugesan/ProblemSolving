package divisiblesumpairs;


import org.junit.Assert;
import org.junit.Test;

import static divisiblesumpairs.DivisibleSumPairs.getPairs;

public class DivisibleSumPairsTest {

    @Test
    public void simpleTest() {
        int k = 3;
        int [] array = {1, 7, 2, 4};
        int noOfPairs = getPairs(array, k);
        Assert.assertEquals(3, noOfPairs);
    }
}
