package sherlockandparis;

import org.junit.Assert;
import org.junit.Test;
import sherlockandpairs.SherlockAndPairs;

public class SherlockAndPairsTest {
    @Test
    public void simpleTest() {

        int[] numbers = {1, 2, 3, 2};
        long total = SherlockAndPairs.countParis(numbers);
        Assert.assertEquals(total, 2);
    }
}
