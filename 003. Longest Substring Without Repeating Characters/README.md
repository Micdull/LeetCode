## 3. Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

#### Example:
```javascript
Given `abcabcbb`, the answer is `abc`, which the length is 3.

Given `bbbbb`, the answer is `b`, with the length of 1.

Given `pwwkew`, the answer is `wke`, with the length of 3. Note that the answer must be a substring, `pwke` is a subsequence and not a substring.
```

## 1. hash，双指针

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O()

### 思路
利用map 的key值唯一的特性，分别将字符放入map中，每次记录新的大于之前的子串长度，有重复时，清除map




## 2. 方法1的优化

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路
the basic idea is, keep a hashmap which stores the characters in string as keys and their positions as values, and keep two pointers which define the max substring. move the right pointer to scan through the string , and meanwhile update the hashmap. If the character is already in the hashmap, then move the left pointer to the right of the same character last found. <br>
Note that the two pointers can only move forward.

### 注意
注意边界