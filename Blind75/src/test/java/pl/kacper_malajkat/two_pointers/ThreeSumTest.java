package pl.kacper_malajkat.two_pointers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class ThreeSumTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {new int[]{-1,0,1,2,-1,-4}, List.of(List.of(-1,-1,2), List.of(-1,0,1))},
                {new int[]{0,1,1}, List.of()},
                {new int[]{0,0,0}, List.of(List.of(0,0,0))}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(int[] nums, List<List<Integer>> result){
        List<List<Integer>> actual = ThreeSum.solution(nums);

        Assert.assertEquals(actual, result);
    }

}