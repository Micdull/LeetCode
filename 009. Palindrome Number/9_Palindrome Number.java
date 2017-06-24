public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (reverse(x) == x) {
            return true;
        }
        return false;
    }

    public int reverse(int x) {
        long rtn = 0;//存儲應大於需要保存的數值
        while(x != 0){
            rtn = 10 * rtn + x % 10;
            x = x / 10;
            if( rtn > Integer.MAX_VALUE || rtn < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) rtn;
    }
}


/** Solution
 *  1 .参考 第7题（reverse integer）
 *      注意溢出，
 *  2. 负数不是回文数
 *  3. 不可以借助辅助空间。即要求空间复杂度为O(1)。如果把int转换为字符串，那么空间复杂度就不符合要求了。
 *
 */
