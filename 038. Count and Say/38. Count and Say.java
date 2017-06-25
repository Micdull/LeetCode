import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i = 0; i< n;i++){
            s = helper(s);
        }
    }

    public String helper(String str) {
        Character pre = str.charAt(0);
        Character c = null;
        String curr = "";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            map.put(c, (map.get(c) == null ? 0 : map.get(c)) + 1);
            if (c != pre) {
                curr = curr + map.get(pre) + pre;
                map.remove(pre);
            }
            pre = str.charAt(i);
        }
        return curr + map.get(c) + c;
    }
}