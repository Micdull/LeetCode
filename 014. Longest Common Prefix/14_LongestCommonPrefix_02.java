public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs[0].length() == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

/** Solution
 *  基本思路：
 *      取第一个字符串，依次减少一个字符和所有字符串对比
 */
