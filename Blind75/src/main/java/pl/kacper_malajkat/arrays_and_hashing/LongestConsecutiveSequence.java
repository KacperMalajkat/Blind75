package pl.kacper_malajkat.arrays_and_hashing;

import java.util.HashSet;

/*
    Given an unsorted array of integers nums,
    return the length of the longest consecutive elements sequence.

    T: O(N)
*/
class LongestConsecutiveSequence {

    static int solution(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
        int longest = 0;

        for (int i:set){
            // if i is start a sequence?
            if (!set.contains(i-1)){
                int count = 1;
                while (set.contains(i+1)){
                    i++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
            if (longest > nums.length/2) break;
        }

        return longest;
    }

}
