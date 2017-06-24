## 14. Longest Common Prefix
```
Write a function to find the longest common prefix string amongst an array of strings.
```

## 1. 逐个字符增加比较

### 复杂度
时间复杂度O()  <br>
空间复杂度O()

### 基本思路
1. 取第一个字符串第一个字符，和其他字符对比，出现不匹配的，false。<br>
2. 全部匹配之后，字符往后加一位，接着和其他的对比。<br>
3. 找到最长的字符。

### 注意
出现不匹配的时候，要返回上一次对比的字符串

```
prefix = prefix + String.valueOf(strs[0].charAt(times));
```


## 2. 字符串递减比较

### 复杂度
时间复杂度O()  <br>
空间复杂度O()

### 基本思路
取第一个字符串，逐个字符串递减对比，找出最长

### 注意


## 3. 字符串比较

### 复杂度
时间复杂度O()  <br>
空间复杂度O()

### 基本思路
取第一个字符串，逐个字符串递减对比，找出最长

### 注意



