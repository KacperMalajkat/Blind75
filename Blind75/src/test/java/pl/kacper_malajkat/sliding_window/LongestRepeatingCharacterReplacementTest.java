package pl.kacper_malajkat.sliding_window;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestRepeatingCharacterReplacementTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {"ABAB", 2, 4},
                {"AABABBA", 1, 4}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(String s, int k, int result) {
        int actual = LongestRepeatingCharacterReplacement.solution(s, k);

        Assert.assertEquals(actual, result);
    }

}