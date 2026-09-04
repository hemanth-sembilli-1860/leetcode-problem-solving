class Solution(object):
    def firstStableIndex(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n = len(nums)
        for i in range(0,n):
            minimum = float('inf')
            maximum = float('-inf')
            for j in range(0,i+1):
                maximum = max(maximum,nums[j])
            for j in  range(i,n):
                minimum = min(minimum,nums[j])
            stability_score = maximum-minimum
            if (stability_score<=k):
                return i
        return -1
                
        