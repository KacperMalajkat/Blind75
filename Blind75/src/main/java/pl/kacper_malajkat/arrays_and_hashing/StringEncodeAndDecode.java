package pl.kacper_malajkat.arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

/*
    Design an algorithm to encode a list of strings to a single string.
    The encoded string is then decoded back to the original list of strings.
*/
class StringEncodeAndDecode {

    static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    static List<String> decode(String s) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;

            int length = Integer.valueOf(s.substring(i, j));
            i = j + 1 + length;
            res.add(s.substring(j + 1, i));
        }
        return res;
    }

}
