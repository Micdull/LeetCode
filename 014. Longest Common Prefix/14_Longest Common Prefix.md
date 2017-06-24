## 14. Longest Common Prefix
```
Write a function to find the longest common prefix string amongst an array of strings.
```

## 1. 栈法

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(n)

### 思路
最括号压栈，右括号出栈。 <br>
这里不用担心连续不同种类左括号的问题，因为有效的括号对最终还是会有紧邻的括号对.左右括号是成对，相反顺序出现的。

### 注意
出栈 `stack.pop()` 的时候有 `EmptyStackException` 异常.

