package newyearchaos;

public class NewYearChaos {


    public int getNoOfBribes(int [] array) {
        int bribes = 0;
        for (int i = array.length -1; i >= 0; i--) {
            int element = array[i];
            if (element - (i+1) > 2) {
                bribes = -1;
                System.out.println("breaking for element " + element);
                break;
            }
            for (int j = Math.max(0, element -2); j < i; j++) {
                if (element < array[j]) {
                    bribes++;
                }
            }
        }
        return bribes;
    }
}
