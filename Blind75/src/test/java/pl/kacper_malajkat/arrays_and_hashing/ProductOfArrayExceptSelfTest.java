package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductOfArrayExceptSelfTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{1,2,3,4}, new int[]{24,12,8,6}},
                {new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0}}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] nums, int[] result){
        int[] actual = ProductOfArrayExceptSelf.solution(nums);
        Assert.assertEquals(actual, result);
    }

}