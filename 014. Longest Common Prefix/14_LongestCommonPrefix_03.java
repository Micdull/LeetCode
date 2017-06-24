public class Solution {
	public String longestCommonPrefix2(String[] strs) {
		if (strs.length == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (String str : strs) {
				if (str.length() < i + 1 || str.charAt(i) != c)
					return sb.toString();
			}
			sb.append(c);
		}
		return sb.toString();
	}
}