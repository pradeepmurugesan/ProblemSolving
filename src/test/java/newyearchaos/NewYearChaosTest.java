package newyearchaos;

import org.junit.Assert;
import org.junit.Test;

public class NewYearChaosTest {

    @Test
    public void simpleTest() {
        int [] array = {1, 2, 5, 3, 7, 8, 6, 4};
        NewYearChaos newYearChaos = new NewYearChaos();
        int bribes = newYearChaos.getNoOfBribes(array);
        Assert.assertEquals(7, bribes);
    }


    @Test
    public void negativeTest() {
        int [] array = {5, 1, 2, 3, 7, 8, 6, 4};
        NewYearChaos newYearChaos = new NewYearChaos();
        int bribes = newYearChaos.getNoOfBribes(array);
        Assert.assertEquals(-1, bribes);
    }

}
