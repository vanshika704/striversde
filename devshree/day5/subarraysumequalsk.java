package day5;

import java.util.HashMap;

public class subarraysumequalsk {

    public static int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;

        // HashMap to store prefix sum frequencies
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); // base case: prefix sum = 0 occurs once

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // update prefix sum

            // check if (sum - k) is already seen
            if (mpp.containsKey(sum - k)) {
                count += mpp.get(sum - k);
            }

            // update frequency of current sum
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println("Number of subarrays with sum " + k + " = " + subarraySum(nums, k));
        // Expected Output: 2 ( [1,2] and [3] )
    }
}
