
// class Solution {
//    public class BruteForceConsecutive {
//     public static int longestConsecutive(int[] nums) {
//         int maxLen = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int current = nums[i];
//             int count = 1;

//             // Check for the next consecutive elements
//             while (contains(nums, current + 1)) {
//                 current++;
//                 count++;
//             }

//             maxLen = Math.max(maxLen, count);
//         }
//         return maxLen;
//     }

//     private static boolean contains(int[] arr, int target) {
//         for (int num : arr) {
//             if (num == target) return true;
//         }
//         return false;
//     }
// }

// import java.util.Arrays;

// public class SortedConsecutive {
//     public static int longestConsecutive(int[] nums) {
//         if (nums.length == 0) return 0;
        
//         Arrays.sort(nums);
//         int maxLen = 1;
//         int count = 1;

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) continue; // skip duplicates
//             if (nums[i] == nums[i - 1] + 1) {
//                 count++;
//             } else {
//                 count = 1;
//             }
//             maxLen = Math.max(maxLen, count);
//         }

//         return maxLen;
//     }
// }



import java.util.HashSet;

public class OptimalConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxLen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}
