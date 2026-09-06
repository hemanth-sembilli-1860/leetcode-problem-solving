class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1) return 0;
        int n = nums.length;
        int i = 0;
        int j = 0;
        int c = 0;
        int prod = 1;
        while (i<n){
            prod *= nums[i];
            while (prod>=k){
                prod = prod/nums[j];
                j++;
            }
                c += i-j+1;
            i++;
        }
        return c;
    }
}