# -*- coding:utf-8 -*-

# 字典  key：value
# dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'}


class Solution:
    # @return a tuple, (index1, index2)
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        process = {}
        for index in range(0, len(nums)):
            if target - nums[index] in process:
                return [process[target - nums[index]], index]
            process[nums[index]] = index
