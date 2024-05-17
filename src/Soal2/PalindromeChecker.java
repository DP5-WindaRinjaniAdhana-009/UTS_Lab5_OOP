package Soal2;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
                continue;
            }

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
