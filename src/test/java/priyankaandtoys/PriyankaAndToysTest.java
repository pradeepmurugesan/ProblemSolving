package priyankaandtoys;

import org.junit.Assert;
import org.junit.Test;

public class PriyankaAndToysTest {
    @Test
    public void getUnitsTest() {
        int[] weights = {1, 2, 3, 17, 10};
        int units = PriyankaAndToys.getunits(weights);
        Assert.assertEquals(units, 3);
    }
}
