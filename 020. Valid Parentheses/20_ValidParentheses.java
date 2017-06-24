public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        int sum = strs.length;
        int times = 0;
        String prefix = "" + strs[0].charAt(times);
        while (sum == strs.length) {
            sum = 1;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].startsWith(prefix)) {
                    sum = sum + 1;
                }
            }
            if (sum == strs.length) {
                times++;
                if (times == strs[0].length()) {
                    return prefix;
                }
                prefix = prefix + String.valueOf(strs[0].charAt(times));
            } else {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;
    }
}

/** Solution
 *  基本思路：
 *      取第一个字符串的第一个字符，依次增加一个字符和所有字符串对比
 */
