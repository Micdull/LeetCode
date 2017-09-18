# -*- coding:utf-8 -*-

# 字典  key：value
# dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'}

# dictionary
class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict = {}
        for i in range(0, len(numbers)):
            if target - numbers[i] in dict:
                return [dict[target - numbers[i]] + 1, i + 1]
            dict[numbers[i]] = i
