// public class strStr {
//     public static int strStr1(String haystack, String needle) {
//         int n = haystack.length();
//         int m = needle.length();

//         for (int i = 0; i <= n - m; i++) {
//             int j;
//             for (j = 0; j < m; j++) {
//                 if (haystack.charAt(i + j) != needle.charAt(j)) {
//                     break;
//                 }
//             }
//             if (j == m) {
//                 return i; // Match found
//             }
//         }

//         return -1; // No match found
//     }

//     public static void main(String[] args) {
//         String haystack = "hello";
//         String needle = "ll";
//         System.out.println("Index: " + strStr1(haystack, needle));
//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// 
/// 
public class strStr {

    // KMP strStr
    public static int strStr1(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int[] lps = buildLPS(needle);
        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
                if (j == needle.length()) return i - j;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    // Build LPS array
    public static int[] buildLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println("Index: " + strStr1(haystack, needle));  // Output: 2
    }
}
