package day2;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] brute(int arr[], int target) {
        int n = arr.length;
        int res[] = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res; // return immediately when found
                }
            }
        }
        return new int[] {-1, -1}; // if no pair found
    }

    public static int[] betteroptimal(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {-2, 11, -4, 13, -5};
        int target = 9;
        
        int[] ans = brute(arr, target);
        System.out.println("Brute: " + Arrays.toString(ans));
        
        int[] ans1 = betteroptimal(arr, target);
        System.out.println("Better/Optimal: " + Arrays.toString(ans1));
    }
}
