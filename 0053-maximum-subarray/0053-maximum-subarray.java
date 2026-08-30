class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int suffixSum = 0;
        int prefixSum = 0;
        for (int i = 0;i<n;i++){
            prefixSum += nums[i];
            suffixSum += nums[n-1-i];
            max = Math.max(max,Math.max(prefixSum,suffixSum));
            if (prefixSum < 0) {
                prefixSum = 0;
            }

            if (suffixSum < 0) {
                suffixSum = 0;
            }
        }
        return max;
    }
}