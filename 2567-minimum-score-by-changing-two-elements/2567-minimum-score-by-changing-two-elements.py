class Solution(object):
    def minimizeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        nums.sort()
        option1 = nums[n-1]-nums[2]
        option2 = nums[n-3]-nums[0]
        option3 = nums[n-2]-nums[1]
        #1,4,5,7,8
        return min(option1,option2,option3)