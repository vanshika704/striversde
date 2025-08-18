package day14;

import java.util.Arrays;

public class validanagram {
    public static boolean validAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
public static boolean optimal (String s1, String s2){
    if (s1.length() != s2.length()) return false;
    int[] count = new int[256];
    for (int i = 0; i < s1.length(); i++) {
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    };
    for (int i = 0; i < 256; i++) {
        if (count[i] != 0) return false;
    }
    return true;
}
    public static void main(String[] args) {
        System.out.println(validAnagram("abc", "cab")); // true
        System.out.println(validAnagram("rat", "car")); // false
        System.out.println(optimal("abc", "cab")); // true
        System.out.println(optimal("rat", "car")); // false
    }
    }
