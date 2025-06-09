public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};

        int i = 0;  // Slow runner

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;  // Move slow runner
                arr[i] = arr[j];  // Update position i with new unique element
            }
        }

        // i is index of last unique element, so number of unique elements = i+1
        System.out.println("Length of array after removing duplicates: " + (i + 1));
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
