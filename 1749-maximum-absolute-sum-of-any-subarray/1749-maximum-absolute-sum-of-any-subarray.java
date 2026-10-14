class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int prefixSum = 0;
        int suffixSum = 0;
        for (int i = 0;i<n;i++){
            if (prefixSum<0){
                prefixSum = 0;
            }
            if (suffixSum>0){
                suffixSum = 0;
            }
            prefixSum += nums[i];
            suffixSum += nums[n-i-1];
            max = Math.max(max,Math.max(prefixSum,suffixSum));
            min = Math.min(min,Math.min(prefixSum,suffixSum));
        }
        return Math.max(max,Math.abs(min));
    }
}
