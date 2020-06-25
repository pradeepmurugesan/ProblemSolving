package watertrapping;

import java.util.Arrays;

public class WaterTrap {

    public int trappedWater(int [] a) {
        int[] greatestToLeft = new int[a.length];
        int greatestLeft = Integer.MIN_VALUE;
        int totalTrapped = 0;

        for (int i = 0; i < a.length; i++) {
            greatestToLeft[i] = greatestLeft;
            if ( a[i] > greatestLeft) {
                greatestLeft = a[i];
            }
        }
        int greatestRight = a[a.length-1];
        for (int i = a.length-2 ; i >= 1 ; i--) {
            int min = Math.min(greatestToLeft[i], greatestRight);

            if ( min - a[i] > 0) {
                totalTrapped += (min - a[i]);
            }

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(greatestToLeft));
        return totalTrapped;
    }
}
