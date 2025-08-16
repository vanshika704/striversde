package day2;

public class twosum2 {
    public static void optimal (int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("The pair is " + arr[left] + " " + arr[right]);
                return; // exit after finding the pair
            }
            else if (sum < target) {
                left++;  // need a bigger sum → move left forward
            } 
            else {
                right--; // need a smaller sum → move right backward
            }
        }

        System.out.println("No pair found");
    }

    public static void main (String [] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 6};
        int target = 12;
        optimal(arr, target);
    }
}
