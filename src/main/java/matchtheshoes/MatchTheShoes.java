package matchtheshoes;

import java.util.*;

public class MatchTheShoes {

    public static void main(String[] args) {
        int[] orders = {2, 1, 2, 0, 3, 3, 1, 2};
        int distinctIds = 4;
        int numberOfShoes = 3;
        solution(orders, numberOfShoes, distinctIds);
    }
    public static List<Integer> solution(int[] orders, int numberOfShoes, int distinctIds) {
        int[] countArray = new int[distinctIds];
        for(int order : orders) {
            countArray[order]++;
        }

        HashMap<Integer, ArrayList<Integer>> rankMap = getRankMap(countArray);

        //System.out.println(rankMap);

        ArrayList<Integer> topShoes = new ArrayList<Integer>();
        Object[] ranks = rankMap.keySet().toArray();
        Arrays.sort(ranks);
        //System.out.println(Arrays.toString(rank));

        for(int j = ranks.length-1; j>=0 && topShoes.size() != numberOfShoes; j--) {
            ArrayList<Integer> shoeList = rankMap.get(ranks[j]);
            topShoes.addAll(shoeList);
        }
        //System.out.println(topShoes);

        printResult(topShoes, numberOfShoes);
        return topShoes.subList(0, numberOfShoes);
    }

    private static HashMap<Integer, ArrayList<Integer>> getRankMap(int[] countArray) {
        HashMap<Integer, ArrayList<Integer>> rankMap = new HashMap<Integer, ArrayList<Integer>>();
        for(int i =0; i < countArray.length; i++) {
            if( rankMap.containsKey(countArray[i]) ) {
                ArrayList<Integer> values = rankMap.get(countArray[i]);
                values.add(i);
                rankMap.put(countArray[i], values);
            } else {
                ArrayList<Integer> values = new ArrayList<Integer>();
                values.add(i);
                rankMap.put(countArray[i], values);
            }
        }
        return rankMap;
    }

    private static void printResult(ArrayList<Integer> topShoes, int numberOfShoes) {
        for(int shoe : topShoes.subList(0, numberOfShoes)) {
            System.out.println(shoe);
        }
    }
}


