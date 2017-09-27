'''
Create Date : 2017-09-23 17:41:45
Runtime     : 85 ms
Descripton  :  
    1. 遍历一遍，更新左边界(左边界：找到已遍历的字符，更新左边界为当前位置的下一位).每次获取max长度.
    2. enumerate:
        enumerate() 函数用于将一个可遍历的数据对象(如列表、元组或字符串)组合为一个索引序列，
    同时列出数据和数据下标
        用法:
        enumerate(sequence, [start=0])
'''


class Solution(object):
    # @return an integer
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = 0
        result = 0
        dict = {}
        for i, ch in enumerate(s):
            if ch in dict and dict[ch] >= left #更新作边界
                left = dict[ch] + 1
            dict[ch] = i
            result = max(result, i - left + 1)#当前位置和历史max长度比较
        return result
