class Solution(object):
    def divideArray(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        n = len(nums)
        freq = {}
        for x in nums:
            freq[x] = freq.get(x,0)+1

        for i in freq:
            if (freq[i]%2!=0):
                return False
        return True

        