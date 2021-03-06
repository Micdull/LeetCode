# -*- coding:utf-8 -*-

# two-pointer
# 两个指针，从两像中间靠拢


class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        left, right = 0, len(numbers) -1
        while left < right:
            sum = numbers[left] + numbers[right]
            if sum == target:
                return [left+1, right+1]
            elif sum > target:
                right -= 1
            else:
                left += 1
