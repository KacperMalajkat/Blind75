package pl.kacper_malajkat.sliding_window;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {"abcabcbb", 3},
                {"bbbbb", 1},
                {"pwwkew", 3}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution1(String s, int result){
        int actual = LongestSubstringWithoutRepeatingCharacters.solution1(s);

        Assert.assertEquals(actual, result);
    }

    @Test(dataProvider = "data")
    public void testSolution2(String s, int result){
        int actual = LongestSubstringWithoutRepeatingCharacters.solution2(s);

        Assert.assertEquals(actual, result);
    }

}