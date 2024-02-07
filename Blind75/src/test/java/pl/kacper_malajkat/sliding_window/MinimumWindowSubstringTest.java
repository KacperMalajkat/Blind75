package pl.kacper_malajkat.sliding_window;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinimumWindowSubstringTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {"ADOBECODEBANC", "ABC", "BANC"},
                {"a", "a", "a"},
                {"a", "aa", ""}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(String s, String t, String result){
        String actual = MinimumWindowSubstring.solution(s, t);

        Assert.assertEquals(actual, result);
    }
}