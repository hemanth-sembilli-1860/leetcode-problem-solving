class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int prefix = nums[0];
        for (int i = 1;i<n;i++){
            if (nums[i]>nums[i-1]){
                prefix += nums[i];
            }
            else {
                prefix = nums[i];
            }
            max = Math.max(max,prefix);
        }
        return max;
    }
}