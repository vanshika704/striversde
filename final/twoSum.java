import java.util.Arrays;
import java.util.HashMap;

public class twoSum{
//     public static int[]  brute(int arr[], int target){
// int ans []= new int[2];
//         for (int i = 0; i <=arr.length ; i++){
//             for (int j = i ; j < arr.length ; j++){
// if (arr[i] + arr[j] == target) {
//     ans[0] = i ;ans[1]=j;
//     return ans ;
// }
//             }
//         }
//         return ans;

//     } 

///////////////////////////////////////////////////////////////////////
// public static int [] better(int arr[], int target){
//     int ans []= new int[2];
//     Arrays.sort(arr);
//     int left = 0 ; int right = arr.length - 1 ;
//     while(left<right){
//         int sum = arr[left] + arr[right] ;
//         if (sum == target){
//             ans[0] = left ; ans[1] = right ;
//             return ans ;
//         } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//     }
// return ans;
// }
////////////////////////////////////////////////////////
  public static int[] optimal(int arr[], int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < arr.length; i++) {
            int moreNeeded = target - arr[i];

            if (map.containsKey(moreNeeded)) {
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans; // ✅ return immediately after finding the pair
            }

            map.put(arr[i], i); // ✅ Store current element for future
        }

        return new int[]{-1, -1}; // In case no pair found
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int ans [] = optimal(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}