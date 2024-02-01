package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestConsecutiveSequenceTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{100,4,200,1,3,2}, 4},
                {new int[]{0,3,7,2,5,8,4,6,0,1}, 9}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] nums, int result){
        int actual = LongestConsecutiveSequence.solution(nums);

        Assert.assertEquals(actual, result);
    }
}