# 27. Remove Element
```
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
```


## 1.截取字符串

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路
- 题目应该是要求实现 String.indexOf(String s1, String s2)
-  `haystack.substring(i, l2 + i).equals(needle)`

### 注意
**

