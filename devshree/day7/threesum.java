package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum {
 public static List<List<Integer>> brute(int arr[]) {
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>(); // to avoid duplicates

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet); // ensure same order
                        ans.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
public static List <List<Integer>> optimal (int []arr){
    Arrays.sort(arr);
    List <List<Integer>> ans = new ArrayList<> ();
    for (int i = 0; i < arr.length - 2; i++) {
        if (i > 0 && arr[i] == arr[i - 1]) continue;
        int left = i+1, right = arr.length - 1;
        while (left < right) {
            int sum = arr[i] + arr[left] + arr[right];
            if (sum < 0) left++;
            else if(sum ==0){
                ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                left++;
                right--;
                 while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;

            }else{
                right--;
            }
        }
           
    }
    return ans;

}
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(brute(arr));
         System.out.println(optimal(arr));
    }
}
