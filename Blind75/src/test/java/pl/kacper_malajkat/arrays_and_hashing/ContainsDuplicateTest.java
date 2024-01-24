package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.*;
public class ContainsDuplicateTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{1,2,3,1}, true},
                {new int[]{1,2,3,4}, false},
                {new int[]{1,1,1,3,3,4,3,2,4,2}, true}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] nums, boolean result){
        boolean actual = ContainsDuplicate.solution(nums);

        Assert.assertEquals(actual, result);
    }

}