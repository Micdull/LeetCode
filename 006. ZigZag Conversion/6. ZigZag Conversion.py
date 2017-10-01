'''
Create Date : 2017-09-30 15:19:15
Description :
    1. 每  2 * numRows - 2 循环一次，
    2. range(i, j, step): 表示从 i 到 j 每间隔 step 
    3. ret = s[::step]
'''


class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if(numRows == 1 or numRows >= len(s)):
            return s  
        step = 2 * numRows - 2
        # first row
        ret = s[::step] 
        for i in range(1, numRows - 1):
            for j in range(i, len(s), step): 
                ret += s[j]
                if j + step - 2 * i < len(s):
                    ret += s[j + step - 2 * i]
        # last row
        ret += s[numRows-1::step] 
        return ret

            
            
