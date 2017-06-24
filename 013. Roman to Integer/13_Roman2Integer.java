public class Solution {
    public int romanToInt(String s) {
        if (s.length() < 1) {
            return 0;
        }
        int current = 0;//当前位
        int pre = singleRomanToInt(s.charAt(0));//前一位
        int temp = pre;//临时值
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            current = singleRomanToInt(s.charAt(i));
            if (current == pre) {
                temp = temp + pre;
            } else if (current > pre) {
                temp = current - temp;
            } else {
                result += temp;//确定 current < pre 时，将结果加入 result 中
                temp = current;
            }
            pre = current;
        }
        result += temp;
        return result;
    }

    /**
     * @param c sigle roman
     * @return int
     */
    public int singleRomanToInt(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }
}

