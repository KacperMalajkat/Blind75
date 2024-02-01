package pl.kacper_malajkat.arrays_and_hashing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class StringEncodeAndDecodeTest {

    @DataProvider(name = "encode")
    public static Object[][] encodeData(){
        return new Object[][] {
                {List.of("Ala", "ma", "kota"), "3#Ala2#ma4#kota"},
                {List.of("java", "cpp", "python"), "4#java3#cpp6#python"}
        };
    }

    @DataProvider(name = "decode")
    public static Object[][] decodeData(){
        return new Object[][] {
                {"3#Ala2#ma4#kota", List.of("Ala", "ma", "kota")},
                {"4#java3#cpp6#python", List.of("java", "cpp", "python")}
        };
    }

    @Test(dataProvider = "encode")
    public void testEncode(List<String> strs, String result){
        String actual = StringEncodeAndDecode.encode(strs);

        Assert.assertEquals(actual, result);
    }

    @Test(dataProvider = "decode")
    public void testDecode(String s, List<String> result){
        List<String> actual = StringEncodeAndDecode.decode(s);

        Assert.assertEquals(actual, result);
    }
}