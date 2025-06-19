public class kadane {
//    public static int Brute(int[] arr) {
//     int maxSum = Integer.MIN_VALUE;
//     for (int i = 0 ; i< arr.length ; i++) {
// int currentSum = 0 ;
// for (int j = i ; j< arr.length ; j++){
//    currentSum += arr[j];
//    maxSum = Math.max(maxSum,currentSum);
// }
//     }
//     return maxSum;
//    }

public static int maxSubArray(int[] nums) {
   int maxSum  = Integer.MIN_VALUE;
   int currentSum = 0 ;
   for (int num: nums){
      currentSum +=num;
      maxSum = Math.max(maxSum, currentSum);
      if (currentSum< 0) {
         currentSum = 0 ;
      }
      return maxSum;
   }
   return maxSum;
}
}
