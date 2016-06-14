package matchtheshoes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class MatchTheShoesTest {

    @Test
    public void simpleTest() {
        int[] orders = {2, 1, 2, 0, 3, 3, 1, 2};
        int distinctIds = 4;
        int numberOfShoes = 3;
        List<Integer> topShoes = MatchTheShoes.solution(orders, numberOfShoes, distinctIds);
        Assert.assertTrue(topShoes.size() == 3);
        Assert.assertTrue(topShoes.get(0) == 2);
        Assert.assertTrue(topShoes.get(1) == 1);
        Assert.assertTrue(topShoes.get(2) == 3);
    }
}
