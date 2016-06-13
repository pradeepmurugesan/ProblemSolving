package nondivisiblesubset;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        int k = 3;
        int [] array = {1, 7, 2, 4};
        int length = getNonDivisibleSubset(array, k);
        System.out.println(length);
    }

    public static int getNonDivisibleSubset(int[] array, int k) {
        int [] pigeonHoles = new int[k];

        for (int i : array) {
            pigeonHoles[i % k]++;
        }

        int length = 0;

        if (pigeonHoles[0] > 0) {
            length++;
        }

        if (k % 2 == 0 && pigeonHoles[k/2] > 0) {
            length++;
        }

        for (int i = 1, j = k-1; i < j; i++, j-- ) {
            length += Math.max(pigeonHoles[i], pigeonHoles[j]);
        }

        return length;

    }
}
