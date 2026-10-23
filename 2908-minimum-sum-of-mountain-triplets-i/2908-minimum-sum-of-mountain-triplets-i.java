class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = nums[0];
        for (int i = 1;i<n;i++){
            prefix[i] = Math.min(prefix[i-1],nums[i]);
        }
        suffix[n-1] = nums[n-1];
        for (int i = n-2;i>=0;i--){
            suffix[i] = Math.min(suffix[i+1],nums[i]);
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 1;j<n-1;j++){
            if (prefix[j-1]<nums[j] && suffix[j+1]<nums[j]){
                sum = nums[j]+prefix[j-1]+suffix[j+1];
                min = Math.min(min,sum);
            }
        }
        if (min == Integer.MAX_VALUE){
            return -1;
        }
        else {
            return min;
        }
    }
}