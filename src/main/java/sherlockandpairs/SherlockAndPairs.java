package sherlockandpairs;

import java.net.URISyntaxException;
import java.util.Hashtable;

public class SherlockAndPairs {
    public static void main(String[] args) throws URISyntaxException {
        int[] numbers = {1, 1, 2};
        countParis(numbers);
    }

    public static long countParis(int[] numbers) {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for(int i = 0; i < numbers.length ; i++) {
            if(table.containsKey(numbers[i])) {
                int value = table.get(numbers[i]);
                table.put(numbers[i], ++value);
            } else {
                int initialValue = 1;
                table.put(numbers[i], initialValue);
            }
        }
        long sum = 0;
        //System.out.println(table);
        for(int i : table.values()) {
            if(i > 1) {
                //System.out.println(i);
                sum += combination(i, 2);
            }
        }
        //sum = combination(sum, 2);
        System.out.println(sum*2);
        //System.out.println();
        return sum*2;
    }

    public static long combination(long n, long k) {

        long numerator = n * (n-1);
        return (numerator/k);
    }


}
