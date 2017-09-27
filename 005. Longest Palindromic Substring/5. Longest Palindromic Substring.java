public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String sub = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome2(s.substring(i, j)) && (j - i) > sub.length()) {
                    sub = s.substring(i, j);
                }
            }
        }
        return sub;
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        String stringReverse = new StringBuffer(s).reverse().toString();
        if (!s.equals(stringReverse)) {
            return false;
        }
        return true;
    }
}
