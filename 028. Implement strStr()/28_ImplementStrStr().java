public class Solution {

    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l2 > l1) {
            return -1;
        }
        if (l2 == 0) {
            return 0;
        }

        for (int i = 0; i < l1 - l2; i++) {
            if (haystack.substring(i, l2 + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        //逐个字符比较
    }

    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}