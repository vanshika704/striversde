public class sumof1darray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;  // Declare once outside the loop

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Keep adding to sum
        }

        System.out.println("Sum of array: " + sum);
    }
}
