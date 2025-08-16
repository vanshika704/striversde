package day2;

public class pivotindex {
public static int brute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) return i;
        }
        return -1;
    }

    public static int better (int []nums){
        int n = nums.length ;
        int [] prefix = new int [n];
        prefix[0]= nums[0];
        for(int i = 1; i < n ; i++){
            prefix[i]= prefix[i-1]+nums[i];
        }
        int totalSum = prefix[n-1];
        for(int i = 0 ; i <n ; i++){
            int leftSum = prefix[i] - nums[i];
        int rightSum = totalSum - prefix[i];
        if (leftSum == rightSum) return i;
        }
        return -1;
    }
    public static int optimal(int[] nums) {
    int totalSum = 0;
    for (int num : nums) totalSum += num;

    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
        int rightSum = totalSum - leftSum - nums[i];
        if (leftSum == rightSum) return i;
        leftSum += nums[i];
    }
    return -1;
}

    public static void main(String[] args) {
        int [] nums = {1, 7, 3, 6, 5,6};
 System.out.println(brute(nums));
  System.out.println(better(nums));
   System.out.println(optimal(nums));
    }
}
