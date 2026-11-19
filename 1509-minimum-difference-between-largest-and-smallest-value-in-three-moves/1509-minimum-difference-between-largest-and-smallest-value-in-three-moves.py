class Solution(object):
    def minDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n = len(nums)
        if (n<=4):
            return 0
        opt1 = nums[n-4]-nums[0]
        opt2 = nums[n-3]-nums[1]
        opt3 = nums[n-2]-nums[2]
        opt4 = nums[n-1]-nums[3]
        return min(opt1,opt2,opt3,opt4)
        