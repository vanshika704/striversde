public class Kadane {
    public int  maxSubArraySum(int[] arr) {
        int currSum  = Integer.MIN_VALUE;
        int maxSum = 0;

        for (int i = 0 ; i < arr.length ;i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);

        }
        return maxSum;

    }
}
