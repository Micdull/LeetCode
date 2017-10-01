/**
 * 1. Solution 02
 *  0). eclipse 测试通过，LeetCode不通过
 *  1). reverse 的數字可能大於Int 的最大存儲
 *      Integer.MAX_VALUE = 2147483647
 *      Integer.MIN_VALUE = -2147483648
 *  2). 使用 StringBuffer 的 reverse 方法，利用String 解决 int 的存储极限问题
 */

public class Solution {
	public static void main(String[] args) {
		System.err.println(123456789);
	}

	public static int resever(int x) {
		StringBuffer sb = new StringBuffer(Math.abs(x));
		String str = sb.reverse().toString();
		if (Long.parseLong(str) > Integer.MAX_VALUE) {
			return 0;
		}
		if (x < 0) {
			return (0 - Integer.parseInt(str));
		}
		return Integer.parseInt(str);
	}
}
