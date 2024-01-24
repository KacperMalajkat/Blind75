package pl.kacper_malajkat.arrays_and_hashing;

import java.util.HashSet;

/*
    Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct.

    T: O(N)
    S: O(N)
*/
class ContainsDuplicate {

    static boolean solution(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int n:nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }


}
