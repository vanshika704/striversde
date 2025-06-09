public class strStr {
    public static int strStr1(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // Match found
            }
        }

        return -1; // No match found
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println("Index: " + strStr1(haystack, needle));
    }
}
