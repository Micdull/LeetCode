## 1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

#### Example:
<pre>
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
</pre>

#### Similar Questions 
- 3Sum 
- 4Sum 
- Two Sum II - Input array is sorted 
- Two Sum III - Data structure design 
- Subarray Sum Equals K 
- Two Sum IV - Input is a BST 
---

## 1. 暴力法 Brute Force

### 复杂度
时间复杂度O(n^2)  <br>
空间复杂度O(1)

### 思路
通过双重循环遍历数组中所有元素的两两组合，当出现符合的和时返回两个元素的下标

### 注意
内层循环要从外层循环下标加一开始，避免遍历到两个相同的元素

## 2. 哈希表 Hash Table

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路
1. 第一次遍历数组先将所有 `元素` 和它的 `下标` 作为 `key-value` 对存入Hashmap中.<br>
2. 第二次遍历数组时根据目标和与当前元素之差，在Hashmap中找相应的差值。如果存在该差值，说明存在两个数之和是目标和。此时记录下当前数组元素下标并拿出Hashmap中数组元素下标即可。
3. Hashmap获取元素的时间复杂度是O(1)，所以总的时间复杂度仍不超过O(n)。

### 注意
- 判定是否存在该差值时，要同时判断该差值的下标是不是当前遍历的元素下标，以避免重复

