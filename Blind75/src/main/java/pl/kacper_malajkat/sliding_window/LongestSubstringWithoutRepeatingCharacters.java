package pl.kacper_malajkat.sliding_window;

import java.util.ArrayList;
import java.util.HashSet;

/*
    Given a string s, find the length of the longest
    substring without repeating characters.

    T: O(N)
    S: O(N)
*/
class LongestSubstringWithoutRepeatingCharacters {

    static int solution1(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, result = 0;

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            result = Math.max(result, r - l + 1);
        }
        return result;
    }

    static int solution2(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int result = 0;

        for (int r = 0; r < s.length(); r++) {
            if (list.contains(s.charAt(r))){
                int index = list.indexOf(s.charAt(r));
                list.remove(index);
                if (index > 0)
                    list.subList(0, index).clear();
            }
            list.add(s.charAt(r));
            result = Math.max(result, list.size());
        }

        return result;
    }

}
