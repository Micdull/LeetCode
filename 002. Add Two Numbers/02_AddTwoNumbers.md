## 2. Add Two Numbers 链表数相加
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

#### Example:
<pre>
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
</pre>


## 1. 递归写法 Recursive

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(n)

### 思路
按加法原理从末尾到首位，对每一位对齐相加。进位值默认0。
- 全部为null时，返回进位值
- 有一个为null时，返回不为null的那个ListNode和进位相加的值
- 都不为null时，返回 两个ListNode和进位相加的值

### 注意
- 注意判断进位    


## 2. 迭代写法 Iterative

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路
过程同样是对齐相加，不足位补0。迭代终止条件是两个ListNode都为null。

### 注意
- 迭代方法操作链表的时候要记得手动更新链表的指针到next
- 迭代方法操作链表时可以使用一个dummy的头指针简化操作
- 不可以在其中一个链表结束后直接将另一个链表串接至结果中，因为可能产生连锁进位
