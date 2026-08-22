class Solution(object):
    def checkDivisibility(self, n):
        """
        :type n: int
        :rtype: bool
        """
        org = n
        digitsum = 0
        digitProd = 1
        while (n!=0):
            dig = n%10
            digitsum = digitsum + dig
            digitProd = digitProd*dig
            n = n//10

        if (org%(digitsum+digitProd) == 0):
            return True
        else:
            return False
        