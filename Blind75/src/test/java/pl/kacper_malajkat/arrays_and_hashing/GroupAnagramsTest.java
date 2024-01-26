package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class GroupAnagramsTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat"))},
                {new String[]{""}, List.of(List.of(""))},
                {new String[]{"a"},List.of(List.of("a"))}
        };
    }

    @Test(dataProvider = "data")
    public void testSolution(String[] strs, List<List<String>> result) {
        List<List<String>> actual = GroupAnagrams.groupAnagrams(strs);

        Assert.assertEquals(actual, result);
    }
}