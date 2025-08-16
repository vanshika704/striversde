package day1;

public class removeduplicates {
    public static int brute(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] res = new int[n];
        int j = 0;

        res[j++] = arr[0]; // first element always

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                res[j++] = arr[i];
            }
        }

        // Copy unique elements back to original array
        for (int i = 0; i < j; i++) {
            arr[i] = res[i];
        }

        return j; // new length of unique elements
    }

    public static int optimal(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;  // ✅ length of unique array
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 2, 3, 4, 5}; // fresh copy for optimal

        int k = brute(arr1);
        int n = optimal(arr2);

        System.out.println("Unique array brute:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nLength = " + k);

        System.out.println("Unique array optimal:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\nLength = " + n);
    }
}
