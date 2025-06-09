public class validPalindrome {
    public static boolean isPalindrome(String s) {
    int left = 0 ; int right = s.length()-1 ;

    s.toCharArray();
    while (left<right){
        if (s.charAt(left)!=s.charAt(right)){
            return false ;
        }
    }
    return true;
}
}
