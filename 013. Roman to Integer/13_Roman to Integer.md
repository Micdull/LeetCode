## 13. Roman to Integer
```
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
```
## 1. ***

### 复杂度
时间复杂度O(n)  <br>
空间复杂度O(1)

### 思路
- 把输入的罗马数字分段处理，分段相加。从左到右，一个个检测过去。设置 当前位current，上一位pre，分段值temp。

- 如果当前位对应的值和上一位的一样(current == pre)，
那么分段值加上当前值{temp += current;}。比如III = 3
- 如果当前位对应的值大于上一位的(current > pre)，
说明分段值应该是当前值减去现有的分段值{temp = current - temp;}。比如IIV = 5 – 2
- 如果当前位对应的值小于上一位的(current < pre)，
那么可以先将当前分段值加到结果中，重新开始记录分段值{result += temp;temp = current;}。
比如XI = 10 + 1

### 注意

