package gridsearch;


import org.junit.Assert;
import org.junit.Test;

public class GridSearchTest {

    @Test
    public void testGridSearchPattern() {
        String [] input = {
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"
        };
        String [] pattern = {
                "876543",
                "111111",
                "111111"
        };

        GridSearch gridSearch = new GridSearch(input, pattern);
        String result = gridSearch.searchGrid();
        Assert.assertEquals(result, "YES");
    }

    @Test
    public void testGridSearchPattern_1() {
        String [] input = {
                "999999",
                "121211"
        };
        String [] pattern = {
                "99",
                "11"
        };

        GridSearch gridSearch = new GridSearch(input, pattern);
        String result = gridSearch.searchGrid();
        Assert.assertEquals(result, "YES");
    }

    @Test
    public void testGridSearchPattern_2() {
        String [] input = {
                "111111111111111",
                "111111111111111",
                "111111111111111",
                "111111011111111",
                "111111111111111",
                "111111111111111",
                "101010101010101"
        };
        String [] pattern = {
                "11111",
                "11111",
                "11111",
                "11110",
        };
        GridSearch gridSearch = new GridSearch(input, pattern);
        String result = gridSearch.searchGrid();
        Assert.assertEquals(result, "YES");
    }
}
