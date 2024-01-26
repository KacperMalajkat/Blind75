package pl.kacper_malajkat.arrays_and_hashing;

import java.util.HashMap;

/*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.

    You can return the answer in any order.

    T: O(N)
    S: O(N)
*/
class TwoSum {
    static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int diff = target - n;

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(n, i);
        }

        return new int[]{};
    }
}
