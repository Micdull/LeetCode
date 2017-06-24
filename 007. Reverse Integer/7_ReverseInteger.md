## 7. Reverse Integer 反转整数

Reverse digits of an integer.
### Example:
```
Example1: x = 123, return 321
Example2: x = -123, return -321
```
#### Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

## 1. 模十法

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路
通过对数字模十取余得到它的最低位

### 注意
整数相加，检查溢出有这么几种办法：

- 两个正数数相加得到负数，或者两个负数相加得到正数，但某些编译器溢出或优化的方式不一样
- 对于正数，如果最大整数减去一个数小于另一个数，或者对于负数，最小整数减去一个数大于另一个数，则溢出。这是用减法来避免加法的溢出。
- 使用long来保存可能溢出的结果，再与最大/最小整数相比较


## 2. 字符串法

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(n)

### 思路
先将数字转化为字符串，然后将字符串倒序输出，并转回数字

### 注意
注意使用long接受可能溢出的记过