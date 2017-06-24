## 617. Merge Two Binary Trees

Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

#### Example 1:
```
Input:
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                
        
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
```
Note: The merging process must start from the root nodes of both trees.



## 1. 栈法

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(n)

### 思路
最括号压栈，右括号出栈。 <br>
这里不用担心连续不同种类左括号的问题，因为有效的括号对最终还是会有紧邻的括号对.左右括号是成对，相反顺序出现的。

### 注意
出栈 `stack.pop()` 的时候有 `EmptyStackException` 异常.

