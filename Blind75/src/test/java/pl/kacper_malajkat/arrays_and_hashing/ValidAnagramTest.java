package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidAnagramTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {"anagram", "nagaram", true},
                {"rat", "car", false}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(String s, String t, boolean result){
        boolean actual = ValidAnagram.solution(s,t);

        Assert.assertEquals(actual, result);
    }

}