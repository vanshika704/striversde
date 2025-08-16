package day4;

import java.util.HashMap;
import java.util.Map;

public class longestsubarraywithsumk {
    public static int brute (int arr[], int k ){
        int n = arr.length;
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static int optimal(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            // store only first occurrence of prefixSum
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }

  public static void main(String[] args) {
      int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Brute: " + brute(arr, k));
        System.out.println("Optimal: " + optimal(arr, k));
    
  }
}
