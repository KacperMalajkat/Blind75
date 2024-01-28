package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TopKFrequentElementsTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{1,1,1,2,2,3}, 2, new int[]{1,2}},
                {new int[]{1}, 1, new int[]{1}}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] nums, int k, int[] result){
        int[] actual = TopKFrequentElements.solution(nums, k);

        Assert.assertEquals(actual, result);
    }

}