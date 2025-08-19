package day15;

public class reverseaplhabets {
    public static String reverse(String s) {
        // convert string to char array
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // swap characters
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // return reversed string
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "heelo";
        System.out.println(reverse(str)); // output: "oleeh"
    }
}
