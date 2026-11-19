class Solution(object):
    def minimizeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        nums.sort()
        option1 = abs(nums[n-1]-nums[2])
        option2 = abs(nums[n-3]-nums[0])
        option3 = abs(nums[n-2]-nums[1])
        #1,4,5,7,8
        return min(option1,min(option2,option3))