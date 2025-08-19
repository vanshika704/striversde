package day10;

import java.util.Arrays;

public class mergetwosortedarrays {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;      // last valid element of arr1
        int j = n - 1;      // last element of arr2
        int k = m + n - 1;  // last index of arr1

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--]; // take element from arr1
            } else {
                arr1[k--] = arr2[j--]; // take element from arr2
            }
        }

        // Copy remaining elements from arr2 (if any)
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 0, 0}; // m=3 valid elements
        int[] arr2 = {2, 4, 6};          // n=3
        int m = 3, n = 3;

        merge(arr1, m, arr2, n);

        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(arr1));
    }
}
