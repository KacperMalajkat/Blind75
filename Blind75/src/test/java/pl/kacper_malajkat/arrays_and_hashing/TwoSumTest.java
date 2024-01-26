package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoSumTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{2,7,11,15}, 9, new int[]{0,1}},
                {new int[]{3,2,4}, 6, new int[]{1,2}},
                {new int[]{3,3}, 6, new int[]{0,1}}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] nums, int target, int[] result){
        int[] actual = TwoSum.solution(nums, target);

        Assert.assertEquals(actual, result);
    }

}