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


    public static String ReverseWords(String s){
        String [] words = s.trim().split("\\s+");

        int left =0 , right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left]= words[right];
            words[right]= temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
     public static void main(String[] args) {
        String str = "today is a nice day";
        System.out.println(reverseWords(str));
         System.out.println(ReverseWords(str));
    }
}

