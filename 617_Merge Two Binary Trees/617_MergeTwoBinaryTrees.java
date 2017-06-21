/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 解法同第二題，鏈表
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		return helper(t1, t2);
    }
	public TreeNode helper(TreeNode t1, TreeNode t2){
		if (t1 == null && t2 == null){
			return null;
		}
		if (t1 == null ) {
			t1 = new TreeNode(0);
		}
		if (t2 == null) {
			t2 = new TreeNode(0);
		}
		TreeNode curr = new TreeNode(t1.val + t2.val);
		curr.left = helper(t1.left, t2.left);
		curr.right = helper(t1.right, t2.right);
		return curr;
	}
}
