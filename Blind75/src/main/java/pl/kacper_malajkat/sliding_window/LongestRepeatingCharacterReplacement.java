package pl.kacper_malajkat.sliding_window;

import java.util.HashMap;

/*
    You are given a string s and an integer k.
    You can choose any character of the string
    and change it to any other uppercase English character.
    You can perform this operation at most k times.

    Return the length of the longest substring
    containing the same letter you can get after
    performing the above operations.

    T: O(N)
*/
class LongestRepeatingCharacterReplacement {

    static int solution(String s, int k){
        int[] count = new int[26];
        int result = 0, max = 0, l = 0;

        for (int r = 0; r < s.length(); r++) {
            int index = s.charAt(r) - 'A';
            count[index]++;
            max = Math.max(max, count[index]);
            if (r - l + 1 - max > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }

}
