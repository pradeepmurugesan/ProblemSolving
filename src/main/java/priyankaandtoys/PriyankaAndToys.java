package priyankaandtoys;


import java.util.Arrays;

public class PriyankaAndToys {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 17, 10};
        System.out.println(getunits(weights));
    }

    public static int getunits(int[] weights) {
        Arrays.sort(weights);
        int cost = 0;
        int currentWeight = -6;
        int i = 0;
        while( i < weights.length) {
            if(weights[i] <= currentWeight + 4) {
                i++;
            } else {
                currentWeight = weights[i];
                cost++;
                i++;
            }
        }
        return cost;
    }
}
