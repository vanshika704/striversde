package day8;



import java.util.Arrays;

public class nextPermutation {
    public static void NextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step1: find breakpoint
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            // Step2: find just greater element
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // Step3: swap
            swap(nums, i, j);
        }

        // Step4: reverse remaining
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        NextPermutation(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 2]

        int[] arr2 = {3, 2, 1};
        NextPermutation(arr2);
        System.out.println(Arrays.toString(arr2)); // [1, 2, 3]
    }
}
