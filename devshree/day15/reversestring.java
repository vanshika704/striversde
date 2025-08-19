package day15;

public class reversestring{
 public static String reverseWords(String str) {
        String[] words = str.split(" "); // Split by space
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words
            }
        }

        return reversed.toString();
    }
     public static void main(String[] args) {
        String str = "today is a nice day";
        System.out.println(reverseWords(str));
    }
}