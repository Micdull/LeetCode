import java.util.Stack;

public class Solution {
    //(', ')', '{', '}', '[' and ']',
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            switch (c) {
            case '(':
            case '[':
            case '{':
                stack.push(c);
                break;
            case ')':
            case ']':
            case '}':
                if (!stack.isEmpty() && c == map.get(stack.pop())) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

/** Solution
 *  基本思路：
 *      取第一个字符串的第一个字符，依次增加一个字符和所有字符串对比
 */
