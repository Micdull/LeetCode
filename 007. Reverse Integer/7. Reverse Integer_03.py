'''
Create Date : 2017-10-01 09:46:17
Description :
    1.转化为字符串，再反转
'''


class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
   	"""
	revx = int(str(abs(x))[::-1])
        if revx > math.pow(2, 31):
            return 0
        else:
            return revx * cmp(x, 0)
