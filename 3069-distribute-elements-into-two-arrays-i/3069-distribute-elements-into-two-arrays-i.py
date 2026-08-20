class Solution(object):
    def resultArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        ds1 = []
        ds2 = []
        ds1.append(nums[0])
        ds2.append(nums[1])
        for i in range(2,n):
            if (ds1[-1]>ds2[-1]):
                ds1.append(nums[i])
            else:
                ds2.append(nums[i])

        ds = ds1+ds2

        return ds

        