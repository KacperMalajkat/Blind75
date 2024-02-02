package pl.kacper_malajkat.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
    Given an integer array nums,
    return all the triplets [nums[i], nums[j], nums[k]]
    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.

    T: O(N^2)
    S: O(N)
*/
class ThreeSum {

    static List<List<Integer>> solution(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int target = -nums[i];
                int l = i + 1;
                int r = nums.length - 1;

                while (l < r){
                    if (nums[l] + nums[r] == target){
                        ArrayList<Integer> solution = new ArrayList<>();
                        solution.add(nums[i]);
                        solution.add(nums[l]);
                        solution.add(nums[r]);
                        result.add(solution);
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return result;
    }

}
