public class Solution {
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
 *  1 .reverse 的數字可能大於Int 的最大存儲
 *      Integer.MAX_VALUE = 2147483647
 *      Integer.MIN_VALUE = -2147483648
 *  2.存儲空間應當大於輸出值
 *      long rtn = 0
 */
