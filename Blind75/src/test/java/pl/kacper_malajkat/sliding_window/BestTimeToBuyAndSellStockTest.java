package pl.kacper_malajkat.sliding_window;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BestTimeToBuyAndSellStockTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{7,1,5,3,6,4}, 5},
                {new int[]{7,6,4,3,1}, 0}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] prices, int result){
        int actual = BestTimeToBuyAndSellStock.solution(prices);

        Assert.assertEquals(actual, result);
    }
}