package pl.kacper_malajkat.arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
    Given an array of strings strs,
    group the anagrams together.
    You can return the answer in any order.

    T: O(M * N)
*/
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(s);
        }

        return new ArrayList<>(map.values());
    }

}
