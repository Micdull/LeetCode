## 5. Longest Palindromic Substring

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
### **Example1**:
```
Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
```
### **Example2**:
```
Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
```
### **Similar Questions** 
- Shortest Palindrome 
- Palindrome Permutation 
- Palindrome Pairs 
- Longest Palindromic Subsequence 
- Palindromic Substrings 
---

## **分析**

回文的解法有不少：

1. 暴力搜索 O(n^3)
2. 动态规划 O(n^2)， dp[i][j] = dp[i + 1][j - 1] (if s[i] == s[j])
3. 用 [Manacher's ALGORITHM](http://blog.csdn.net/liuwei0604/article/details/50414542) 可达到 O(n) 时间。

需要注意的是， Python 和 Java 的字符串和 C++ 的不一样，没有 `\0`  结尾，用 `Manacher's ALGORITHM` 的时候是不一样的。

## **参考资料**：
http://blog.csdn.net/liuwei0604/article/details/50414542
http://www.cnblogs.com/bitzhuwei/p/Longest-Palindromic-Substring-Par-I.html
http://www.cnblogs.com/bitzhuwei/p/Longest-Palindromic-Substring-Part-II.html