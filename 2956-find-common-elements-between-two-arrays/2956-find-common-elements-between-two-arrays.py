class Solution(object):
    def findIntersectionValues(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        arr = []
        set1 = set()
        set2 = set()
        for i in nums1:
            set1.add(i)
        for j in nums2:
            set2.add(j)
        left = 0
        right = 0
        for i in nums1:
            if (i in set2):
                left = left + 1
        for i in nums2:
            if i in set1:
                right = right+1  
        arr.append(left)
        arr.append(right)
        return arr
        