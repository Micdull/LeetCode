/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *        val = x;
 *        next = null;
 *     }
 * }
 * 递归写法 Recursive
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, 0);
    }

    public ListNode helper(ListNode l1, ListNode l2, int carry){
        if (l1 == null && l2 == null) {//同时为空，carry进位到下一个节点
            return carry == 0 ? null : new ListNode(carry);
        }
        if (l1 == null && l2 != null) {//l1为空，补0
            l1 = new ListNode(0);
        }
        if (l1 != null && l2 == null ) {//l2为空，补0
            l2 = new ListNode(0);
        }
        int sum = l1.val + l2.val + carry;
        ListNode curr = new ListNode(sum % 10);//计算当前位
        curr.next = helper(l1.next, l2.next, sum / 10 );
        return curr;
    }
}

public ListNode helper(ListNode l1, ListNode l2, int carry){
    if (l1 == null) {//l1为空，补0
        l1 = new ListNode(0);
    }
    if (l1 != null) {//l2为空，补0
        l2 = new ListNode(0);
    }
    int sum = l1.val + l2.val + carry;
    ListNode curr = new ListNode(sum % 10);//计算当前位
    curr.next = helper(l1.next, l2.next, sum / 10 );
    return curr;
}
