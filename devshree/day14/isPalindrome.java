package day14;

public class isPalindrome {
     public static boolean ispalindrome(String s) {
        char [] ch = s.toLowerCase().toCharArray();
        int left = 0 ;
        int right = ch.length-1;
        while(left<right){
            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            }
           if (!Character.isLetterOrDigit(ch[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(ch[right])) {
                right--;
            } else if (ch[left] != ch[right]) {
                return false; // mismatch
            } else {
                left++;
                right--;
            }
          
        }
        return true;
     }
public static void main(String[] args) {
    String str = "abcba";
    System.out.println(ispalindrome(str));
}
}
