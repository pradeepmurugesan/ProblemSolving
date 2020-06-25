package watertrapping;

import org.junit.Assert;
import org.junit.Test;

public class WaterTrapTest {

    @Test
    public void testWaterTrap() {
        WaterTrap waterTrap = new WaterTrap();

        int[] a = { 1, 3, 8, 6, 4, 9, 11};

        Assert.assertEquals(6, waterTrap.trappedWater(a));
    }


    @Test
    public void anotherTestWaterTrap() {
        WaterTrap waterTrap = new WaterTrap();

        int[] a = { 3, 0, 2, 0, 4};

        Assert.assertEquals(7, waterTrap.trappedWater(a));
    }

}