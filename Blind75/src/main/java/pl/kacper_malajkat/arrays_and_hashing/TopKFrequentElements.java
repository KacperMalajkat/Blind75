package pl.kacper_malajkat.arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
    Given an integer array nums and an integer k,
    return the k most frequent elements.
    You may return the answer in any order.

    T: O(N)
    S: O(N)
*/
class TopKFrequentElements {

    public static int[] solution(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for (int n : nums) {
            count.put(n, count.getOrDefault(n,0)+1);
        }

        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]) {
                    res[index++] = val;
                    if (index == k)
                        return res;
                }

        return res;
    }

}
