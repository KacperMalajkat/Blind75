package pl.kacper_malajkat.two_pointers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidPalindromeTest {

    @DataProvider(name = "data")
    public static Object[][] data(){
        return new Object[][] {
                {"A man, a plan, a canal: Panama", true},
                {"race a car", false},
                {" ", true}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(String s, boolean result){
        boolean actual = ValidPalindrome.solution(s);

        Assert.assertEquals(actual, result);
    }

}