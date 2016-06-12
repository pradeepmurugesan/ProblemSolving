package divisiblesumpairs;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int k = 3;
        int [] array = {1, 7, 2, 4};
        int noOfPairs = getPairs(array, k);
        System.out.println(noOfPairs);
    }

    public static int getPairs(int[] array, int k) {
        int sumPairs = 0;
        int n = array.length;
        for(int i =0; i < n; i++) {
            for(int j = i+1 ; j < n; j++) {
                if((array[i] + array[j]) % k == 0) {
                    sumPairs++;
                }
            }
        }
        return sumPairs;
    }
}
