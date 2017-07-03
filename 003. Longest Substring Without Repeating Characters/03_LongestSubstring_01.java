import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        Map map = new HashMap<>();
        int length = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (map.get(s.charAt(j)) == "" || map.get(s.charAt(j)) == null) {
                    map.put(s.charAt(j), "1");
                    if (j + 1 - i > length) {
                        length = j + 1 - i;
                    }
                } else {
                    if (j - i > length) {
                        length = j - i;
                    }
                    map.clear();
                    break;
                }
            }
        }
        return length;
    }
}