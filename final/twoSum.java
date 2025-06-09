// import java.util.HashMap;

// public class twoSum {
//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15};  // Input array
//         int target = 9;              // Target sum

//         HashMap<Integer, Integer> mpp = new HashMap<>();  // Map to store number -> index

//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];  // The number we need to find

//             if (mpp.containsKey(complement)) {
//                 // Found the pair → print their indices
//                 System.out.println("Indices: " + mpp.get(complement) + " and " + i);
//                 return;
//             }

//             // Otherwise, store the current number with its index
//             mpp.put(nums[i], i);
//         }

//         // If no pair found
//         System.out.println("No two numbers add up to the target.");
//     }
// }



/////////////// sorted + two pointer technique 

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Arrays.sort(nums);  // Sort array

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println("Values: " + nums[left] + " and " + nums[right]);
                break;  // Exit after finding the pair
            } else if (sum < target) {
                left++;  // Increase sum by moving left pointer right
            } else {
                right--;  // Decrease sum by moving right pointer left
            }
        }
    }
}
