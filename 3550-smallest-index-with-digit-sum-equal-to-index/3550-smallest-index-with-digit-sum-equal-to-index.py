class Solution(object):
    def digitsum(self,j):
        total = 0
        while (j!=0):
            dig = j%10
            total += dig
            j //= 10
        return total

    def smallestIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        for i in range(0,n):
            if (self.digitsum(nums[i])==i):
                return i
        return -1