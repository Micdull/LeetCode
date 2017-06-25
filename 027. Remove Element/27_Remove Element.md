# 27. Remove Element
```
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
```
### Example:
```
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
```

## 1. 双指针法

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路

**将不重复的序列存到数列前面.** 
- 同第26题
- 用两个指针，快指针指向当前数组遍历到的位置，慢指针指向不重复序列下一个存放的位置。

### 注意
**

