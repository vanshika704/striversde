package day3;

public class majority {

    // Brute Force O(n^2)
    public static int brute(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0; // reset for each i
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i]; // majority found
            }
        }
        return -1; // if no majority exists
    }

 public static int optimal(int arr[]) {
        int count = 0, candidate = -1;

        // Phase 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return (count > arr.length / 2) ? candidate : -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 2, 2, 2};
        System.out.println("Majority element (brute): " + brute(arr));
    }
}
// brute : use two loops 
// optimal : boyre moore voting algo 
