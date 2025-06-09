public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        int left = 0;
        int right = str.length() - 1;

        char[] charArray = str.toCharArray();

        // Two-pointer approach to swap characters until pointers meet
        while (left < right) {
            // Swap characters at left and right
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        // Convert char array back to string
        String reversedStr = new String(charArray);
        System.out.println("Reversed string: " + reversedStr);
    }
}
