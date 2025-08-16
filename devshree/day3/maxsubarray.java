package day3;

public class maxsubarray {
     public static int brute(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }


    public static int better(int arr[]) {
    int n = arr.length;
    int[] prefix = new int[n];
    prefix[0] = arr[0];

    for (int i = 1; i < n; i++) {
        prefix[i] = prefix[i - 1] + arr[i];
    }

    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int sum = prefix[j] - (i > 0 ? prefix[i - 1] : 0);
            maxSum = Math.max(maxSum, sum);
        }
    }
    return maxSum;
}
public static int optimal(int arr[]) {
    int maxSum = arr[0];
    int currentSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
        currentSum = Math.max(arr[i], currentSum + arr[i]);  // continue or restart
        maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
}
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Brute: " + brute(arr));
         System.out.println("Better: " + better(arr));
          System.out.println("Brute: " + optimal(arr));
    }
}
