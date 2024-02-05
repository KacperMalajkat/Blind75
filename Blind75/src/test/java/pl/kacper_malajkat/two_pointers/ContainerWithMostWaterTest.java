package pl.kacper_malajkat.two_pointers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContainerWithMostWaterTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{1,8,6,2,5,4,8,3,7}, 49},
                {new int[]{1,1}, 1}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] height, int result){
        int actual = ContainerWithMostWater.solution(height);

        Assert.assertEquals(actual, result);
    }

}