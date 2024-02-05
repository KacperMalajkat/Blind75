package pl.kacper_malajkat.two_pointers;

/*
    You are given an integer array height of length n.
    There are n vertical lines drawn such that the
    two endpoints of the ith line are (i, 0) and (i, height[i]).

    Find two lines that together with the x-axis form a container,
    such that the container contains the most water.

    Return the maximum amount of water a container can store.

    Notice that you may not slant the container.

    T: O(N)
*/
class ContainerWithMostWater {

    static int solution(int[] height){
        int l = 0, r = height.length - 1;
        int result = 0;

        while (l<r){
            int area = (r - l) * Math.min(height[l], height[r]);
            result = Math.max(result, area);

            if (height[l] < height[r]) l++;
            else r--;
        }
        return result;
    }

}
