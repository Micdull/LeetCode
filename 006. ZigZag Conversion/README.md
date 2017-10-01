## 6. ZigZag Conversion (Medium)

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
```
string convert(string text, int nRows);
```
`convert("PAYPALISHIRING", 3)` should return `"PAHNAPLSIIGYIR"`.

---

## **分析**

- 直接模拟。
- 每  `2 * numRows - 2` 长度，循环一次，第一行和最后一行中间没有其他数，第 2 行到第 n-1 行，没一个循环之间有一个数。



## **参考资料**：
