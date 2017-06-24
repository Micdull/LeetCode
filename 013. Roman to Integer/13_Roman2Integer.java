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


/** Solution
 *  基本思路：
 *  把输入的罗马数字分段处理，分段相加。从左到右，一个个检测过去。
 *  设置 当前位current，上一位pre，分段值temp。
 *
 *  如果当前位对应的值和上一位的一样(current == pre)，
 *  那么分段值加上当前值{temp += current;}。比如III = 3
 *
 *  如果当前位对应的值大于上一位的(current > pre)，
 *  说明分段值应该是当前值减去现有的分段值{temp = current - temp;}。
 *  比如IIV = 5 – 2
 *
 *  如果当前位对应的值小于上一位的(current < pre)，
 *  那么可以先将当前分段值加到结果中，重新开始记录分段值{result += temp;temp = current;}。
 *  比如XI = 10 + 1
 */
