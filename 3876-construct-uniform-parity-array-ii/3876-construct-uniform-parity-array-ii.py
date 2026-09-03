class Solution(object):
    def uniformArray(self, nums1):
        """
        :type nums1: List[int]
        :rtype: bool
        """
        n = len(nums1)
        minimum = float('inf')
        for i in range(0,n):
            minimum = min(minimum,nums1[i])
        if (minimum%2 != 0):
            return True
        else:
            for i in range(0,n):
                if (nums1[i]%2!=0):
                    return False
        return True

        